package leet;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {
   public static void main(String args[]) throws InterruptedException {
      ExecutorService executors = Executors.newFixedThreadPool(5);
      CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
      executors.submit(new Service1(cyclicBarrier));
      executors.submit(new Service1(cyclicBarrier));
      executors.submit(new Service2(cyclicBarrier));
      executors.submit(new Service2(cyclicBarrier));
      executors.submit(new Service2(cyclicBarrier));
      Thread.sleep(3000);
      System.out.println("Done");
      System.out.println("cyclicBarrier  " + cyclicBarrier.getNumberWaiting());

   }
}

class Service1 implements Runnable {
   CyclicBarrier cyclicBarrier;
   public Service1(CyclicBarrier cyclicBarrier) {
      super();
      this.cyclicBarrier = cyclicBarrier;
   }
   @Override
   public void run() {
      System.out.println("Services1 " + cyclicBarrier.getNumberWaiting());
     // while (true) {
         try {

            cyclicBarrier.await();
            System.out.println("first barrier crossed " + cyclicBarrier.getNumberWaiting());
            cyclicBarrier.await();
            System.out.println("second barrier crossed " + cyclicBarrier.getNumberWaiting());

         } catch (InterruptedException | BrokenBarrierException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
       }
   //   }
   }
}

class Service2 implements Runnable {
   CyclicBarrier cyclicBarrier;
   public Service2(CyclicBarrier cyclicBarrier) {
      super();
      this.cyclicBarrier = cyclicBarrier;
   }
   @Override
   public void run() {
      System.out.println("Services2 " + cyclicBarrier.getNumberWaiting());
    //  while (true) {
         try {
            cyclicBarrier.await();
            System.out.println("first barrier crossed " + cyclicBarrier.getNumberWaiting());
            cyclicBarrier.await();
            System.out.println("second barrier crossed " + cyclicBarrier.getNumberWaiting());
         } catch (InterruptedException | BrokenBarrierException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
     // }
   }
}