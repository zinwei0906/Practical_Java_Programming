package P3Q2Version2;

import P3Q1.*;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class P3Q1Algorithm {

    public static long AlgorithmA(long n) {
        long sum = 0;
        for (int number = 0; number < n; number++) {
            if (sum == 0) {
                sum = 1;
            } else {
                sum *= n;
            }
        }
        return sum;
    }

    public static long AlgorithmB(long n) {
        long sum = 1;
        for (int number = 1; number < n; number++) {
            for (int num = 1; num <= number; num++) {
                sum += num * 10;
            }
        }
        return sum;
    }

    public static long AlgorithmC(long n) {
        long sum = (n*n)^n;
        return sum;
    }

}
