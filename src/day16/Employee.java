package day16;

import java.time.LocalDate;

public class Employee extends Person implements Comparable<Employee> {
    public Employee(String name, LocalDate hireDate, double salary){
        super(name, hireDate, salary);
    }

//    @Override
//    public LocalDate getHireDate() {
//       return LocalDate.of(2023,1,1);
//    }

    @Override
    public String getDescription(){
        someInternalStuff();
        return  "Employee description";
    }

    public void anotherFunction(){
        someInternalStuff();
    }

    private void someInternalStuff(){

    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
