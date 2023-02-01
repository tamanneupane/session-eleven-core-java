package day7;

import java.time.LocalDate;

public class MutableImmutablePractice {

    public static void main(String[] args) {

        // Mutable

        MutableClass mutableClass = new MutableClass("a", "b");

        System.out.println(mutableClass.getA());
        System.out.println(mutableClass.getB());

        mutableClass.setA("c");
        mutableClass.setB("d");

        System.out.println(mutableClass.getA());
        System.out.println(mutableClass.getB());

        // Immutable Class

        ImmutableClass immutableClass = new ImmutableClass("a", "b");

        System.out.println(immutableClass.getA());
        System.out.println(immutableClass.getB());

        ImmutableClass immutableClass1 = new ImmutableClass("c", "d");

        System.out.println(immutableClass1.getA());
        System.out.println(immutableClass1.getB());


        //Example
        String a = "Taman";
        a = "Test";

        LocalDate currentDate = LocalDate.now();
        LocalDate someDate = LocalDate.of(2022, 12,13);

    }
}
