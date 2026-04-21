/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P8Q2;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class TestBinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortedListInterface<String> RecursiveSearch = new SortedArrayList<>();
        RecursiveSearch.add("qwe");
        RecursiveSearch.add("asd");
        RecursiveSearch.add("zxc");
        RecursiveSearch.remove("zxc");
        System.out.println(RecursiveSearch.contains("qwe"));
        System.out.println(RecursiveSearch.contains("asd"));
        System.out.println(RecursiveSearch.contains("zxc"));
        System.out.println(RecursiveSearch.contains("123"));
    }

}
