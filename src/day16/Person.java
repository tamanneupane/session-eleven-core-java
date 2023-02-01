package day16;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private LocalDate hireDate;
    private double salary;

    public Person(String name, LocalDate hireDate, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public final LocalDate getHireDate() {
        return hireDate;
    }

    protected double getSalary() {
        return salary;
    }

    public abstract String getDescription();
}
