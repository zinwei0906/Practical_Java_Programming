package P5Q1.ADT;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class LinkedQueue<T> implements QueueInterface<T> {

    private Node FirstNode;
    private Node LastNode;

    public LinkedQueue() {
        FirstNode = null;
        LastNode = null;
    }

    public boolean enqueue(T EnqueueElement) {
        Node newNode = new Node(EnqueueElement);

        if (isEmpty()) {
            FirstNode = newNode;
        } else {
            LastNode.setNext(newNode);
        }
        LastNode = newNode;
        return true;
    }

    public T getFront() {
        if (isEmpty()) {
            return null;
        } else {
            return (T) this.FirstNode.getData();
        }
    }

    public T dequeue() {
        T front = null;

        if (!isEmpty()) {
            front = (T)FirstNode.getData();
            FirstNode = FirstNode.getNext();

            if (FirstNode == null) {
                LastNode = null;
            }
        }

        return front;
    }

    public boolean isEmpty() {
        if (this.FirstNode == null & this.LastNode == null) {
            return true;
        } else {
            return false;
        }
    }
}
