/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P6Q1;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class CountUp {

    public static void countUp(int n) {
        if (n >= 1) {
            countUp(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        countUp(10);
    }

}
