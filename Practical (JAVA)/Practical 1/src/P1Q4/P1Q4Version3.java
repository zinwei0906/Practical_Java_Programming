package P1Q4;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
import java.util.Stack;

public class P1Q4Version3 {

    public static Double evaluate(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                if (a == 0) {
                    throw new UnsupportedOperationException("Number cannot divide by zero!!!");
                }
                return b / a;
        }
        return 0.0;
    }

    public static Double convert(String expression) {

        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == ' ') {
                continue;
            }

            if (c == '*' || c == '/' || c == '^' || c == '+' || c == '-') {
                double s1 = stack.pop();
                double s2 = stack.pop();
                double temp = evaluate(s1, s2, c);
                stack.push(temp);
            } else {
                double num = 0;

                while (Character.isDigit(c)) {
                    num = num * 10 + (c - '0');
                    i++;
                    c = expression.charAt(i);
                }
                i--;
                stack.push(num);
            }
        }
        double result = stack.pop();
        return result;
    }

    public static void main(String[] args) {
        String testing1 = "20 50 3 6 + * * 300 / 2 -";
        String testing2 = "6 2+5 3*/";
        String testing3 = "12 23 + 45 67 + + ";
        String testing4 = "20 50 3 6 + * *";
        System.out.println("\nPostfix Expression: " + testing1);
        System.out.println("Evaluation: " + convert(testing1));
        System.out.println("\nPostfix Expression: " + testing2);
        System.out.println("Evaluation: " + convert(testing2));
        System.out.println("\nPostfix Expression: " + testing3);
        System.out.println("Evaluation: " + convert(testing3));
        System.out.println("\nPostfix Expression: " + testing4);
        System.out.println("Evaluation: " + convert(testing4));
    }
}
