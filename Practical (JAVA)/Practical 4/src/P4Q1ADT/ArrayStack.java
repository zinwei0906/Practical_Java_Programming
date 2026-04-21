package P4Q1ADT;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class ArrayStack<T> implements StackInterface<T> {

    private T[] ArrayStack;
    private int SizeArrayStack;
    private static final int DefaultLength = 100;

    public ArrayStack() {
        this(DefaultLength);
    }

    public ArrayStack(int Size) {
        this.ArrayStack = (T[]) new Object[Size];
        this.SizeArrayStack = 0;
    }

    public int getSizeArrayStack() {
        return this.SizeArrayStack;
    }

    public boolean push(T PushElement) {
        if (isFull() == true) {
            ExpandArray();
        }
        this.ArrayStack[this.SizeArrayStack] = PushElement;
        this.SizeArrayStack += 1;
        return true;
    }

    public T peek() {
        if (!isEmpty()) {
            return this.ArrayStack[this.SizeArrayStack - 1];
        } else {
            return null;
        }
    }

    public T pop() {
        if (!isEmpty()) {
            T PopElement = this.ArrayStack[this.SizeArrayStack - 1];
            this.ArrayStack[this.SizeArrayStack] = null;
            this.SizeArrayStack -= 1;
            return PopElement;
        } else {
            return null;
        }
    }

    public void clear() {
        this.SizeArrayStack = 0;
    }

    public boolean isEmpty() {
        if (this.ArrayStack.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Private(1)Check the Current Array is full or not and return true or false
    private boolean isFull() {
        if (this.ArrayStack.length == this.SizeArrayStack) {
            return true;
        } else {
            return false;
        }
    }

    //Private(2)Expand the CurrentArray
    private void ExpandArray() {
        T[] ExpandArray = (T[]) new Object[this.ArrayStack.length * 2];
        for (int number = 0; number < this.ArrayStack.length; number++) {
            ExpandArray[number] = this.ArrayStack[number];
        }
        this.ArrayStack = ExpandArray;
    }
}
