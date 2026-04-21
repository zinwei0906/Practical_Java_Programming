/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.util.Scanner;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class Q3a {

    public static String someMethod(String inputString) {
        StackInterface<Character> stack = new ArrayStack<>();
        for (int i = 0; i < inputString.length(); ++i) {
            char ch = inputString.charAt(i);
            if (Character.isLetter(ch)
                    && !stack.contains(Character.toUpperCase(ch))) {
                stack.push(Character.toUpperCase(ch));
            }
        }

        StringBuilder anotherString = new StringBuilder();
        while (!stack.isEmpty()) {
            anotherString.append(stack.pop());
        }
        return anotherString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        String anotherName = someMethod(name).substring(0, 5);
        System.out.println(anotherName);
        char[] array = new char[5];
        for (int i = 0; i < anotherName.length(); i++) {
            array[i] = anotherName.charAt(i);
            System.out.println(array[i]);
        }
    }

}
