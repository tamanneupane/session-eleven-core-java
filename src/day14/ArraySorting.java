package day14;



import java.util.Arrays;
import java.util.Comparator;

public class ArraySorting {

    public static void main(String[] args) {
        String[] names = {"Taman", "Aman", "Raman"};
        Arrays.sort(names, Comparator.reverseOrder());
        System.out.println(Arrays.toString(names));

        //TODO(Will do this when we will study about the interface)
        Student[] students = new Student[3];
        students[0] = new Student("Taman", 30);
        students[1] = new Student("Aman", 18);
        students[2] = new Student("Raman", 34);

        Arrays.sort(students, (o1, o2) -> o2.getAge() - o1.getAge());

        System.out.println(Arrays.toString(students));
    }
}
