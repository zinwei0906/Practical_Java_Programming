package P4Q1ADT;

import java.io.Serializable;
/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class ArraySet<T> implements SetInterface<T>{

    private T[] ArraySet;
    private int SizeArraySet;
    private static final int DefaultLength = 100;

    public ArraySet() {
        this(DefaultLength);
    }

    public ArraySet(int Size) {
        this.ArraySet = (T[]) new Object[Size];
        this.SizeArraySet = 0;
    }

    //1)Get and Return the (Integer)Size of Current ArraySet
    public int getSizeArraySet() {
        return SizeArraySet;
    }

    //2)Add the NewElement into the ArraySet,if add successfully will return true else return false
    public boolean add(T AddElement) {
        //Check if the AddElement already added into the Current ArraySet will return false
        if (contain(AddElement) == true) {
            return false;
        }
        //If ArraySet is full will auto expand the arraySet , make the Length of ArraySet is double old length
        if (isFull() == true) {
            ExpandArray();
        }
        //if the AddElement haven't add into the Current ArraySet will added
        this.ArraySet[this.SizeArraySet] = AddElement;
        //Add the size of Array Set +1 and return true
        this.SizeArraySet += 1;
        return true;
    }

    //3)Replace the Element By the position
    public boolean replace(int ReplacePosition, T ReplaceElement) {
        //If the Integer ReplacePosititon is out of range will return false
        if (validPosition(ReplacePosition) == false) {
            return false;
        }
        this.ArraySet[ReplacePosition - 1] = ReplaceElement;
        return true;
    }

    //4)Remove the element by Same Element and return true and false
    public boolean remove(T RemoveElement) {
        //Check the RemoveElement is contain element in the CurrentArraySet
        if (contain(RemoveElement) == false) {
            return false;
        }
        for (int number = 0; number < this.SizeArraySet; number++) {
            if (this.ArraySet[number].equals(RemoveElement)) {
                for (int num = number; num < this.SizeArraySet; num++) {
                    this.ArraySet[num] = this.ArraySet[num + 1];
                }
                this.SizeArraySet -= 1;
                return true;
            }
        }
        return false;
    }

    //5)Give the position return the Element
    public T getElement(int GetPosition) {
        if (validPosition(GetPosition) == false) {
            return null;
        }
        return this.ArraySet[GetPosition - 1];
    }

    //6)Remove All the element contain in SecondArraySet in CurrentArraySet
    public boolean removeAll(SetInterface SecondArraySet) {
        boolean bl = false;
        for (int number = 1; number <= SecondArraySet.getSizeArraySet(); number++) {
            if (contain((T) SecondArraySet.getElement(number)) == true) {
                bl = this.remove((T) SecondArraySet.getElement(number));
            }
        }
        return bl;
    }

    //7)Find the SameElement Between the CurrentArraySet and SecondArraySet
    public SetInterface retainAll(SetInterface SecondArraySet) {
        SetInterface<T> IntersectionSet = new ArraySet<T>(SecondArraySet.getSizeArraySet());
        for (int number = 1; number <= SecondArraySet.getSizeArraySet(); number++) {
            if (contain((T) SecondArraySet.getElement(number)) == true) {
                IntersectionSet.add((T) SecondArraySet.getElement(number));
            }
        }
        //Return All the Same Element 
        return IntersectionSet;
    }

    //8)Find the Element if contain(same) with the Element in CurrentArraySet will return true or false
    public boolean contain(T ContainElement) {
        for (int number = 0; number < this.SizeArraySet; number++) {
            if (this.ArraySet[number].equals(ContainElement)) {
                return true;
            }
        }
        return false;
    }

    //9)Clear All the Element in CurrentArraySet and set the size is 0
    public void clear() {
        this.SizeArraySet = 0;
    }

    //10)Clear the element is null in CurrentArraySet
    public void clearNullElement() {
        if (contain(null) == true) {
            remove(null);
        }
    }

    //11)Check the Current ArraySet is empty or not and return true or false
    public boolean isEmpty() {
        if (this.ArraySet.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Private(1)Check the Current ArraySet is full or not and return true or false
    private boolean isFull() {
        if (this.ArraySet.length == this.SizeArraySet) {
            return true;
        } else {
            return false;
        }
    }

    //Private(2)Expand the CurrentArraySet
    private void ExpandArray() {
        T[] ExpandArray = (T[]) new Object[this.ArraySet.length * 2];
        for (int number = 0; number < this.ArraySet.length; number++) {
            ExpandArray[number] = this.ArraySet[number];
        }
        this.ArraySet = ExpandArray;
    }

    //Private(3)Check if the Integer Position is out of the range 
    private boolean validPosition(int Position) {
        //If Position is less than or equal to 0 will return false
        if (Position <= 0) {
            return false;
        }
        //If the Position more than Size of the Current ArraySet will return false
        if (Position > this.SizeArraySet) {
            return false;
        }
        return true;
    }
}
