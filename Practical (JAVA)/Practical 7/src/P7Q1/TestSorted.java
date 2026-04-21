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
public class TestSorted {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortedListInterface<String> test = new SortedArrayList<>();
        test.add("qwe");
        test.add("asd");
        test.add("zxc");
        System.out.println("Size : " + test.getNumberOfEntries());
        System.out.println("List 1 : \n" + test);
        System.out.println("Contain: " + test.contains("qwe"));
        System.out.println("Remove: " + test.remove("asd"));
        System.out.println("Remove: " + test.remove("qwe"));
        System.out.println("Size : " + test.getNumberOfEntries());
        System.out.println("List 1 : \n" + test);

//        SortedListInterface<String> test2 = new SortedLinkedList<>();
//        test2.add("qwe");
//        test2.add("asd");
//        test2.add("zxc");
//        test2.add("aaa");
//        System.out.println("Size : " + test2.getNumberOfEntries());
//        System.out.println("List 1 : \n" + test2);
//        System.out.println("Contain: " + test2.contains("asd"));
//        System.out.println("Remove: " + test2.remove("aaa"));
//        System.out.println("Size : " + test2.getNumberOfEntries());
//        System.out.println("List 1 : \n" + test2);
    }

}
