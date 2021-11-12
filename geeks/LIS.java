package geeks;

/* A Naive Java Program for LIS Implementation */
class LIS {
    static int max_ref; // stores the LIS

    /* To make use of recursive calls, this function must
    return two things: 1) Length of LIS ending with element
    arr[n-1]. We use max_ending_here for this purpose 2)
    Overall maximum as the LIS may end with an element
    before arr[n-1] max_ref is used this purpose.
    The value of LIS of full array of size n is stored in
    *max_ref which is our final result */
    static int _lis(int arr[], int n) {

        return 0;
    }

    // The wrapper function for _lis()
    static int lis(int arr[], int n) {
        // The max variable holds the result
        max_ref = 1;

        // The function _lis() stores its result in max
        _lis(arr, n);

        // returns max
        return max_ref;
    }

    // driver program to test above functions
    public static void main(String args[]) {
        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
        int n = arr.length;
        System.out.println("Length of lis is " + lis(arr, n)
                + "\n");
    }
}
/*This code is contributed by Rajat Mishra*/
