package P3Q1;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class P3Q1Algorithm {

    public static long AlgorithmA(long n) {
        long sum = 0;
        for (int number = 1; number <= n; number++) {
            sum += number;
        }
        return sum;
    }

    public static long AlgorithmB(long n) {
        long sum = 0;
        for (int number = 1; number <= n; number++) {
            for (int num = 1; num <= number; num++) {
                sum += 1;
            }
        }
        return sum;
    }

    public static long AlgorithmC(long n) {
        long sum = n * (n + 1) / 2;
        return sum;
    }

}
