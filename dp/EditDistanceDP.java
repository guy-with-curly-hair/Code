package dp;

public class EditDistanceDP {
    public static void main(String[] args)
    {
        String s1 = "cat";
        String s2="cut";
           // System.out.println(editDistanceRecursion(s1,s2,s1.length(),s2.length()));
        System.out.println(editDistancDP(s1,s2,s1.length(),s2.length()));
    }

    //solution with different wont work since if same word is unordered we will need insrt/replace &remove but comparing difference of count will give 0
    public static  int editDistanceRecursion(String s1 , String s2, int m , int n)
    {
        //base case
        if(n==0)
            return m;
       //base case
        if(m ==0)
            return n;

        if ( s1.charAt(m-1) == s2.charAt(n-1))
            return editDistanceRecursion(s1,s2,m-1,n-1);

        return 1+ Math.min(Math.min(editDistanceRecursion(s1,s2,m-1,n),editDistanceRecursion(s1,s2,m,n-1)), editDistanceRecursion(s1,s2,m-1,n-1));
    }
    public static  int editDistancDP(String s1 , String s2, int m , int n)
    {
        int[][] table =  new int[m+1][n+1];

        // fill the array when s1 is empty with size/m =0
        for ( int i =0; i <=n ;i++)
            table[0][i]=i;

        // fill the array when s2 is empty with size/n =0
        for ( int i =0; i <= m ;i++)
            table[i][0]=i;


        for( int i =1;i <=m;i++)
        {
            for ( int j =1; j <=n;j++)
            {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                        table[i][j] = table[i - 1][j - 1];

                }
                else
                    table[i][j] = 1 + Math.min(Math.min(table[i-1][j],table[i][j-1]),table[i-1][j-1]);
            }
        }



        return table[m][n];
    }

}
