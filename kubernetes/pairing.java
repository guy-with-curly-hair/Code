package kubernetes;

import java.util.HashSet;
import java.util.Set;

public class pairing {


    public static void main (String[] args )
    {



    }
//  A = [-2 , -3 , 4 , -1 , -2 ,5, -3]
    static void pair (int[] arr, int target)
    {
        Set<Integer> set = new HashSet<>();

        for ( int i =0; i < arr.length ; i++)
        {
            set.add(arr[i]);
        }

        for ( int i =0; i < arr.length ; i++)
        {
            int curr = arr[i];
            int newtar= target - curr;

            if ( set.contains(newtar))
            {
                System.out.println( curr + " " + newtar);
            }

        }



    }
}
