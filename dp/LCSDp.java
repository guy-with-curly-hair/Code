package dp;

import java.util.Arrays;

public class LCSDp {

    public static void main(String[] args)
    {
        int[] arr = {10,22,9,33,31,50,41,60,80};
        System.out.println(getLIS(arr));
    }

    public static  int getLIS(int[] arr)
    {
        int[] lis = new int[arr.length+1];
        //List<Integer> ll = new ArrayList<>();
        //convert int array to Integer array
        //Integer[] l3= ll.stream().toArray(Integer[]::new);
        //add INTEGER ARRAY TO LIST<INTEGER>
        //Collections.addAll(ll, l3);
        Arrays.fill(lis,1);
        for ( int i =1; i < arr.length;i++)
        { for ( int j =0; j < i ; j ++)
            {
                if ( arr[i] > arr[j])
                    lis[i]= Math.max(lis[i], 1 + lis[j]);
            }
        }
return Arrays.stream(lis).max().getAsInt();
    }
}
// logic
 // core logic
// if element at (i) is greater than previous element then which previous element its greater add +1 to number of LIS till that previous element

//DP based 2 arrays and search for each i in J array whch is subaaray till ith element


