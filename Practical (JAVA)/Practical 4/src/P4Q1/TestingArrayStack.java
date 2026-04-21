
package P4Q1;

import P4Q1ADT.ArrayStack;
import P4Q1ADT.StackInterface;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class TestingArrayStack {
    private static StackInterface<Player> PlayerStack = new ArrayStack<Player>();
    
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
        PlayerStack.push(player1);
        PlayerStack.push(player2);
        PlayerStack.push(player3);
        PlayerStack.push(player4);
        PlayerStack.push(player5);
        PlayerStack.push(player6);
        PlayerStack.push(player7);
        PlayerStack.push(player8);
        PlayerStack.push(player9);
        System.out.println("==========\nArray StackSet\n==========");
        System.out.println("Size of ArraySet : " + PlayerStack.getSizeArrayStack());
        System.out.println(PlayerStack.pop());
        System.out.println(PlayerStack.peek());
        System.out.println(PlayerStack.pop());
        System.out.println(PlayerStack.pop());
        System.out.println(PlayerStack.peek());
        System.out.println(PlayerStack.peek());
        System.out.println(PlayerStack.peek());
        System.out.println(PlayerStack.peek());
        System.out.println(PlayerStack.peek());
    }
    
}
