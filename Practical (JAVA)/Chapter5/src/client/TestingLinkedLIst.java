/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.LinkedList;
import adt.ListInterface;
import samplecode.Node;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class TestingLinkedLIst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node<String> node1 = new Node<>("111");
        Node<String> node2 = new Node<>("222");
        Node<String> node3 = new Node<>("333");
        Node<String> node4 = new Node<>("444");
        Node<String> node5 = new Node<>("555");
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        for (Node testnode = node1; testnode.getNext() != null; testnode = testnode.getNext()) {
            System.out.println(testnode.getData());
        }

        ListInterface link1 = new LinkedList();
        link1.add("String1");
        link1.add("String2");
        link1.add("String3");
        link1.add(2, "String 1.5");
        System.out.println(link1.getEntry(1));
        System.out.println(link1.getEntry(2));
        System.out.println(link1.getEntry(3));
    }

}
