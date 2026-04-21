package P4Q1;

import P4Q1ADT.ArrayQueue;
import P4Q1ADT.QueueInterface;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class TestingArrayQueue {

    private static QueueInterface<Player> PlayerQueue = new ArrayQueue<Player>();

    public static void main(String[] args) {
        Player player1 = new Player("Player1", "Player1", "John", "Tonny", 'M');
        Player player2 = new Player("Player2", "Player2", "Wong", "Happy", 'M');
        Player player3 = new Player("Player3", "Player3", "Tan", "Niubi", 'F');
        Player player4 = new Player("Player4", "Player4", "Dennis", "QWE", 'M');
        Player player5 = new Player("Player5", "Player5", "Tonny", "ASD", 'F');
        Player player6 = new Player("Player6", "Player6", "John", "ZXC", 'M');
        Player player7 = new Player("Player7", "Player7", "Tony", "RTY", 'M');
        Player player8 = new Player("Player8", "Player8", "Samsung", "FGH", 'F');
        Player player9 = new Player("Player9", "Player9", "Nokia", "VBN", 'M');
        PlayerQueue.enqueue(player1);
        PlayerQueue.enqueue(player2);
        PlayerQueue.enqueue(player3);
        PlayerQueue.enqueue(player4);
        PlayerQueue.enqueue(player5);
        PlayerQueue.enqueue(player6);
        PlayerQueue.enqueue(player7);
        PlayerQueue.enqueue(player8);
        PlayerQueue.enqueue(player9);
        System.out.println("==========\nArray StackSet\n==========");
        System.out.println("Size of ArraySet : " + PlayerQueue.getLastIndex());
        System.out.println(PlayerQueue.getFirstElement());
        System.out.println(PlayerQueue.dequeue());
        System.out.println(PlayerQueue.dequeue());
        System.out.println(PlayerQueue.dequeue());
        System.out.println(PlayerQueue.dequeue());
        System.out.println(PlayerQueue.dequeue());
        System.out.println(PlayerQueue.getFirstElement());
        System.out.println(PlayerQueue.dequeue());
        System.out.println(PlayerQueue.dequeue());
    }

}
