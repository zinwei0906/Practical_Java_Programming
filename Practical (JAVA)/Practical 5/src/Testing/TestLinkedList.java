package Testing;

import P5Q1.ADT.LinkedList;
import P5Q1.ADT.ListInterface;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class TestLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListInterface<String> list1 = new LinkedList<>();
        list1.add(1, "testing1");
        list1.add(1, "testing2");
        list1.add(1, "testing3");
        System.out.println("Contain test: " + list1.contains("testing1"));
        System.out.println("Linked List 1: " + list1.getElement(1));
        System.out.println("Linked List 2: " + list1.getElement(2));
        System.out.println("Linked List 3: " + list1.getElement(3));
        System.out.println("Size of Linked List : " + list1.getSizeOfElement());
    }
    
}
