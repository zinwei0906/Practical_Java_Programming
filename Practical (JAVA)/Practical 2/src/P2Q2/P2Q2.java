package P2Q2;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class P2Q2 {

    public static void main(String[] args) {
        P2Q2SquareMatrixInterface SquareMatrix1 = new P2Q2SquareMatrix();
        P2Q2SquareMatrixInterface SquareMatrix2 = new P2Q2SquareMatrix();
        P2Q2SquareMatrixInterface SquareMatrix3 = new P2Q2SquareMatrix();
        P2Q2SquareMatrixInterface SquareMatrix4 = new P2Q2SquareMatrix();
        int[][] firstMatrix = {{2, 3, 4}, {5, 2, 3}};
        int[][] secondMatrix = {{-4, 5, 3}, {5, 6, 3}};
        int [][] thirdMatrix=SquareMatrix1.add(firstMatrix, secondMatrix);
        SquareMatrix1.makeEmpty(2);
        SquareMatrix2.storeValue(1, 1, 10);
        SquareMatrix2.storeValue(2, 2, 5);
        SquareMatrix3.copy(thirdMatrix, SquareMatrix3.getSquareMatrix());
        SquareMatrix4.copy(firstMatrix, SquareMatrix4.getSquareMatrix());
        System.out.println(SquareMatrix1.toString());
        System.out.println(SquareMatrix2.toString());
        System.out.println(SquareMatrix3.toString());
        System.out.println(SquareMatrix4.toString());
    }

}
