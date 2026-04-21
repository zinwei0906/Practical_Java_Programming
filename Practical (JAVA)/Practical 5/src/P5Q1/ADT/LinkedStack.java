package P5Q1.ADT;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class LinkedStack<T> implements StackInterface<T> {

    private Node TopNode;

    public LinkedStack() {
        this.TopNode = null;
    }

    public void push(T PushElement) {
        Node PushNode = new Node(PushElement);
        if (isEmpty() == true) {
            this.TopNode = PushNode;
        } else {
            PushNode.setNext(this.TopNode);
            this.TopNode = PushNode;
        }
    }

    public T peek() {
        if (this.TopNode != null) {
            return (T) this.TopNode.getData();
        } else {
            return null;
        }
    }

    public T pop() {
        if (this.TopNode != null) {
            T PopElement = (T) this.TopNode.getData();
            this.TopNode = this.TopNode.getNext();
            return PopElement;
        } else {
            return null;
        }
    }

    public void clear() {
        this.TopNode = null;
    }

    public boolean isEmpty() {
        if (this.TopNode == null) {
            return true;
        } else {
            return false;
        }
    }
}
