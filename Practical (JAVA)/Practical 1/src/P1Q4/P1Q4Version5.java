package P1Q4;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
import java.util.Stack;

public class P1Q4Version5 {

    public static String evaluate(int StringNumber, String left, String right, char operator) {
        String stringFormat = "";
        if (StringNumber == 1) {
            stringFormat = "(" + left + operator + right + ")";
        } else {
            stringFormat = left + operator + right;
        }
        switch (operator) {
            case '+':
            case '-':
            case '*':
            case '/':
                return stringFormat;
            default:
                return "Invalid Postfix Expression!!!";
        }
    }

    public static String convert(String expression) {

        Stack<String> stack = new Stack<>();
        String convert = "";
        for (int number = 0; number < expression.length(); number++) {
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
                double MultipleDigitNumber = 0;
                double realNumber = 0;
                while (Character.isDigit(character) && number != expression.length()) {
                    MultipleDigitNumber = MultipleDigitNumber * 10 + character - '0';
                    number++;
                    if (number == expression.length()) {
                        continue;
                    }
                    character = expression.charAt(number);
                    if (character == '.' && number != expression.length()) {
                        number++;
                        if (number == expression.length()) {
                            continue;
                        }
                        character = expression.charAt(number);
                        double numberX10 = 10;
                        while (Character.isDigit(character) && number != expression.length()) {
                            realNumber = realNumber + (double) (character - '0') / numberX10;
                            numberX10 *= 10;
                            number++;
                            if (number == expression.length()) {
                                continue;
                            }
                            character = expression.charAt(number);
                        }
                    }
                }
                number--;
                MultipleDigitNumber = MultipleDigitNumber + realNumber;
                if (realNumber == 0) {
                    stack.push("" + (int) MultipleDigitNumber);
                } else {
                    stack.push("" + MultipleDigitNumber);
                }
            } else if (character == '+' || character == '-' || character == '*' || character == '/') {
                int format = 1;
                if (number == expression.length() - 1 || number == expression.length() - 2) {
                    format = 0;
                }
                String stringRight = stack.pop();
                String stringLeft = stack.pop();
                if (stringRight.equals("0") && character == '/') {
                    return ("Number cannot divide by zero!!!");
                }
                stack.push(evaluate(format, stringLeft, stringRight, character));
            } else {
                return "Invalid Postfix Expression!!!";
            }
        }
        return "" + stack.pop();
    }

    public static void main(String[] args) {
        System.out.println("6 2+5 3*/  : " + convert("6 2 + 5 3 * / "));
        System.out.println("6.1 2.5 + 5.8 3.9 * /  : " + convert("6.1 2.5 + 5.8 3.9 * / "));
        System.out.println("6.1 0 / 5.8 3.9 * /  : " + convert("6.1 0 / 5.8 3.9 * / "));
        System.out.println("12 23+45 67*/ : " + convert("12 23 + 45 67 * / "));
        System.out.println("20 50 3 6 + * *: " + convert("20 50 3 6 + * * "));
        System.out.println("20 50 3 6 + * * 300 / 2 - : " + convert("20 50 3 6 + * * 300 / 2 - "));
        System.out.println("20 50 3 6 + * * 300 / 2 6 - : " + convert("20 50 3 6 + * * 300 / 2 6 - * "));
        System.out.println("20 50 3 6 3 6 + + + * * : " + convert("20 50 3 6 3 6 + + + * * "));
        System.out.println("20 50 3 6 3 6 a a + + + : " + convert("20 50 3 6 3 6 a a + + + "));
    }
}
