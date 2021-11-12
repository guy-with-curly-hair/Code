package j8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class flatmap {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

        Stream<String> stream = stringList.stream();

        stream.flatMap((value) -> {
            String[] split = value.split(" ");
            return (Stream<String>) Arrays.asList(split).stream();
        })
                .forEach((value) -> System.out.println(value))
        ;
    }
}
