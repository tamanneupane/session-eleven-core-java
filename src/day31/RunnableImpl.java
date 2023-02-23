package day31;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
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


    }
}
