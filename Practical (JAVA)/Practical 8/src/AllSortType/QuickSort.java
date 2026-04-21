/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllSortType;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class QuickSort {

    public static <T extends Comparable<T>> void quickSort(T[] a, int n) {
        quickSort(a, 0, n - 1);
    }

    // recursive private overloaded method quickSort() 
    private static <T extends Comparable<T>> void quickSort(T[] a, int first, int last) {
        if (first < last) {
            int pivotIndex = partition(a, first, last);
            quickSort(a, first, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, last);
        }
    }

    // private method partition() - to partition the array based on the pivot value
    private static <T extends Comparable<T>> int partition(T[] a, int first, int last) {
        int pivotIndex = last;
        T pivot = a[last];
        int indexFromLeft = first;
        int indexFromRight = last - 1;
        boolean done = false;

        while (!done) {
            while (indexFromLeft < last && a[indexFromLeft].compareTo(pivot) < 0) {
                indexFromLeft++;
            }

            while (indexFromRight > first && a[indexFromRight].compareTo(pivot) > 0) {
                indexFromRight--;
            }
            System.out.println("\nIndex Form Left : " + indexFromLeft + "\tIndex Form Right : " + indexFromRight);
            if (indexFromLeft < indexFromRight) {
                swap(a, indexFromLeft, indexFromRight);
                indexFromLeft++;
                indexFromRight--;
                //System.out.println();
                //Step 2
                printArray(a);
            } else {
                done = true;
            }
        }
        swap(a, pivotIndex, indexFromLeft);
        pivotIndex = indexFromLeft;
        //Step 1
        printArray(a);
        return pivotIndex;
    }

    private static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static <T> void printArray(T[] a) {
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] numberArray = {3, 5, 0, 4, 6, 1, 2, 4};
        System.out.print("Before QuickSort(): ");
        printArray(numberArray);
        quickSort(numberArray, numberArray.length);
        System.out.print("After QuickSort(): ");
        printArray(numberArray);
    }

}
