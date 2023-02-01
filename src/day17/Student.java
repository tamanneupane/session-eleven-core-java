package day17;

import java.util.Objects;

public class Student {

    private String name;

    private int rollNumber;

    private int studentClass;

    public Student(String name, int rollNumber, int studentClass) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.studentClass = studentClass;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getStudentClass() {
        return studentClass;
    }

    // this => Implicitly passed object
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return rollNumber == student.rollNumber && studentClass == student.studentClass && Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, rollNumber, studentClass);
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", studentClass=" + studentClass +
                ", hashcode=" + hashCode() +
                '}';
    }
}
