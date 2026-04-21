package P8Q2;

import BinarySearch.*;

/**
 * SortedArrayList - Implements the ADT Sorted List using an array. - Note: Some
 * methods are not implemented yet and have been left as practical exercises
 */
public class SortedArrayList<T extends Comparable<T>> implements SortedListInterface<T> {

    private T[] array;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;

    public SortedArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public SortedArrayList(int initialCapacity) {
        numberOfEntries = 0;
        array = (T[]) new Comparable[initialCapacity];
    }

    public boolean add(T newEntry) {
        //Math.abs convert negative value to positif (- become +)
        int position = Math.abs(binarySearch(newEntry));
        makeRoom(position + 1);
        array[position] = newEntry;
        numberOfEntries++;
        return true;
    }

    public boolean remove(T anEntry) {
        if (this.numberOfEntries == 0) {
            return false;
        } else {
            int position = binarySearch(anEntry);
            if (position >= 0 && array[position].equals(anEntry)) {
                removeGap(position + 1);
                this.numberOfEntries -= 1;
                return true;
            }
            return false;
        }
    }

    public void clear() {
        numberOfEntries = 0;
    }

    public boolean contains(T anEntry) {
        int position = binarySearch(anEntry);
        if (position >= 0 && array[position].equals(anEntry)) {
            return true;
        } else {
            return false;
        }
    }

    private int binarySearch(T searchTarget) {
        int first = 0;
        int last = this.numberOfEntries - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (searchTarget.equals(array[mid])) {
                return mid;
            } else if (searchTarget.compareTo(array[mid]) < 0) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -(last + 1);

    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    public String toString() {
        String outputStr = "";
        for (int index = 0; index < numberOfEntries; ++index) {
            outputStr += array[index] + "\n";
        }

        return outputStr;
    }

    private boolean isArrayFull() {
        return numberOfEntries == array.length;
    }

    private void doubleArray() {
        T[] oldList = array;
        int oldSize = oldList.length;

        array = (T[]) new Object[2 * oldSize];

        for (int index = 0; index < oldSize; index++) {
            array[index] = oldList[index];
        }
    }

    private void makeRoom(int newPosition) {
        int newIndex = newPosition - 1;
        int lastIndex = numberOfEntries - 1;

        for (int index = lastIndex; index >= newIndex; index--) {
            array[index + 1] = array[index];
        }
    }

    private void removeGap(int givenPosition) {
        int removedIndex = givenPosition - 1;
        int lastIndex = numberOfEntries - 1;

        for (int index = removedIndex; index < lastIndex; index++) {
            array[index] = array[index + 1];
        }
    }

}
