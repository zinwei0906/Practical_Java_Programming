package P1Q4;

import java.util.Stack;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class P1Q4Version2 {

    public static String Postfix(String expression) {
        //Integer stack1 to store all integer number
        Stack<Integer> stack1 = new Stack<Integer>();
        //String stack2 to store the integer number and +-*/
        Stack<String> stack2 = new Stack<String>();
        String convert = "";
        int reset = 0;

        for (int number = 0; number < expression.length(); number++) {
            try {
                char character = expression.charAt(number);
                //Only the first letter of character is not digit number will display error message
                if (!Character.isDigit(expression.charAt(0))) {
                    return "Invalid Postfix Expression!!! (First Digit Number Only Cant Be Digit Number Only)";
                }
                //If the character got space will skip
                if (Character.isSpaceChar(character)) {
                    continue;
                }

                if (Character.isDigit(character)) {
                    int MultipleDigitNumber = 0;
                    while (Character.isDigit(character) && number != expression.length()) {
                        MultipleDigitNumber = MultipleDigitNumber * 10 + character - '0';
                        number++;
                        if (number == expression.length()) {
                            continue;
                        }
                        character = expression.charAt(number);
                    }
                    number--;
                    stack1.push(MultipleDigitNumber);
                    reset = 0;
                } //If the character is +-*/ will in this if else
                else if (character == '+' || character == '-' || character == '*' || character == '/') {
                    while (!Character.isDigit(character) && number != expression.length()) {

                        //Store when the +-*/ is first getting or stack1 got more than 2 number 
                        if (convert == "" || stack1.size() >= 2) {

                            //Reset is to let 1 2 3 + * become 1*(2+3) ,add ( ).Become +-*/ do the ( ) first
                            if (reset == 0) {
                                stack2.push(")");
                            }
                            stack2.push(stack1.pop().toString());
                            stack2.push(String.valueOf(character));
                            stack2.push(stack1.pop().toString());
                            if (reset == 0) {
                                stack2.push("(");
                            }
                            //Let 1234++* store +2+1 then looping one more time become 4*3+2+1
                            if (number + 1 != expression.length()) {
                                char nextCharacter = expression.charAt(number + 1);
                                if (nextCharacter == '+' || nextCharacter == '-' || nextCharacter == '*' || nextCharacter == '/') {
                                    stack2.push(String.valueOf(nextCharacter));
                                    number++;
                                    reset = 1;
                                } else if (!Character.isDigit(nextCharacter)) {
                                    return "Invalid Postfix Expression!!!";
                                }
                            }
                        } // if the stack only 1 number will store in stack2 like this : 1+ or 2*
                        else if (stack1.size() == 1) {
                            stack2.push(stack1.pop().toString());
                            stack2.push(String.valueOf(character));
                        }
                        number++;
                        //If number already end will skip the looping
                        if (number == expression.length()) {
                            continue;
                        }
                        character = expression.charAt(number);
                    }
                    number--;

                    //use while looping to store all the digit number and +-*/ in stack2 and toString in the varable name convert
                    while (!stack2.isEmpty()) {
                        convert += stack2.pop();
                    }

                } else {
                    return "Invalid Postfix Expression!!!";
                }
            } catch (Exception ex) {
                return "Invalid Postfix Expression!!!";
            }
        }

        return convert;
    }

    public static void main(String[] args) {
        System.out.println("6 2+5 3*/  : " + Postfix("6 2+5 3*/"));
        System.out.println("12 23+45 67*/ : " + Postfix("12 23+45 67*/"));
        System.out.println("20 50 3 6 + * *: " + Postfix("20 50 3 6 +**"));
        System.out.println("20 50 3 6 + * * 300 / 2 - : " + Postfix("20 50 3 6 +**300/2-"));
        System.out.println("20 50 3 6 + * * 300 / 2 - : " + Postfix("20 50 3 6 +**300/2 6-*"));
        System.out.println("20 50 3 6 3 6 + + + * * : " + Postfix("20 50 3 6 3 6 +++**"));
        System.out.println("20 50 3 6 3 6 a a + + + : " + Postfix("20 50 3 6 3 6 aa+++"));

    }

}
