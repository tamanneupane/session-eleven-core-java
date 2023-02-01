package day8;

public class operators {

    public static void main(String[] args) {

        //Assignment Operator
        int d = 5;

        // Combining Assignment operator with Arithmetic

        int b = 0;

        b = b + 1; // b =0 => b = 1;
        b = b + 1; // b = 1 => b = 2;
        b = b + 1; // b = 2 =>  b = 3;

        // 5,4,3,2,1
//        int sum = 0;
//        sum *=  5; // ===> sum = 0 * 5 = 0;
//        sum *=  4; // ===> sum = 0 * 4 = 0;
//        sum *= 3;  // ===> sum = 0 * 3 = 0;
//        sum *=  2; // ===> sum = 0 * 2 = 0;
//        sum *=  1; // ===> sum = 0 * 1 = 0;

//        System.out.println(sum);

        int newNumber = 123456;
        int sum = 0;

        int reminder = newNumber % 10;
        int quotient = newNumber / 10;

        System.out.println(reminder);
        System.out.println(quotient);

        sum += reminder;

        newNumber =  quotient;

        int reminder2 =  newNumber % 10;
        int quotient2 =  newNumber / 10;

        System.out.println(reminder2);
        System.out.println(quotient2);

        sum += reminder2;

        newNumber = quotient2;

        // 123456789

        // Increment and decrement operators

        int i = 0;

        i += 1; // i = i + 1;

        ++i; // Pre increment
        i++; // post increment

        int m = 7;
        int n = 7;
        int a = 2 * ++m; // now a is 16, m is 8 int b = 2 * n++; // now b is 14, n is 8
        int c = 2 * n++; // now b is 14, n is 8

        System.out.println("a = " + a);
        System.out.println("c = " +c);

        System.out.println("m = " +m);
        System.out.println("n = " +n);


    }
}
