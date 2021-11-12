package salesforce;

class Solution {
    public int compareVersion(String v1, String v2) {

        int vNum1 = 0;
        int vNum2 = 0;
        int i = 0;
        int j = 0;

        while (i < v1.length() || j < v2.length()) {

            //Checking v1
            while (i < v1.length() && v1.charAt(i) != '.') {
                vNum1 = vNum1 * 10 + (v1.charAt(i) - '0');
                i++;
            }
            //Checking v2
            while (j < v2.length() && v2.charAt(j) != '.') {
                vNum2 = vNum2 * 10 + (v2.charAt(j) - '0');
                j++;
            }
            if (vNum1 < vNum2) {
                return -1;
            } else if (vNum1 > vNum2) {
                return 1;
            }
            vNum1 = vNum2 = 0;
            i++;
            j++;
        }
        return 0;
    }
}