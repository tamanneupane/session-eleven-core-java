package day19;

import java.util.Arrays;

public class MethodWithVarParams {
    public static void main(String[] args) {
        add(2,3);

        add(2,3,5);

        add(2,3,5,10);
    }

    public static void add(int... values){
        System.out.println(Arrays.toString(values));
        // Write your code here
//        int sum = 0;
//        for (int value : values) {
//            sum += value; // sum = sum + value;
//        }

        int sum = Arrays.stream(values).sum();
        System.out.println(sum);
    }
}
