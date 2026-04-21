package P5Q1.ADT;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class Node<T> {

    private T Data;
    private Node Next;

    public Node(T data) {
        this.Data = data;
        this.Next = null;
    }

    public Node(T data, Node next) {
        this.Data = data;
        this.Next = next;
    }

    public T getData() {
        return Data;
    }

    public void setData(T Data) {
        this.Data = Data;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node Next) {
        this.Next = Next;
    }
}
