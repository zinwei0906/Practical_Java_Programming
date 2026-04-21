package P1Q5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class P1Q5 {

    public static String checkPalindrome(String world) {
        Stack<Character> stack = new Stack<Character>();
        Queue<Character> queue = new LinkedList<Character>();
//        Queue<Character> queue = new ArrayBlockingQueue<Character>(100);
        while (world.length() != 0) {
            if (Character.isLetter(world.charAt(0))) {
                //Change all the character become lower case
                stack.push(Character.toLowerCase(world.charAt(0)));
                queue.offer(Character.toLowerCase(world.charAt(0)));
            }
            //Change the first char of string become null
            world = world.replaceFirst(String.valueOf(world.charAt(0)), "");
        }

        while (!queue.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                return "It Not a Palindrome";
            }
        }

        return "It is Palindrome";
    }

    public static void main(String[] args) {
        System.out.println("1. Race car = " + checkPalindrome("Race car"));
        System.out.println("2. A man, a plan, a canal: Panama! = " + checkPalindrome("A man, a plan, a canal: Panama!"));
        System.out.println("3. Testing = " + checkPalindrome("Testing"));
    }

}
