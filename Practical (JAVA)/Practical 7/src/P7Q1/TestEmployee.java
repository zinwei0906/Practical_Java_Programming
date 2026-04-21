/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P7Q1;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class TestEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortedListInterface<Employee> empList = new SortedArrayList<>();

        empList.add(new Manager(5555, "Jack Lee", 8888.88, 1200.00));
        empList.add(new Cleark(7777, "Lee Hom", 7897.55, 10, 7.90));
        empList.add(new Manager(2222, "Phoh John", 5000.00, 900.00));
        empList.add(new Cleark(1111, "Tan Wei", 2000.00, 4, 4.50));
        empList.add(new Manager(3333, "Tony", 700.00, 1270.00));
        System.out.println("Employee List : \n" + empList);
    }

}
