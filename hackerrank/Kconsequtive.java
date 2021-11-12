package hackerrank;

public class Kconsequtive {

    public static void main(String[] args) {
        int k = 2;
        String st = "geeksforgeeks";
        String ans = reduced_String(st, k);
        System.out.println(ans);
    }

    static String reduced_String(String word, int threshold) {
        int sP = 1;
        int eP = 0;
        int length = word.length();
        int count = 1;
        char[] a = word.toCharArray();
        String newword = "";

        if (length < threshold)
            return word;

        for (int i = sP; i < length; i++) {
            sP = i - 1;
            eP = i - 1;
            count = 1;
//abbcccb
            while (eP < length - 1 && a[eP] == a[eP + 1]) {
                ++eP;
                ++count;
            }

            if (count >= threshold) {
                if (sP == 0) {
                    newword = word.substring(eP + 1, length);
                } else if (eP == length - 1)
                    newword = word.substring(0, sP);// + word.chr(eP + 1, length);

                else if (eP + 1 == length)
                    newword = word.substring(0, sP - 1) + word.charAt(length - 1);// + word.chr(eP + 1, length);

                else
                    newword = word.substring(0, sP) + word.substring(eP + 1, length);
                System.out.println(" new word  " + newword);
                return reduced_String(newword, threshold);


            }
            sP = eP + 1;
        }
        return word;
    }


}





