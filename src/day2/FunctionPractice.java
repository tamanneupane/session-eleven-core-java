package day2;

public class FunctionPractice {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int result1 = subtract(a,b);
        System.out.println(result1);

        int c = 5;
        int d = 3;

        int result2 = subtract(c,d);
        System.out.println(result2);

        int e = 10;
        int f = 5;

        int result3 = subtract(e,f);
        System.out.println(result3);
    }

    public static int subtract(int x , int y){
        int temp = x - y;
        return temp;
    }
}
