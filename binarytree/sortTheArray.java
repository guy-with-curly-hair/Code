package binarytree;

//Input: root = [1,2,2,2,3,3,6,5]
//o/p   1 5 6 3 3 2 2 2

//class
//val
//count
//map< int , int >  count , number


import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;


class Pair {

    int value;
    int count;

    public Pair(int value, int count) {
        this.value = value;
        this.count = count;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return value == pair.value ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}

public class sortTheArray {


    public static void main(String[] args)
    {
//Input: root = [1,2,2,2,3,3,6,5]

        Scanner s = new Scanner(in);
        String[] input =s.nextLine().split(",");
        List<Pair> l = new ArrayList<>();
        Arrays.stream(input).forEach( i ->
                {
                    int value = parseInt(i);
                    Pair p = new Pair(value,1);
                    if (l.contains(p) ) {
                        Pair p1 = l.stream().filter(arg -> arg.equals(p)).findAny().get();
                        p1.setCount(p1.getCount() +1);
                    }
                    else {
                        l.add(p);
                    }

                }
        );
        Comparator<Pair> c = Comparator.comparing(Pair::getCount).thenComparing(Pair::getValue);
        Collections.sort(l, c);
        l.sort(c);

        l.stream().forEach(pair ->
        {
            int count = pair.getCount();
            //System.out.println(" pair value " + pair.getValue() + " pair count " + pair.getCount());
            while( count > 0) {
                System.out.print(pair.getValue() + " ");
                --count;
            }

        });


    }

}
