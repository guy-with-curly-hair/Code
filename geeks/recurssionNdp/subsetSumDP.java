package geeks.recurssionNdp;

class subsetSumDP {

    // Returns true if there is a subset
    // of set[] with sum equal to given sum
    // subset[n-1][sum-set[n-1]] || subset[n-1,sum]
    // i 0-n
    //j =0-sum
    static boolean isSubsetSum(int set[],
                               int n, int sum) {

        boolean[][] flags = new boolean[n + 1][sum + 1];
        flags[0][0]=true;
        for (int i = 1; i < sum; i++)
            flags[0][i] = false;

        for (int i = 1; i < n; i++)
            flags[i][0] = true;


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                flags[i][j] = flags[i - 1][j];
                if (j >= set[i-1] )
                    flags[i][j] = flags[i][j] || flags[i - 1][j - set[i-1]];
            }

        }
        return flags[n][sum];

    }

    /* Driver code */
    public static void main(String args[]) {
        int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;
        if (isSubsetSum(set, n, sum) == true)
            System.out.println("Found a subset"
                    + " with given sum");
        else
            System.out.println("No subset with"
                    + " given sum");
    }
}