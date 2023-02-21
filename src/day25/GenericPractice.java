package day25;

import java.util.Arrays;

public class GenericPractice {

    public static void main(String[] args) {

        Pair<String, String> pair1 = new Pair<>("name", "Taman");
        String value1 = pair1.getValue();

        Pair<String, Integer> pair2 = new Pair<>("age", 52);
        int value2 = pair2.getValue();

        Pair<String, Float> pair3 = new Pair<>("points", 23.5f);
        float value3 = pair3.getValue();

        Pair<String,Boolean> pair4 = new Pair<>("isPresent", true);
        boolean value4 = pair4.getValue();

        Pair<Integer,Boolean> pair5 = new Pair<>(5, true);
        boolean value5 = pair5.getValue();


        Integer[] numbers = new Integer[3];
        printArray(numbers);

        Float[] fNumbers = new Float[3];
        printArray(fNumbers);

        printGreater("c", "d");

        printGreater(100, 99);

        printGreater(new Student("A", 5), new Student("B", 10));
    }

    public static <T> void printArray(T[] numbers){
        for (T number : numbers) {
            System.out.println(number);
        }
    }

    public static <T extends Comparable<T>> void printGreater(T a , T b){
        if(a.compareTo(b) > 0){
            System.out.println(a + " is greater");
        }else{
            System.out.println(b + " is greater");
        }
    }

//    public static <T extends Throwable> void throwTest(T t){
//        throw new T();
//    }
}
