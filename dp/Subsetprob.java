package dp;

import java.util.Arrays;

public class Subsetprob {

    public static void main(String[] args)
    {
        int[] arr = {4, 1, 10, 12, 5, 2};
        int sum =7;
        System.out.println(getLIS(arr,sum));
    }

    public static  boolean getLIS(int[] arr, int sum){
        return getSS(arr,arr.length,sum,"",0);
    }

    static boolean getSS(int[] arr , int n, int sum , String set, int curr_sum)
    {
        set = set + ",";
        boolean diff = curr_sum - sum==0;
        if ( n < 1 &&  !diff)
            return false;

        if(diff) {
            System.out.println(set);
            return true;
        }

        boolean incIth=getSS(arr,n-1,sum,set+ String.valueOf(arr[n-1]),curr_sum + arr[n-1]);
        boolean excIth=getSS(arr,n-1,sum,set,curr_sum);


        return  incIth || excIth;
    }

    static boolean SSDP(int[] arr , int n, int sum , String set, int curr_sum)
    {

        int [] dp = new int[sum+1];
        Arrays.fill(dp,0);
        dp[0]=1;

return false;
    }
}

