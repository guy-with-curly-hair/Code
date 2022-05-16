package base;/* IMPORTANT: Multiple classes and nested static classes are supported */


// uncomment this if you want to read input.
//imports for BufferedReader

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

//import for Scanner and other utility classes


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass1 {
    public static void main(String args[] ) throws Exception {
        //Sample code to perform I/O:
        //  Use either of these methods for input

        // BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String name = br.readLine();

        //Scanner
        Scanner s = new Scanner(System.in);

        String inputdrones = s.nextLine();
        String inputweight = s.nextLine();


        String[] drones = inputdrones.split(" ");
        //String[] onlyDrones = Arrays.copyOfRange(drones,0,drones.length-1);
        String[] weights = inputweight.split(" ");

        int [] inputDrones = new int[drones.length - 1];
        int [] inputWeights = new int [weights.length];

        BiConsumer<String[], int[]> biConsumer = (drones1, inputDrones1) -> {
            for (int i = 0; i < drones1.length - 1; i++) {
                inputDrones1[i] = parseInt(drones1[i]);

            }
        };

        //BiConsumer<String[], int[]> b = (drones1, inputDrones1)  ->  IntStream.range(0,drones1.length).forEach();

        biConsumer.accept(drones, inputDrones);
        biConsumer.accept(weights, inputWeights);


        List inputDronelist = Arrays.stream(inputDrones).
                boxed().collect(Collectors.toList());
        //another way
        List<Integer> inputDronelist1 = Arrays.stream(drones).map( i ->Integer.valueOf(i)).collect(Collectors.toList());

        List inputWeightList = Arrays.stream(inputWeights).boxed().collect(Collectors.toList());
        //another way
        List<Integer> inputWeightList1 = Arrays.stream(weights).map( i -> parseInt(i)).collect(Collectors.toList());

        System.out.println(unchosenWeightsForJohn(inputDronelist, inputWeightList));


        // Write your code here

    }
    static int unchosenWeightsForJohn( List<Integer>drones, List<Integer> weight)
    {
        //sort
        Collections.sort(weight);
        getClosestWeights(drones.get(0), weight);
        getClosestWeights(drones.get(1), weight);
        return weight.stream().mapToInt(i ->i).sum();
    }




    static void getClosestWeights(int desiredWeight, List<Integer> input)
    {

        int length = input.size();
        int currentweight = 0;
        List<Integer> temp = new ArrayList(input);

        int start = 0;
        int end = input.size();


        for ( int i = length-1 ; i >=0; i --)
        {
            if ( input.get(i) <  desiredWeight && currentweight + input.get(i) <= desiredWeight )
            {
                currentweight = currentweight + input.get(i);
                input.remove(input.get(i));
            }
        }
    }
    static List<Integer> covertStringtoIntArray(String[] array, int length)
    {
        int[] arr = new int[length];

        for(int i = 0 ; i < length ;i++ )
        {
            arr[i]=(Integer.valueOf(array[i]));
        }
        return new ArrayList(Arrays.asList(arr));
    }

}
