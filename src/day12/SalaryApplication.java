package day12;

import java.util.Scanner;

public class SalaryApplication {

    public static void main(String[] args) {

        final int target = 5;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter name of sales representative : ");
        String name = sc.nextLine();

        System.out.println("Please enter the no of sale done : ");
        int sales = sc.nextInt();

        System.out.println("Please enter the base salary: ");
        float salary = sc.nextFloat();

        String performance;

        if (sales >= 2 * target) {
            performance = "Excellent";
            salary += 2000;
        } else if (sales >= 1.5 * target) {
            performance = "Satisfactory";
            salary += 1500;
        } else if (sales >= target) {
            performance = "Good";
            salary += 1000;
        } else {
            performance = "fired";
        }


        System.out.println(String.format("The salary of %s for this month is %.2f and performance is %s", name, salary, performance));


    }
}
