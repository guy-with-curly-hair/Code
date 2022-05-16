package ionCoding;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Stack1 {


    static Queue<Integer> q = new LinkedList();
    //static Queue<Integer> q1 = new LinkedList();

    //stack using queue

    // stack is LIFO lasty in first out
    //queue is first in first out

    //queue (--1,--2,--3)  another state of queue --1--2
    //output(--3--2--1)


    //put is normal queue.add(number)
    //1way
    //get() --put everything in another queue except last element & give back last element


    public Stack1() {
        // getSingleton();
    }


    public static void main(String[] args) {

        put(1);
        put(2);
        put(3);
        System.out.println(getElement());
        System.out.println(getElement());
        put(4);
        System.out.println(getElement());
        System.out.println(getElement());


    }

    public static void put(Integer i) {
        q.add(i);
    }

    public static int getElement() {
        int lastElement = 0;
        Iterator i = q.iterator();

        while (i.hasNext()) {
            lastElement = (int) i.next();
        }
        //funtionality
        q.remove(lastElement);
        return lastElement;
    }
}
//


//key1
//key2
//key3


//--key1--> hassh & then index --comelike-- 8t index
//--key2--> hassh & then index---come 8 then

//key3key2--> hassh & then index---come 9 then 9th con

//user came read/**/

