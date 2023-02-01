package day17;

public class CosmicPractice {

    public static void main(String[] args) {

        Student student1 = new Student("ABC", 1, 5);
        Student student2 = new Student("ABC", 1, 5);

        boolean sameStudent = student1.equals(student2);

        System.out.println(sameStudent);

        System.out.println(student1.getName());
        System.out.println(student2.getName());
    }
}
