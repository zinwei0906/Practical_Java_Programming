
package P4Q1;

import P4Q1ADT.ArraySet;
import P4Q1ADT.SetInterface;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class TestingArraySet {
    private static SetInterface<Player> PlayerSet = new ArraySet<Player>();
    
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
        PlayerSet.add(player1);
        PlayerSet.add(player2);
        PlayerSet.add(player3);
        PlayerSet.add(player4);
        PlayerSet.add(player5);
        PlayerSet.add(player6);
        PlayerSet.add(player7);
        PlayerSet.add(player8);
        PlayerSet.add(player9);
        System.out.println("==========\nArray Set\n==========");
        System.out.println("Size of ArraySet : " + PlayerSet.getSizeArraySet());
        System.out.println(PlayerSet.getElement(1));
        System.out.println(PlayerSet.getElement(2));
        System.out.println(PlayerSet.getElement(3));
        System.out.println(PlayerSet.getElement(4));
        System.out.println(PlayerSet.getElement(5));
        System.out.println(PlayerSet.getElement(6));
        System.out.println(PlayerSet.getElement(7));
        System.out.println(PlayerSet.getElement(8));
        System.out.println(PlayerSet.getElement(9));
    }
    
}
