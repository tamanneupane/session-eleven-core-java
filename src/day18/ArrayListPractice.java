package day18;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListPractice {

    public static void main(String[] args) {

//        Student[] students = new Student[5];
//
//        students[0] = new Student("A", 2, 1);
//        students[1] = new Student("B", 2, 1);
//        students[2] = new Student("C", 2, 1);
//        students[3] = new Student("D", 2, 1);
//        students[4] = new Student("E", 2, 1);
//        students[5] = new Student("F", 2, 1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("A", 2, 1)); // 0 => Index
        students.add(new Student("B", 1, 1)); // 1 => Index
        students.add(new Student("C", 5, 1)); // 2 => Index , 3 => Index
        students.add(new Student("D", 3, 1)); // 3 => Index , 4 => Index

        System.out.println(students);

        students.add(2, new Student("H", 8, 1)); // 2 => Index

        System.out.println(students);

        students.set(2, new Student("G", 8, 1));

        System.out.println(students);

        students.remove(2);

        System.out.println(students);

        Student studentToBeDeleted = new Student("D", 3, 1);
        students.remove(studentToBeDeleted);
        System.out.println(studentToBeDeleted);
        System.out.println(students);

        students.removeIf(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getRollNumber() == 1;
            }
        });

        System.out.println(students);

        students.clear();

        System.out.println(students);

        ArrayList<Student> studentListToBeDeleted = new ArrayList<>();
        studentListToBeDeleted.add(new Student("A", 2, 1));
        studentListToBeDeleted.add(new Student("B", 1, 1));

        students.removeAll(studentListToBeDeleted);


        ArrayList<Student> students1 = new ArrayList<>();
        students1.ensureCapacity(4);
        students1.add(new Student("A", 2, 1)); // 0 => Index
        students1.add(new Student("B", 1, 1)); // 1 => Index
        students1.add(new Student("C", 5, 1)); // 2 => Index , 3 => Index
        students1.add(new Student("D", 3, 1)); // 3 => Index , 4 => Index
        students1.add(new Student("E", 6, 1)); // 4 => Index , 4 => Index
        students1.add(new Student("F", 7, 1)); // 4 => Index , 4 => Index

        ArrayList<Student> students2 = new ArrayList<>(students1);
        System.out.println(students2.contains(new Student("D", 3, 1)));
        System.out.println(students2.indexOf(new Student("D", 3, 1)));

        //arr[0]

        Student student = students2.get(4);

        for (int i = 0; i < students2.size(); i++){
            Student stud = students2.get(i);
            System.out.println(stud);
        }

        for (Student s : students2) {
            System.out.println(s);
        }

        students2.forEach(System.out::println);

        boolean isListEmpty = students.isEmpty();
        System.out.println(isListEmpty);
        System.out.println(students.size());

        // (3, 5)
        List<Student> subList = students1.subList(students1.size() - 2, students1.size());
        System.out.println(subList);
        subList.add(null);
        System.out.println(subList);

        ArrayList<Student> copyOfStudents = new ArrayList<>(students1);

        Collections.reverse(copyOfStudents);

        System.out.println(students1);

        System.out.println(copyOfStudents);

        for (int i = students2.size() - 1; i >= 0; i--){

        }

    }
}
