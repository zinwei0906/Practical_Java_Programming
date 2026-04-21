package P2Q2Version2;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class P2Q2SquareMatrix implements P2Q2SquareMatrixInterface {

    private int[][] SquareMatrix;

    public P2Q2SquareMatrix() {
    }

    public P2Q2SquareMatrix(int row, int column) {
        this.SquareMatrix = new int[row][column];
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

    public boolean makeEmpty(int m) {

        if (0 < m && m <= SquareMatrix.length) {
//        this.SquareMatrix = new int[m][m];
            for (int row = 0; row < m; row++) {
                for (int column = 0; column < m; column++) {
                    this.SquareMatrix[row][column] = 0;
                }
            }
            return true;
        } else {
            return false;
        }

    }

    public boolean storeValue(int i, int j, int value) {
        if (0 < i && i <= SquareMatrix.length && 0 < j && j <= SquareMatrix[0].length) {
            this.SquareMatrix[i - 1][j - 1] = value;
            return true;
        } else {
            return false;
        }
    }

    public boolean add(P2Q2SquareMatrixInterface SquareMatrixInterfaceAdd) {
        for (int row = 0; row < this.SquareMatrix.length; row++) {
            for (int column = 0; column < this.SquareMatrix[row].length; column++) {
                int value = this.SquareMatrix[row][column] + SquareMatrixInterfaceAdd.getSquareMatrix()[row][column];
                this.storeValue(row + 1, column + 1, value);
            }
        }
        return true;
    }

    public P2Q2SquareMatrixInterface copy(P2Q2SquareMatrixInterface SquareMatrix1, P2Q2SquareMatrixInterface SquareMatrix2) {
        SquareMatrix2.setSquareMatrix(SquareMatrix1.getSquareMatrix());
//        for (int row = 0; row < this.SquareMatrix.length; row++) {
//            for (int column = 1; column < this.SquareMatrix[row].length; column++) {
//                this.storeValue(row, row, SquareMatrixInterfaceCopy.getSquareMatrix()[row][column]);
//            }
//        }
        return SquareMatrix1;
    }

    @Override
    public String toString() {
        String output = "";
        for (int row = 0; row < this.SquareMatrix.length; row++) {
            for (int column = 0; column < this.SquareMatrix[row].length; column++) {
                output += this.SquareMatrix[row][column] + "\t";
            }
            output += "\n";
        }
        return output;
    }

}
