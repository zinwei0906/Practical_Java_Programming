package P6Q5;

/* 
 * SimpleList.java the toString() method invokes a private recursive toString() method
 * @author Kat Tan
 */
public class SimpleList<T> {

    private Node firstNode;

    // Constructor creates a list with the values from the given array
    public SimpleList(T[] initialValues) {
        for (int i = initialValues.length - 1; i >= 0; i--) {
            Node newNode = new Node(initialValues[i]);
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    public int countNodes(Node countNode) {
        if (countNode == null) {
            return 0;
        } else {
            return 1 + countNodes(countNode.next);
        }
    }

    public int countNodes() {
        return countNodes(this.firstNode);
    }

    @Override
    public String toString() {
        return toString(firstNode);
    }

    private String toString(Node currentNode) {
        if (currentNode == null) {
            return "";
        } else {
            return currentNode.data + "\n" + toString(currentNode.next);
        }
    }

    private class Node {

        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        } // end constructor

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}
