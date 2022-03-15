package hackerrank;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Checkiterator {

    public static void main(String[] args)
    {

        List<String> ll = Stream.of("RAm","VT","VT1","VT2","VT3").collect(Collectors.toList());
        Iterator it = ll.iterator();

        while(it.hasNext()) {
            ll.stream().forEach( i -> System.out.print(i));
                System.out.println(" value  " + ll.size());
                System.out.println(" value  " + it.next());
            it.remove();

        }
    }
}
