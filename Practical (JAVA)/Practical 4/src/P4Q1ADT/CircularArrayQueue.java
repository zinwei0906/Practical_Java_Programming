package P4Q1ADT;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class CircularArrayQueue<T> implements QueueInterface<T> {

    private T[] ArrayQueue;
    private int FirstIndex;
    private int LastIndex;
    private static final int DefaultLength = 100;

    public CircularArrayQueue() {
        this(DefaultLength);
    }

    public CircularArrayQueue(int Size) {
        this.ArrayQueue = (T[]) new Object[Size+1];
        this.FirstIndex = 0;
        this.LastIndex =Size;
    }

    public int getLastIndex() {
        return LastIndex;
    }

    public boolean enqueue(T EnqueueElement) {
        if (isFull() == true) {
            ExpandArray();
        }
        this.LastIndex = (this.LastIndex + 1) % this.ArrayQueue.length;
        this.ArrayQueue[this.LastIndex] = EnqueueElement;
        return true;
    }

    public T getFirstElement() {
        if (!isEmpty()) {
            return this.ArrayQueue[this.FirstIndex];
        } else {
            return null;
        }
    }

    public T dequeue() {
        if (!isEmpty()) {
            T DequeueElement = this.ArrayQueue[this.FirstIndex];
            this.ArrayQueue[this.FirstIndex] = null;
            this.FirstIndex = (this.FirstIndex + 1) % this.ArrayQueue.length;
            return DequeueElement;
        } else {
            return null;
        }
    }

    public void clear() {
        this.FirstIndex = 0;
        this.LastIndex = -1;
    }

    public boolean isEmpty() {
        if (this.FirstIndex == ((this.LastIndex+1) % this.ArrayQueue.length)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isFull() {
        if (this.FirstIndex == ((this.LastIndex + 2) % this.ArrayQueue.length)) {
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
