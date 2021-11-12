package geeks;

public class trappingwater {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0,
                1, 3, 2, 1, 2, 1};
        int n = arr.length;

        System.out.print(maxWater(arr, n));
    }

    public static int maxWater(int[] arr, int n) {

        int[] leftSidemax = new int[n];
        leftSidemax[0] = arr[0];

        int[] rightSideMax = new int[n];
        rightSideMax[n-1] = arr[n - 1];

        int i = 1;
        while (i < n) {
            leftSidemax[i] = Math.max(leftSidemax[i-1], arr[i]);
            rightSideMax[n - i - 1] = Math.max(rightSideMax[n - i], arr[n - i - 1]);
            i++;
        }
        i = 0;
        int sum = 0;
        while (i < n) {
            sum = sum + Math.min(leftSidemax[i] , rightSideMax[i] ) -arr[i];
            i++;
        }
        return sum;
    }
}

