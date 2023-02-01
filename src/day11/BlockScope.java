package day11;

import day3.Student;

public class BlockScope {
//    static int a = 0;
//    static int b = 0;
    // jpg, png, jpeg => wepb (next gen image format)

    // Bitmap image

    static String URL = "www.something.com";



    public static void main(String[] args) {
        Student student = new Student();
        int a = 2;
        int b = 2;

        add(a, b);
        mul(a, b);

        // image = null;

//        System.gc();
//        Runtime.getRuntime().gc();

        doingSomethingForVeryLongTime();
    }

    public static void add(int a, int b){

        int temp = a + b;
        System.out.println(temp);
    }

    public static void mul(int a, int b){

        int temp = a * b;
        System.out.println(temp);
    }

    public static void doingSomethingForVeryLongTime(){

        // doesnot use a and b
    }
}
