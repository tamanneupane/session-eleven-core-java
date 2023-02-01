package day8;

public class PrimitiveConversion {

    public static void main(String[] args) {

        //1. Implicit type conversion

        byte b = 2;
        short s = b; // implictly byte is converted to short
        int i = s; // implictly short is converted to int
        long l = i;
        float f = l;
        double d = f;

        //2. Explicit type conversion

        double d1= 2.5;
        float f1 = (float) d1;
        long l1 = (long) f1; // point loss
        int i1 = (int) l1;
        short s1 = (short) i1;
        byte b1 = (byte) s1;


        char a = 'a';
        int aInt = a;

        System.out.println(aInt);

        int bInt = 98;
        char b2 = (char) bInt;

        System.out.println(b2);


        double dou = 0.001;

        int multiplyValue = (int) (500000000 * dou);

        System.out.println(multiplyValue);




    }
}
