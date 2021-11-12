/*
package leet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class GFG {
    public static int longestUniqueSubsttr(String str)
    {

        char[] chars = str.toCharArray();
        int startIndex=0;
        int lastIndex = 0;
       int  n= str.length();
       int[] boolA = new int[256];
       int max_so_far=0;
       int globalMax=0;

        List<Integer> list = Arrays.asList(boolA).stream().map(arg ->  -1).collect(Collectors.toList());

        while ( lastIndex <n)
        {
            if( list.get(chars[lastIndex])!= -1)
            {
                if(globalMax < max_so_far)
                    globalMax=max_so_far;
                startIndex

            }
            else
            {
                list.add(lastIndex, lastIndex);

            }

        }
    }

    int getIndex( char[] chars, int start, int last, char c)
    {
        String s="abs";


        while ( start < last)
        {


        }
    }



    // Driver code
    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
        System.out.println("The input string is " + str);

        int len = longestUniqueSubsttr(str);
        System.out.println("The length of the longest "
                + "non-repeating character "
                + "substring is " + len);
    }
}

// This code is contributed by Alex Bennet*/
