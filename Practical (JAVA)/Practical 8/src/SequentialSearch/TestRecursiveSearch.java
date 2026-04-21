package SequentialSearch;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class TestRecursiveSearch {

    public static void main(String[] args) {
        ListInterface<String> RecursiveSearch = new ArrayList<>();
        RecursiveSearch.add("qwe");
        RecursiveSearch.add("asd");
        RecursiveSearch.add("zxc");
        System.out.println(RecursiveSearch.contain("qwe"));
        System.out.println(RecursiveSearch.contain("asd"));
        System.out.println(RecursiveSearch.contain("zxc"));
        System.out.println(RecursiveSearch.contain("123"));
    }

}
