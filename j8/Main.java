package j8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
  
public class Main 
{
    public static void main(String[] args) 
    {
        String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
         
        List<String> listOfAllChars = Arrays.stream(dataArray).peek(System.out::println)
                                    .flatMap(x -> Arrays.stream(x)).peek(System.out::println)
                                    .collect(Collectors.toList());
  
        System.out.println(listOfAllChars);
    }
}