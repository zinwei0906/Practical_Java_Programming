/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P10Q2;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class TestHashCodeID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student(1111222233, "qwer", 123.123);
        System.out.println("Sutdent 1 : " + student1.hashCode());
    }

}
