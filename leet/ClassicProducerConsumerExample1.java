/*
package leet;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;

public class ClassicProducerConsumerExample1 {

    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer(5);

        Runnable producer = () -> {
            try {
                buffer.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable consumer = () -> {
            try {
                buffer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread producerThread = new Thread(producer);

        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        String s = null;
        s.toCharArray();
        producerThread.join();
        consumerThread.join();
    }

    static class Buffer {

        private Queue<Integer> list;
        private int size;

        public Buffer(int size) {
            this.list = new LinkedList<>();
            this.size = size;
        }

        Consumer produce = arg->
        {
            int value = 0;
            while (true) {
                synchronized (this) {
                    while (list.size() >= size) {
                        // wait for the consumer
                        System.out.println("producer going for wait");
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("producer coming for wait");

                    }

                    list.add(value);

                    System.out.println("Produced " + value);

                    value++;

                    // notify the consumer
                    notify();

                    //Thread.sleep(1000);
                }
            }
        };

        public void produce(Consumer c) throws InterruptedException {
            c.accept(null);
        }

        public void consume() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    while (list.size() == 0) {
                        // wait for the producer
                        wait();
                    }

                    int value = list.poll();

                    System.out.println("Consume " + value);

                    // notify the producer
                    notify();

                    //Thread.sleep(1000);
                }
            }
        }
    }
}*/
