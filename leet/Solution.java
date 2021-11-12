class Solution {
    public String minWindow(String s, String t) {
        int[] cnt = new int[256];
        char[] cht = t.toCharArray();
        char[] chs = s.toCharArray();
        for (char c :cht) cnt[c]++;

        int tLen = t.length();
        int count = 0;
        int start = 0, len = s.length() + 1;
        for (int right = 0, left = 0; right < s.length(); right++) {
            if (cnt[chs[right]]-- > 0) {
                count++;
            }
            while (left < right && cnt[chs[left]] < 0) {
                if (++cnt[chs[left++]] > 0)
                    count--;
            }
            if (count == tLen && right - left + 1 < len) {
                start = left;
                len = right - left + 1;
            }
        }
        return len == s.length() + 1 ? "" : s.substring(start, start + len);
    }

    public static void main(String[] args)

    {

        Solution sol = new Solution();
        System.out.println(sol.minWindow("MDOBECODEBANC","ABC"));
    }
}