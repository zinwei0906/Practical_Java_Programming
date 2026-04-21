
package Testing;

import P5Q1.ADT.LinkedStack;
import P5Q1.ADT.StackInterface;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class TestLikedStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackInterface<String> stack1 = new LinkedStack<>();
        stack1.push("queue123");
        stack1.push("queue111");
        System.out.println("Stack 1 : " + stack1.peek());
        System.out.println("Stack 1 : " + stack1.pop());
        System.out.println("Stack 1 : " + stack1.peek());
    }
    
}
