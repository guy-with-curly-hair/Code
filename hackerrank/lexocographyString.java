package hackerrank;

import java.util.Arrays;

public class lexocographyString {

    public static void main(String[] args) {
        String s = "aazb";
        System.out.println(getString(s));
    }

    public static String getString(String s) {
        int[] count = new int[26];
        int[] vis = new int[26];
        String s1 = "";
        Arrays.fill(vis, 0);

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']+=+1;
        }

//aCC
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'] -= 1;

            if (vis[s.charAt(i) - 'a'] == 0) {
                int size = s1.length();
                while (size > 0 && vis[s.charAt(i) - 'a'] == 1 && s1.charAt(size - 1) - 'a' >= s.charAt(i) - 'a' && count[s.charAt(size - 1) - 'a'] > 0) {
                    vis[s1.charAt(size - 1) - 'a'] = 0;
                    s1 = s1.substring(0, size - 1);
                    size--;
                }
                vis[s.charAt(i) - 'a'] = 1;
                s1 = s1 + s.charAt(i);
            }
        }

        return s1;
    }
}
