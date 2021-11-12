package leet;

import java.util.ArrayList;
import java.util.List;

public class SortingCollection {

    public static void main( String [] args)
    {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Abc");
        list.add("BCD");

        System.out.println(list.stream().sorted((o1, o2) -> o1.compareTo(o2)));


    }
}
