package geeks.recurssionNdp;

class CoverdistanceDP {
    // Function returns count of ways to cover 'dist'
    static int printCountRec(int dist) {

        int[] arr = new int[dist + 1];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= dist; i++)
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];

        return arr[dist];

    }

    // driver program
    public static void main(String[] args) {
        int dist = 4;
        System.out.println(printCountRec(dist));
    }
}