package P2Q2Version2;

import P2Q2.*;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class P2Q2 {

    public static void main(String[] args) {
        P2Q2SquareMatrixInterface SquareMatrix1 = new P2Q2SquareMatrix(3, 3);
        P2Q2SquareMatrixInterface SquareMatrix2 = new P2Q2SquareMatrix(3, 3);
        P2Q2SquareMatrixInterface SquareMatrix3 = new P2Q2SquareMatrix(4, 4);
        P2Q2SquareMatrixInterface SquareMatrix4 = new P2Q2SquareMatrix(5, 5);
        int[][] firstMatrix = {{2, 3, 4}, {5, 2, 3}};
        int[][] secondMatrix = {{-4, 5, 3}, {5, 6, 3}};
        SquareMatrix1.setSquareMatrix(firstMatrix);
        SquareMatrix2.setSquareMatrix(secondMatrix);
        SquareMatrix1.makeEmpty(2);
        SquareMatrix2.storeValue(1, 1, 10);
        SquareMatrix1.add(SquareMatrix2);
        SquareMatrix1.copy(SquareMatrix1,SquareMatrix4);
        System.out.println(SquareMatrix1.toString());
        System.out.println(SquareMatrix2.toString());
        System.out.println(SquareMatrix3.toString());
        System.out.println(SquareMatrix4.toString());
    }

}
