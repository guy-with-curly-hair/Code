package j8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class GFG {
  
    // Driver code
    public static void main(String[] args)
    {
  
        // Creating a List of Strings
        List<String> list = Arrays.asList("Geeks", "GFG",
                                 "GeeksforGeeks", "gfg");
  
        // Using Stream flatMap(Function mapper)
        list.stream().flatMap(str -> 
                         Stream.of(str.charAt(2))). //str.charat is making char & directly it not
                         forEach(System.out::println);
        System.out.println("in map");
        list.stream().map(str -> str.charAt(2)).forEach(System.out::println);
    }
}