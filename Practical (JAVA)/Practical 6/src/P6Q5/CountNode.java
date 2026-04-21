/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P6Q5;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class CountNode {

    public static void main(String[] args) {
        String[] test = {"123", "456", "789"};
        System.out.println(test.length);
        SimpleList simple = new SimpleList(test);
        System.out.println(simple.countNodes());
    }

}
