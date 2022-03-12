package base;/* IMPORTANT: Multiple classes and nested static classes are supported */


// uncomment this if you want to read input.
//imports for BufferedReader
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//import for Scanner and other utility classes


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String inputdrones = s.nextLine();


        String[] drones = inputdrones.split(" ");
        int len = drones.length;
        int numofWeights = Integer.valueOf(drones[len-1]);




        //get the weights
        String inputweight = s.nextLine();
        String[] weights = inputweight.split(" ");

        List<Integer> dronesWeight=covertStringtoIntArray(drones, len - 1);
        List<Integer> numWeights = covertStringtoIntArray(weights, numofWeights);

        System.out.println(unchosenWeightsForJohn(dronesWeight, numWeights));


        // Write your code here

    }
    static int unchosenWeightsForJohn( List<Integer>drones, List<Integer> weight)
    {
        //sort
        Collections.sort(weight);
        getClosestWeights(drones.get(0), weight);
        getClosestWeights(drones.get(1), weight);


        return weight.stream().mapToInt(i -> i).sum();
    }

   static List<Integer> getClosestWeights(int desiredWeight, List<Integer> input)
    {

        int length = input.size();
        int currentweight = 0;
        List<Integer> temp = new ArrayList(input);

        for ( int i = length-1 ; i >=0; i --)
        {
            if ( temp.get(i) <  desiredWeight && currentweight + temp.get(i) <= desiredWeight )
            {
                currentweight = currentweight + temp.get(i);
                input.remove(temp.get(i));
            }
        }
        return input;
    }
    static List<Integer> covertStringtoIntArray(String[] array, int length)
    {
        List<Integer> arr = new ArrayList();

        for(int i = 0 ; i < length ;i++ )
        {
            arr.add(Integer.valueOf(array[i]));
        }

        return arr;
    }

}
