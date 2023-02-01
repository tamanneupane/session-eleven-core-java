package day19;

import java.util.ArrayList;

public class AutoBoxing {

    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<>();

        ints.add(2); // 0 i  => AUTOBOXING
        ints.add(3); // 1 i  => AUTOBOXING
        ints.add(5); // 2 i  => AUTOBOXING

        int i = ints.get(2); // AUTO UNBOXING

        Integer a = 2; // AUTOBOXING
        int b = a; // UNBOXING

        int amount = Integer.valueOf("20000");

        int d = 2;

        String e = String.valueOf(d);

    }
}
