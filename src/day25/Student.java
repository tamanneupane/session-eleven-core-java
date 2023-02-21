package day25;

public class Student implements Comparable<Student> {

    private String name;

    private int roll ;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
