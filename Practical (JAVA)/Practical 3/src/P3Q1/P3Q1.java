package P3Q1;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class P3Q1 {

    public static void main(String[] args) {
        int m = 10;

        System.out.println("\n\n===========");
        System.out.println("Algorithm A");
        System.out.println("===========");
        long startTime1 = System.nanoTime();
        long AlgorithmA = P3Q1Algorithm.AlgorithmA(m);
        System.out.println("Result: " + AlgorithmA);
        long endTime1 = System.nanoTime();
        long elapsedTime1 = endTime1 - startTime1;
        System.out.println("Execution time for Algorithm A: " + elapsedTime1 + " ms\n\n");

        System.out.println("===========");
        System.out.println("Algorithm B");
        System.out.println("===========");
        long startTime2 = System.nanoTime();
        long AlgorithmB = P3Q1Algorithm.AlgorithmB(m);
        System.out.println("Result: " + AlgorithmB);
        long endTime2 = System.nanoTime();
        long elapsedTime2 = endTime2 - startTime2;
        System.out.println("Execution time for Algorithm B: " + elapsedTime2 + " ms\n\n");

        System.out.println("===========");
        System.out.println("Algorithm C");
        System.out.println("===========");
        long startTime3 = System.nanoTime();
        long AlgorithmC = P3Q1Algorithm.AlgorithmC(m);
        System.out.println("Result: " + AlgorithmC);
        long endTime3 = System.nanoTime();
        long elapsedTime3 = endTime3 - startTime3;
        System.out.println("Execution time for Algorithm C: " + elapsedTime3 + " ms\n\n");
    }

}
