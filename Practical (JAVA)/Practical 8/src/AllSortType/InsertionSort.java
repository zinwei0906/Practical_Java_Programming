package AllSortType;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class InsertionSort {

    //Speed Faster
    public static void insertionSort(int[] a, int n) {
        for (int unsorted = 1; unsorted < n; unsorted++) {
            int firstUnsorted = a[unsorted];
            insertInOrder(firstUnsorted, a, unsorted - 1);
            System.out.print("After pass " + unsorted + ": ");
            display(a, n);
        }
    }

    public static void insertInOrder(int element, int[] a, int end) {
        int index = end;
        while ((index >= 0) && (element < a[index])) {
            a[index + 1] = a[index];//make room
            index -= 1;
        }
        a[index + 1] = element;//insert element
    }

    public static void display(int[] array, int n) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numberArray = {23, 78, 45, 8, 32, 56};
        System.out.print("Before InsertionSort(): ");
        display(numberArray, numberArray.length);
        insertionSort(numberArray, numberArray.length);
        System.out.print("After InsertionSort(): ");
        display(numberArray, numberArray.length);
    }

}
