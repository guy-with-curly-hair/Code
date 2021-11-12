package base;

import java.io.*;
import java.util.*;
 
public class UserInputConsoleDemo {
 
    public static void main(String[] args) {
 
        // using InputStreamReader
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            InputStreamReader in = new InputStreamReader(System.in);

            System.out.print("Enter your name: ");
 
            String name = reader.readLine();
            System.out.println("Your name is: " + name);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }  
}