package ionCoding;

public class reverse {


    public static void main(String[] args) {
        String str = "My name is Vivek";
    getReverse(str);
}

    //string[]
    //reverse this string array

    static void getReverse(String s) {
        String[] atr = s.split(" ");
        int size = atr.length;//4
        while (size > 0) {
            System.out.print(" " + atr[size - 1]);
            --size;
        }


    }
}

