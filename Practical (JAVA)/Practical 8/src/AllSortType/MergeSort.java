package AllSortType;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class MergeSort {

    public static void mergeSort(int[] a, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(a, first, mid);
            mergeSort(a, mid + 1, last);
            display(a, last);
            merge(a, first, mid, last);
        }
    }

    public static void merge(int arr[], int left, int mid, int right) {

        int len1 = mid - left + 1;
        int len2 = right - mid;

        int leftArr[] = new int[len1];
        int rightArr[] = new int[len2];

        for (int i = 0; i < len1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < len2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i, j, k;
        i = 0;
        j = 0;
        k = left;

        while (i < len1 && j < len2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < len1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < len2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

//    public static void merge(int[] a, int[] tempArray, int first, int mid, int last) {
//        int beginHalf1 = first;
//        int beginHalf2 = mid + 1;
//        int endHalf1 = mid;
//        int endHalf2 = last;
//
//        int index = 0;
//        while (beginHalf1 <= endHalf1 && beginHalf2 <= endHalf2) {
//            if (a[beginHalf1] < a[beginHalf2]) {
//                tempArray[index] = a[beginHalf1];
//                beginHalf1 += 1;
//            } else {
//                tempArray[index] = a[beginHalf2];
//                beginHalf2 += 1;
//            }
//            index += 1;
//        }
//    }
    public static void display(int[] array, int n) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numberArray = {7, 5, 9, 3, 6, 0, 2, 4};
        System.out.print("Before QuickSort(): ");
        display(numberArray, numberArray.length);
        mergeSort(numberArray, 0, numberArray.length - 1);
        System.out.print("After QuickSort(): ");
        display(numberArray, numberArray.length);
    }

}
