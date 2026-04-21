package P1Q3;

import java.util.Stack;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class P1Q3 {

    public static Boolean checkBalance(String expression) {

        Stack<Character> stack = new Stack<Character>();
        for (int number = 0; number < expression.length(); number++) {
            char character = expression.charAt(number);

            switch (character) {
                case '(':
                case '[':
                case '{':
                    stack.push(character);
                    break;

                case ')':
                case ']':
                case '}':
                    if (stack.empty()) {
                        return false;
                    } else {
                        if (stack.peek().equals('(') && character == ')' || stack.peek().equals('[') && character == ']' || stack.peek().equals('{') && character == '}') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                    break;
            }
        }

        if (!stack.empty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String testing1 = "[123+123(123-123)";
        String testing2 = "[456+456(456-456)]";
        String testing3 = "))))))))";
        String testing4 = "()()(){}";
        String testing5 = "(][)";
        String testing6 = "[(6 + {9 - 7}) / {2 * (5 + 3)}]";

        System.out.println("1. [123+123(123-123) : " + checkBalance(testing1));
        System.out.println("2. [456+456(456-456)] : " + checkBalance(testing2));
        System.out.println("3. )))))))) : " + checkBalance(testing3));
        System.out.println("4. ()()(){} : " + checkBalance(testing4));
        System.out.println("5. (][) : " + checkBalance(testing5));
        System.out.println("6. [(6 + {9 - 7}) / {2 * (5 + 3)}] : " + checkBalance(testing6));
    }
}
