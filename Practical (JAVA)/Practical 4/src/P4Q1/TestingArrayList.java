package P4Q1;

import P4Q1ADT.ArrayList;
import P4Q1ADT.ListInterface;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class TestingArrayList {

    private static ListInterface<Player> PlayerList = new ArrayList<Player>();

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
        PlayerList.add(player1);
        PlayerList.add(player2);
        PlayerList.add(player3);
        PlayerList.add(player4);
        PlayerList.add(player5);
        PlayerList.add(player6);
        PlayerList.add(player7);
        PlayerList.add(player8);
        PlayerList.add(player9);
        System.out.println("==========\nArray Set\n==========");
        System.out.println("Size of ArraySet : " + PlayerList.getSizeArrayList());
        System.out.println(PlayerList.getElement(1));
        System.out.println(PlayerList.getElement(2));
        System.out.println(PlayerList.getElement(3));
        System.out.println(PlayerList.getElement(4));
        System.out.println(PlayerList.getElement(5));
        System.out.println(PlayerList.getElement(6));
        System.out.println(PlayerList.getElement(7));
        System.out.println(PlayerList.getElement(8));
        System.out.println(PlayerList.getElement(9));
    }

}
