/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P6Q2;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class GCD {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;
        System.out.println("gcd(5, 10) = " + gcd(number1, number2));
        System.out.println("gcd(5, 10) is " + number1 / gcd(number1, number2) + "/" + number2 / gcd(number1, number2));
    }

}
