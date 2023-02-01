package day3;

public class SchoolApp {

    public static void main(String[] args) {

        Student ram = new Student();
        ram.getName();

        ram.setGender(Gender.MALE);

        System.out.println(ram.getGender().toString());

        Teacher hari = new Teacher();
        hari.getAge();

        Person person1 = new Student();

        Person person2 = new Teacher();

//        Student stud = new Person();

    }
}
