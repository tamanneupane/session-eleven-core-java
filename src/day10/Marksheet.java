package day10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Marksheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i= 1; i<= 5; i++){
            System.out.println("Enter name of student : ");
//        String name = scanner.next();
//
//        System.out.println("Enter marks obtained in Computer : ");
//        float computer = scanner.nextFloat();
//
//        System.out.println("Enter marks obtained in Maths : ");
//        float math = scanner.nextFloat();
//
//        System.out.println("Enter marks obtained in Science : ");
//        float science = scanner.nextFloat();
//
//        float grandTotal = computer + math + science ;
//
//        float percentage = (grandTotal/300) * 100;
//
//        String message = String.format("%s has obtained %f percentage", name, percentage);
//
//        System.out.println(message);

            double x = 10000.0 / 3.0;
            System.out.println(x);

            String formattedX = String.format("%.2f", x);

            System.out.println(formattedX);

            double formattedDoubleX = Double.parseDouble(formattedX);

            System.out.println(formattedDoubleX);

            float percentage = 85f;
            String grade = "";
            if(percentage >= 80 && percentage <= 100){
                grade = "Distinction";
            }
        }
    }
}
