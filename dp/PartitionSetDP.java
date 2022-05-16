package dp;

import java.util.Arrays;

public class PartitionSetDP {

    public static void main(String[] args) {
        int[] arr = {6, 6, 11, 5};
        System.out.println(getSubset(arr));
    }

    public static int getSubset(int[] arr) {
        int total_sum = Arrays.stream(arr).sum();
        return getSubset(arr, arr.length, 0, total_sum);
    }

    public static int getSubset(int[] arr, int n, int subset_sum, int total_sum) {

        if (n == 0)
            return Math.abs(total_sum - subset_sum - subset_sum);

        return
                Math.min(
                        getSubset(arr, n - 1, subset_sum + arr[n - 1], total_sum),
                        getSubset(arr, n - 1, subset_sum, total_sum));

    }

    public static int getSubsetDP(int[] arr, int n, int subset_sum, int total_sum) {
        int[][] table = new int[n + 1][total_sum + 1];

        for (int i = 0; i <= n; i++) {
            table[i][0] = 0;
        }
        for (int i = 0; i <= total_sum; i++) {
            table[0][i] = 0;
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= total_sum; j++) {
                //table[i][j] = Math.min(table[])

            }

        }

        return 0;
    }
}
// logic
 // core logic
// if element at (i) is greater than previous element then which previous element its greater add +1 to number of LIS till that previous element

//DP based 2 arrays and search for each i in J array whch is subaaray till ith element


