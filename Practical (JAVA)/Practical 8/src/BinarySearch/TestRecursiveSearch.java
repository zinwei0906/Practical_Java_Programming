package BinarySearch;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class TestRecursiveSearch {

    public static void main(String[] args) {
        SortedListInterface<String> RecursiveSearch = new SortedArrayList<>();
        RecursiveSearch.add("qwe");
        RecursiveSearch.add("asd");
        RecursiveSearch.add("zxc");
        System.out.println(RecursiveSearch.contains("qwe"));
        System.out.println(RecursiveSearch.contains("asd"));
        System.out.println(RecursiveSearch.contains("zxc"));
        System.out.println(RecursiveSearch.contains("123"));

    }

}
