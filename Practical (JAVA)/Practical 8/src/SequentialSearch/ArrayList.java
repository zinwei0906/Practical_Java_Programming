package SequentialSearch;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class ArrayList<T> implements ListInterface<T> {

    private T[] ArrayList;
    private int SizeArrayList;
    private static final int DefaultLength = 100;

    public ArrayList() {
        this(DefaultLength);
    }

    public ArrayList(int Size) {
        this.ArrayList = (T[]) new Object[Size];
        this.SizeArrayList = 0;
    }

    public int getSizeArrayList() {
        return this.SizeArrayList;
    }

    public boolean add(T AddElement) {
        if (isFull() == true) {
            ExpandArray();
        }
        this.ArrayList[this.SizeArrayList] = AddElement;
        this.SizeArrayList += 1;
        return true;
    }

    public boolean add(int AddPosition, T AddElement) {
        if (validPosition(AddPosition) == false) {
            return false;
        } else {
            for (int number = this.SizeArrayList; number >= AddPosition; number--) {
                this.ArrayList[number] = this.ArrayList[number - 1];
            }
            this.ArrayList[AddPosition - 1] = AddElement;
            this.SizeArrayList += 1;
            return true;
        }
    }

    public T remove(int RemovePosition) {
        T RemoveElement = null;
        if (validPosition(RemovePosition) == false) {
            return RemoveElement;
        } else {
            RemoveElement = this.ArrayList[RemovePosition];
            for (int number = RemovePosition; number < this.SizeArrayList; number++) {
                this.ArrayList[number - 1] = this.ArrayList[number];
            }
            this.ArrayList[SizeArrayList - 1] = null;
            this.SizeArrayList -= 1;
            return RemoveElement;
        }
    }

    public void clear() {
        this.SizeArrayList = 0;
    }

    public boolean replace(int ReplacePosition, T ReplaceElement) {
        if (validPosition(ReplacePosition) == false) {
            return false;
        }
        this.ArrayList[ReplacePosition - 1] = ReplaceElement;
        return true;
    }

    public T getElement(int GetPosition) {
        if (validPosition(GetPosition) == false) {
            return null;
        }
        return this.ArrayList[GetPosition - 1];
    }

    public boolean contain(T ContainElement) {

        return SequentialSearch(0, this.SizeArrayList-1, ContainElement);
    }

    private boolean SequentialSearch(int first, int last, T desiredItem) {
        boolean found;
        if (first > last) {
            found = false;
        } else if (desiredItem.equals(this.ArrayList[first])) {
            found = true;
        } else {
            found = SequentialSearch(first + 1, last, desiredItem);
        }
        return found;
    }

    public boolean isEmpty() {
        if (this.ArrayList.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Private(1)Check the Current ArraySet is full or not and return true or false
    private boolean isFull() {
        if (this.ArrayList.length == this.SizeArrayList) {
            return true;
        } else {
            return false;
        }
    }

    //Private(2)Expand the CurrentArraySet
    private void ExpandArray() {
        T[] ExpandArray = (T[]) new Object[this.ArrayList.length * 2];
        for (int number = 0; number < this.ArrayList.length; number++) {
            ExpandArray[number] = this.ArrayList[number];
        }
        this.ArrayList = ExpandArray;
    }

    //Private(3)Check if the Integer Position is out of the range 
    private boolean validPosition(int Position) {
        if (Position <= 0) {
            return false;
        }
        if (Position > this.SizeArrayList) {
            return false;
        }
        return true;
    }

}
