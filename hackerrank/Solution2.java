package hackerrank;

import java.util.*;
import java.util.stream.Collectors;

class Solution2 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();
    for( String str : strs)
    {
        char[] a = str.toCharArray();
        Arrays.sort(a);
        String sortedString = new String (a);
        List<String> ll = map.getOrDefault(sortedString,new ArrayList<>());
        ll.add(str);
        map.putIfAbsent(sortedString,ll);
        //map.put(sortedString,ll);
    }
   return map.values().stream().collect(Collectors.toList());

    }

public static void main(String[] args )
{

    String[] str =  {"eat","tea","tan","ate","nat","bat"};
    System.out.println(groupAnagrams(str));
}
}