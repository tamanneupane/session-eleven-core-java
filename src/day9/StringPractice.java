package day9;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {

//        String s1 = "Test";
//        s1 = "Taman";
//
//        String s2 = "Test";
//
//        String password = "admin123";
//
//        //save to database
//        password = "";
//        System.gc();

        String s1 = "Hello";
        String s2 = "Hello Taman";

        String s3 = s2.substring(0, 5);

        System.out.println(s1.equals(s3));

        char indexValue = s1.charAt(3);

        System.out.println(indexValue);

        int comparedResult = "taman".compareTo("bishal"); // c - a => a < c
        System.out.println(comparedResult);

        int comparedResult1 = "a".compareToIgnoreCase("A"); // c - a => a < c
        System.out.println(comparedResult1);

//        System.out.println(s1 == s2); // Never use this
//
//        System.out.println(s1.equals(s2));

        //Concatinating the string

        String a = "Hello";
        String b = " Taman, How are you?";

        String result1 = a + b + " Thanks";
        System.out.println(result1);

        String result2 = a.concat(b).concat(" thanks");
        System.out.println(result2);

        String result3 = String.format("Hello %s, How are you? Thanks","Krishu");
        System.out.println(result3);

        boolean isAvailable = result3.contains("thanks");
        System.out.println(isAvailable);

        System.out.println(result1.equalsIgnoreCase(result2));

        int index = "Hello".indexOf("o");
        System.out.println(index);

        String t1 = "";
        String t2 = "    ";

        System.out.println(t1.length());
        System.out.println(t2.length());

        System.out.println(t1.isEmpty());
        System.out.println(t2.trim().isEmpty()); // === t2.isBlank()

        String response = "Rat;Cat;Sat";

        String newResponse = response.replace(";", " ");

        System.out.println(newResponse);

        String[] splittedResponse = response.split(";");

        System.out.println(Arrays.toString(splittedResponse));

        String policyResponse = "06000001,A,60000;06000002,S,30000;06000003,Q,20000";


        String accountType1 = "saving";
        String accountType2 = "Saving";

        String accType = accountType2.toLowerCase();

        System.out.println(accType);

        int i = (int) 2.5f;

        String s = String.valueOf(2);

        String test =  "taman neupane";


    }
}
