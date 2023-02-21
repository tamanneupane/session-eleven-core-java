package day26;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ram");
        names.add("Shyam");
        names.add("Ram");

        System.out.println(names);

        HashSet<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);

        LinkedHashSet<Student> students = new LinkedHashSet<>();
        students.add(new Student("Z", 1));
        students.add(new Student("A", 10));
        students.add(new Student("Z", 10));

        System.out.println(students);

        int[] A = {1,2,4,4};

        HashSet<Integer> uniqueNumber = new HashSet<>();
        for (int value : A){
            uniqueNumber.add(value);
        }

        System.out.println(uniqueNumber);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);

        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println(numbers);

    }
}
