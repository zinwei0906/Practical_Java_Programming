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
public class SelectionSort {

    //Recursive Algorithm for Selection Sort
//    public static void selectionSort(int[] a, int first, int last) {
//        if (first < last) {
//            int indexOfSmallest = first;
//            for (int number = first + 1; number < last + 1; number++) {
//                if (a[number] < a[indexOfSmallest]) {
//                    indexOfSmallest = number;
//                }
//            }
//            swap(a, first, indexOfSmallest);
//            System.out.print("After pass " + (first + 1) + ": ");
//            display(a, last);
//            selectionSort(a, first + 1, last);
//        }
//
//    }
    //Speed Average
    //Iterative Algorithm for Selection Sort
    public static void selectionSort(int[] a, int n) {
        for (int index = 0; index < n - 1; index++) {
            int indexOfSmallest = index;
            for (int number = index + 1; number < n; number++) {
                if (a[number] < a[indexOfSmallest]) {
                    indexOfSmallest = number;
                }
            }
            swap(a, index, indexOfSmallest);
            System.out.print("After pass " + (index + 1) + ": ");
            display(a, n);
        }
    }

    public static void swap(int[] array, int first, int second) {
        int temporary = array[first];
        array[first] = array[second];
        array[second] = temporary;
    }

    public static void display(int[] array, int n) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numberArray = {23, 78, 45, 8, 32, 56};
        System.out.print("Before SelectionSort(): ");
        display(numberArray, numberArray.length);
        selectionSort(numberArray, numberArray.length);
        //selectionSort(numberArray, 0, numberArray.length - 1);
        System.out.print("After SelectionSort(): ");
        display(numberArray, numberArray.length);
    }

}
