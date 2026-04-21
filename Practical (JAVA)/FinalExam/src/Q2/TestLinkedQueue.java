package Q2;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class TestLinkedQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueInterface<String> queue1 = new LinkedQueue<>();
        queue1.enqueue("queue111");
        queue1.enqueue("queue222");
//        queue1.enqueue("queue333");
        System.out.println("Queue 1 : " + queue1.getFront());
        System.out.println("Requeue : " + queue1.requeue());
        System.out.println("Queue 1 : " + queue1.getFront());
        System.out.println("Queue 1 : " + queue1.dequeue());
        System.out.println("Queue 2 : " + queue1.dequeue());
        System.out.println("Queue 3 : " + queue1.dequeue());
    }

}
