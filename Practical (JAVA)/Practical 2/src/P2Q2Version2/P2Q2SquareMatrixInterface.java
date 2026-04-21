/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2Q2Version2;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public interface P2Q2SquareMatrixInterface {

    int[][] getSquareMatrix();

    void setSquareMatrix(int[][] SquareMatrix);

    boolean makeEmpty(int m);

    boolean storeValue(int i, int j, int value);

    boolean add(P2Q2SquareMatrixInterface SquareMatrixInterfaceAdd);

    P2Q2SquareMatrixInterface copy(P2Q2SquareMatrixInterface SquareMatrix1, P2Q2SquareMatrixInterface SquareMatrix2);

    String toString();
}
