package base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class UserInputConsoleDemo {
 
    public static void main(String[] args) {
 
        // using InputStreamReader
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            InputStreamReader input = new InputStreamReader(System.in);
            //File

            System.out.print("Enter your name: ");
 //
            String name = reader.readLine();
            System.out.println("Your name is: " + name);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }  
}