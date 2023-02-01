package day16;

import java.time.LocalDate;

//public sealed class Manager extends Employee permits Executive{ // Java 17
public  class Manager extends Employee {

    private double bonus;

    public Manager(String name, LocalDate hireDate, double salary, double bonus){
        super(name, hireDate, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getSalary(){
        double totalSalary = super.getSalary() + bonus;
        return totalSalary;
    }

    @Override
    public String getDescription(){
        return  "manager description";
    }

    public void fireEmployee(){
        System.out.println(this.getName());
    }

}
