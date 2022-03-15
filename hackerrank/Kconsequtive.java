package hackerrank;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Pair {

    char c ;
    int count;

    public Pair(char c, int count) {
        this.c = c;
        this.count = count;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return c == pair.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(c);
    }

    public void setCount(int count) {
        this.count = count;

    }
}
public class Kconsequtive {

    public static void main(String[] args) {
        int k = 2;
        String st = "gkeekgsforgeeks";
        //String ans = reduced_String(st, k);
        String ans = algo(transformInput(st),k);
       // String ans = algo1(st,k);

        System.out.println(ans);
    }



    static List<Pair> transformInput(String word)
    {
        List<Pair> l1 = new ArrayList<>();
        char[] c = word.toCharArray();

        IntStream.range(0,c.length).forEach( i ->
        {
            Pair p = new Pair(c[i],1);
            l1.add(p);
        });

        return l1;
    }

    // stack algo
    public static String algo1(String word, int threshold)
    {
        //gkeekgsforgeeks
        Stack<Pair> s = new Stack<>();
        char[] c = word.toCharArray();
        char last_eliminated_char='0';
        boolean lastElementsame=false;

          for (int i =0 ; i < c.length; i++)        {

            Pair p = new Pair(c[i],1);
            lastElementsame=  p.getC()==last_eliminated_char ? true : false;
            last_eliminated_char = lastElementsame ? last_eliminated_char :'0';

            Pair p1 = s.isEmpty() ? null : s.peek();
            if(!lastElementsame && p1!=null && p1.equals(p) )
            {
                if(p1.getCount()+1 >= threshold)
                {
                    last_eliminated_char=p1.getC();
                    System.out.println("Removing  " + p1.getC());
                    s.remove(p1);
                }
                else
                p1.setCount(p1.getCount() +1);

            }
            else
            {
                if(!lastElementsame)
                s.add(p);
            }
    }
          return s.stream().map(i -> i.getC()).collect(Collector.of(StringBuilder::new,
                  StringBuilder::append,
                  StringBuilder::append,
                  StringBuilder::toString));

    }


    public static String algo(List<Pair> lp, int threshold)
    {

        System.out.println( "INSIDE ALGO ");
        //reduce
        List<Pair> reducedList= lp.stream().filter(arg -> (arg.getCount() < threshold)).collect(Collectors.toList());
        //combine
        List<Pair> combinedList= combine(reducedList);
        //validate
        boolean done = combinedList.stream().filter(arg -> arg.getCount()>= threshold).findAny().isEmpty() ;
        if(done)
        {
        String s =  combinedList.stream().map(arg -> arg.getC()).
                //toString();

                collect(Collector.of(StringBuilder::new,
                 StringBuilder::append,
                 StringBuilder::append,
                 StringBuilder::toString));

       //  String s1 =   reducedList.stream().map(arg -> String:new);*/


        return s;
    }
        else
        {
           return  algo(combinedList,threshold);
        }
    }

    public static List<Pair> combine(List<Pair> lp)
    {
        int len = lp.size();
        List<Pair> temp = new ArrayList<>();

        Iterator it = lp.iterator();
        while(it.hasNext())
        {
            Pair p = (Pair) it.next();

            while(it.hasNext())
            {
                //Pair p1 = it.ne
            }

        }



        return temp;
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





