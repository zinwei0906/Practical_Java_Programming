package P4Q1ADT;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class ArrayQueue<T> implements QueueInterface<T> {

    private T[] ArrayQueue;
    private int SizeArrayQueue;
    private static final int DefaultLength = 100;

    public ArrayQueue() {
        this(DefaultLength);
    }

    public ArrayQueue(int Size) {
        this.ArrayQueue = (T[]) new Object[Size];
        this.SizeArrayQueue = 0;
    }

    public int getLastIndex() {
        return SizeArrayQueue;
    }

    public boolean enqueue(T EnqueueElement) {
        if (isFull() == true) {
            ExpandArray();
        }
        this.ArrayQueue[this.SizeArrayQueue] = EnqueueElement;
        this.SizeArrayQueue += 1;
        return true;
    }

    public T getFirstElement() {
        if (!isEmpty()) {
            return this.ArrayQueue[0];
        } else {
            return null;
        }
    }

    public T dequeue() {
        if (!isEmpty()) {
            T DequeueElement = this.ArrayQueue[0];
            if (this.SizeArrayQueue > 1) {
                for (int number = 0; number < this.SizeArrayQueue; number++) {
                    this.ArrayQueue[number] = this.ArrayQueue[number + 1];
                }
            }
            this.SizeArrayQueue -= 1;
            return DequeueElement;
        } else {
            return null;
        }
    }

    public void clear() {
        this.SizeArrayQueue = 0;
    }

    public boolean isEmpty() {
        if (this.SizeArrayQueue == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isFull() {
        if (this.ArrayQueue.length == this.SizeArrayQueue) {
            return true;
        } else {
            return false;
        }
    }

    private void ExpandArray() {
        T[] ExpandArray = (T[]) new Object[this.ArrayQueue.length * 2];
        for (int number = 0; number < this.ArrayQueue.length; number++) {
            ExpandArray[number] = this.ArrayQueue[number];
        }
        this.ArrayQueue = ExpandArray;
    }

}
