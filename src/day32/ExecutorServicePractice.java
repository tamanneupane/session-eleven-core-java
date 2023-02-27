package day32;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServicePractice {

    public static void main(String[] args) {

        Runnable runnable1 = () -> {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable runnable2 = () -> {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable runnable3 = () -> {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable runnable4 = () -> {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

//        ExecutorService service = Executors.newCachedThreadPool();
//
//        service.submit(runnable1);
//        service.submit(runnable2);
//        service.submit(runnable3);
//        service.submit(runnable4);
//
//        service.shutdown();

        ExecutorService service1 = Executors.newSingleThreadExecutor();

        CallableImpl callable = new CallableImpl();

        Future<Double> doubleFuture = service1.submit(callable);

        try {
            System.out.println(doubleFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        service1.shutdown();




    }
}
