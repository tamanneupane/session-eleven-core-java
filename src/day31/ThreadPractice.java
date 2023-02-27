package day31;

public class ThreadPractice {

    public static void main(String[] args) {

//        RunnableImpl runnable = new RunnableImpl();

        Runnable runnable = () -> {
            //        System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().isInterrupted());
            if(Thread.currentThread().isInterrupted()){
                return;
            }
//        if(Thread.currentThread().getName().equals("T3")){
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
            System.out.println("Transaction code is running" + Thread.currentThread().getName());
        };

        Thread t1 = new Thread(runnable);
        t1.setName("T1");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.setName("T2");
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        Thread t3 = new Thread(runnable);
        t3.setName("T3");
        t1.setPriority(Thread.MIN_PRIORITY);
//        t3.setDaemon(true);
        t3.start();



//        t3.interrupt();


    }
}
