package day12;

import java.util.Scanner;

public class SwitchStatementPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter name of day : ");
        String today = sc.nextLine();

        String specialDish;

//        if(today.equals("SUNDAY")){
//            specialDish = "A Momo";
//        } else if (today.equals("MONDAY")) {
//            specialDish = "B Momo";
//        }else if (today.equals("TUESDAY")) {
//            specialDish = "C Momo";
//        }else if (today.equals("WEDNESDAY")) {
//            specialDish = "D Momo";
//        }else if (today.equals("THURSDAY")) {
//            specialDish = "E Momo";
//        }else if (today.equals("FRIDAY")) {
//            specialDish = "F Momo";
//        }else if (today.equals("SATURDAY")) {
//            specialDish = "F Momo";
//        }else{
//            specialDish = "Wrong Input. Please enter the day correctly";
//        }

        switch (today.toUpperCase()) {
            case "SUNDAY":
            case "WEDNESDAY":
                specialDish = "A Momo";
                break;
            case "MONDAY":
                specialDish = "B Momo";
                break;
            case "TUESDAY":
                specialDish = "C Momo";
                break;
            case "THURSDAY":
                specialDish = "E Momo";
                break;
            case "FRIDAY":
                specialDish = "F Momo";
                break;
            case "SATURDAY":
                specialDish = "G Momo";
                break;
            default:
                specialDish = "Wrong Input. Please enter the day correctly";
                break;
        }

//        String specialDish = switch (today.toUpperCase()) {
//            case "SUNDAY", "WEDNESDAY" -> "A Momo";
//            case "MONDAY" -> "B Momo";
//            case "TUESDAY" -> "C Momo";
//            case "THURSDAY" -> "E Momo";
//            case "FRIDAY" -> "F Momo";
//            case "SATURDAY" -> "G Momo";
//            default -> "Wrong Input. Please enter the day correctly";
//        };

        System.out.println(specialDish);

    }
}
