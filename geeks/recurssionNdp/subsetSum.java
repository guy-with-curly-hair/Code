package geeks.recurssionNdp;

class subsetSum {
 
    // Returns true if there is a subset
    // of set[] with sum equal to given sum
    static boolean isSubsetSum(int set[],
                               int n, int sum)
    {
        if (n == 0 && n != sum)
            return false;

        if ( sum <0)
            return false;

        if (sum == 0)
            return true;
        return isSubsetSum(set,n-1,sum-set[n-1]) || isSubsetSum(set,n-1,sum);

    }
 
    /* Driver code */
    public static void main(String args[])
    {
        int set[] = { 3, 34, 4, 12, 5, 2 };
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