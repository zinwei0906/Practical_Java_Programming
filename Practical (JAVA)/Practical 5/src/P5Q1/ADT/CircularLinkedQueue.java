package P5Q1.ADT;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class CircularLinkedQueue<T> implements QueueInterface<T> {

    private Node LastNode;

    public CircularLinkedQueue() {
        LastNode = null;
    }

    public boolean enqueue(T EnqueueElement) {
        Node newNode = new Node(EnqueueElement);

        if (isEmpty()) {
            newNode.setNext(newNode);
        } else {
            newNode.setNext(this.LastNode.getNext());
            this.LastNode.setNext(newNode);
        }
        LastNode = newNode;
        return true;
    }

    public T getFront() {
        if (isEmpty()) {
            return null;
        } else {
            return (T) this.LastNode.getNext().getData();
        }
    }

    public T dequeue() {
        T DequeueElement = null;

        if (!isEmpty()) {
            DequeueElement = (T) this.LastNode.getNext().getData();
            if (this.LastNode.getNext() == this.LastNode) {
                this.LastNode = null;
            } else {
                this.LastNode.setNext(this.LastNode.getNext().getNext());
            }
        }

        return DequeueElement;
    }

    public boolean isEmpty() {
        if (this.LastNode == null) {
            return true;
        } else {
            return false;
        }
    }
}
