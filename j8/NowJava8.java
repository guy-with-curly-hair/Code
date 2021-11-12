
package j8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8 {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "mkyong");

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"mkyong".equals(line))
                .peek(System.out::println)// we dont like mkyong
                .filter(line -> !"spring".equals(line))
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);                //output : spring, node

    }

}