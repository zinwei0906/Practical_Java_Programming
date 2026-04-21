/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class Q1b {

    public static int findMin(int numArray[]) {
        return getMin(numArray, 0, numArray.length);
    }

    private static int getMin(int numArray[], int i, int n) {
        int num = (n == 1) ? numArray[i] : Math.min(numArray[i], getMin(numArray, i + 1, n - 1));
                System.out.println("i +="+i+" n="+n);
        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        int[] array = {10, -1, 25, 0};
        int min = findMin(array);
        System.out.println("Min Valie : " + min);
    }

}
