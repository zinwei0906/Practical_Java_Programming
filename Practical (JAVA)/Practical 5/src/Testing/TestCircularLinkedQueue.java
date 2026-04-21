/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import P5Q1.ADT.CircularLinkedQueue;
import P5Q1.ADT.QueueInterface;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class TestCircularLinkedQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueInterface<String> queue1 = new CircularLinkedQueue<>();
        queue1.enqueue("queue123");
        queue1.enqueue("queue111");
        System.out.println("Queue 1 : " + queue1.dequeue());
        System.out.println("Queue 1 : " + queue1.getFront());
        System.out.println("Queue 2 : " + queue1.dequeue());
        System.out.println("Queue 3 : " + queue1.dequeue());
    }

}
