package base;/* IMPORTANT: Multiple classes and nested static classes are supported */


// uncomment this if you want to read input.
//imports for BufferedReader

import java.util.Scanner;//import for Scanner and other utility classes

import static java.lang.Integer.parseInt;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass2 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = parseInt(s.nextLine());
        String input = s.hasNext() ? s.nextLine() : "Tt";
        System.out.println(num * 2);
        System.out.println(input);
    }
}


