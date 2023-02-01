package day16;

import java.time.LocalDate;

public class OfficeApplication {

    public static void main(String[] args) {

        Employee ram = new Employee("Ram", LocalDate.now(), 5000);


        Manager taman = new Manager("Taman", LocalDate.now(), 10000, 1000);

        taman.fireEmployee();
//
//        System.out.println("Employee  : " + ram.getDescription());
//        System.out.println("Manager  : " + taman.getDescription());

        Cleaner abc = new Cleaner("ABC", LocalDate.now(), 10000);
//        abc.fireEmployee();


//        Person person = new Person("Ghost", LocalDate.now(), 0);

        Person ram1 = new Employee("Ram", LocalDate.now(), 5000);
        System.out.println(ram1.getSalary());
        someFunction(ram1);

        Manager manager1 = new Manager("Taman", LocalDate.now(), 10000, 1000);
        System.out.println(manager1.getSalary());
        someFunction(manager1);

//        manager1.fireEmployee();
    }

    public static void someFunction(Person person){
        if(person instanceof Manager) {
            ((Manager) person).fireEmployee();
        }
    }
}
