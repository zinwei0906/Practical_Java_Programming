package P1Q4;

import java.util.Stack;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class P1Q4 {

    public static String Postfix(String expression) {
        Stack<Integer> stack = new Stack<Integer>();
        String convert = "";

        for (int number = 0; number < expression.length(); number++) {
            char character = expression.charAt(number);
            if (!Character.isDigit(expression.charAt(0))) {
                return "Invalid Postfix Expression!!! (First Digit Number Only Cant Be Digit Number Only)";
            }
            if (Character.isDigit(character)) {
                stack.push(character - '0');
            } else if (character == '+' || character == '-' || character == '*' || character == '/') {
                if (number + 1 != expression.length()) {
                    if (!Character.isDigit(expression.charAt(number + 1))) {
                        convert += " " + expression.charAt(number + 1) + " ";
                    }
                }
                if (stack.size() == 2) {
                    int SecondNumber = stack.pop();
                    int FirstNumber = stack.pop();
                    convert += "(" + FirstNumber + " " + character + " " + SecondNumber + ")";
                } else if (stack.size() == 1) {
                    int ThirdNumber = stack.pop();
                    convert += " " + character + " " + ThirdNumber + " ";
                }
            } else {
                return "Invalid Postfix Expression!!!";
            }
        }
        return convert;
    }

    public static void main(String[] args) {
        System.out.println("62+53*/ : " + Postfix("62+53*/"));
        System.out.println("62+5/ : " + Postfix("62+5/"));

    }

}
