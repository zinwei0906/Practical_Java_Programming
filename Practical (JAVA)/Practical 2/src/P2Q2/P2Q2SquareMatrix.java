package P2Q2;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class P2Q2SquareMatrix implements P2Q2SquareMatrixInterface {

    int[][] SquareMatrix=new int [3][3];

    public P2Q2SquareMatrix() {
    }

    public P2Q2SquareMatrix(int[][] SquareMatrix) {
        this.SquareMatrix = SquareMatrix;
    }

    public int[][] getSquareMatrix() {
        return SquareMatrix;
    }

    public void setSquareMatrix(int[][] SquareMatrix) {
        this.SquareMatrix = SquareMatrix;
    }

    public void makeEmpty(int m) {
        for (int row = 0; row < m; row++) {
            for (int column = 0; column < m; column++) {
                this.SquareMatrix[row][column] = 0;
            }
        }

    }

    public void storeValue(int i, int j, int value) {
        this.SquareMatrix[i - 1][j - 1] = value;
    }

    public int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] AddMatrix = new int[3][3];
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                AddMatrix[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }
        return AddMatrix;
    }

    public void copy(int[][] matrix1, int[][] matrix2) {
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                matrix2[row][column] = matrix1[row][column];
            }
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (int row = 0; row < SquareMatrix.length; row++) {
            for (int column = 0; column < SquareMatrix[row].length; column++) {
                output += SquareMatrix[row][column] + "\t";
            }
            output += "\n";
        }
        return output;
    }

}
