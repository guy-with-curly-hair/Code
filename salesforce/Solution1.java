package salesforce;

import java.io.*;

class Result {

/*
     * Complete the 'doit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER num as parameter.

*/


    public static int doit(int num) {

        String s = String.valueOf(num);
        int l = s.length();
        int count=0;

        char[] chars = s.toCharArray();
        boolean success=true;

        for( int j=0;j<l;j++)
        {
            char c = chars[j];
            String c1 = String.valueOf(c);
            if (getValidNo(c1))
            {
                success=true;
            }
            else
            {
                success=false;
            }

        }

        if (success)
            count++;


        for ( int i =0; i < l ;i++)
        {

            for ( int j= 0;j<i;i++)
            {
                char c = chars[j];
                String c1 = String.valueOf(c);
                if (getValidNo(c1))
                {
                    success=true;
                }
                else
                {
                    success=false;
                }
            }

            String s1 = String.valueOf(chars[i]);
            String.valueOf(chars[i+1]);
            if (getValidNo(s1))
            {
                success=true;
            }
            else


            for ( int k= i+2;k<l;k++)
            {
                {
                    success=false;
                }
                char c = chars[k];
                String c1 = String.valueOf(c);
                if (getValidNo(c1))
                {
                    success=true;
                }
                else
                {
                    success=false;
                }

            }
            if (success)
                count++;
        }


        return count;
    }



    static boolean getValidNo(String num)
    {
        return false;

    }


}


public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int num = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.doit(num);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
