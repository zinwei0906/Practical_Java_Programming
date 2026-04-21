/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P8Q1;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class TestSortedSequentially {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortedListInterface<String> SortedArraySequentially = new SortedArrayList<>();
        SortedArraySequentially.add("qwe");
        SortedArraySequentially.add("asd");
        SortedArraySequentially.add("zxc");
        System.out.println(SortedArraySequentially.contains("qwe"));
        System.out.println(SortedArraySequentially.contains("asd"));
        System.out.println(SortedArraySequentially.contains("zxc"));
        System.out.println(SortedArraySequentially.contains("123"));
    }

}
