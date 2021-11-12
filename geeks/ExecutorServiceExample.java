package geeks;

import java.util.concurrent.*;

public class ExecutorServiceExample {
  
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Runnable r1 = () -> System.out.println("1");
        Runnable r2 = () -> System.out.println("2");
        Callable<String> c1 = () ->
        { return "c1";
        }
        ;
        Callable<String> c2 = () -> "c2";
        Callable<Integer> c3 = () -> 7;

        executorService.execute(r1);
        executorService.submit(r2);
        Future f1 = executorService.submit(c1);
        Future f2 = executorService.submit(c2);
        Future f3 = executorService.submit(c3);
        System.out.println(f2.get());
        System.out.println(f1.get());
        System.out.println(f3.get());
        executorService.shutdown();


    }  
  
}  