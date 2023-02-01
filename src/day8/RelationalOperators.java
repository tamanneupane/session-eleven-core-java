package day8;

import day3.Student;

public class RelationalOperators {

    public static void main(String[] args) {

        int i = 2;
        int j = 2;

        boolean isEqual = i == j; // 2 == 3 .equal
        System.out.println(isEqual);

        boolean isNotEqual = i != j; // 2 != 3
        System.out.println(isNotEqual);

        boolean isGreater = i > j; // 2 > 3
        System.out.println(isGreater);

        boolean isLessThan = i < j; //2 < 3
        System.out.println(isLessThan);

        boolean isLessThanOrEqual = i <= j;
        // 1. i < j => false
        // 2. i == j => true
        // false OR true = > true

        float percentage =60;
        boolean hasPassedExam = percentage >= 32;
        boolean isThirdDivision = percentage <= 60 && percentage >= 32;

        int mark = 40;

        String message = (mark ==  80) ? "Distincition" : "Not distinction";
        System.out.println(message);

        Student student1 = new Student();
        Student student2 = student1;

        Student student3 = new Student();

        System.out.println(student1.equals(student3));
    }
}
