/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P10Q1;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class TestHashCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Name name1 = new Name("A", "B");
        System.out.println("HashCode : " + name1.hashCode());
        Name name2 = new Name("B", "B");
        System.out.println("HashCode : " + name2.hashCode());
    }

}
