/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2Q2;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public interface P2Q2SquareMatrixInterface {

    int[][] getSquareMatrix();

    void setSquareMatrix(int[][] SquareMatrix);

    public void makeEmpty(int m);

    public void storeValue(int i, int j, int value);

    public int[][] add(int[][] matrix1, int[][] matrix2);

    public void copy(int[][] matrix1, int[][] matrix2);

    public String toString();
}
