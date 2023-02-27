package day32;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable<Double> {
    @Override
    public Double call() throws Exception {
        double result = 2.5+ 2.5;
        Thread.sleep(5000);
        return result;
    }
}
