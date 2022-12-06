package day3;

public class PolymorphismTest {

    public static void main(String[] args) {

        add(2,3);
        add(2.5f,3.5f);
        add(2.5,3.5);

    }

    public static void add(int a, int b){
        int temp = a + b;
        System.out.println(temp);
    }

    public static void add(float a, float b){
        float temp = a + b;
        System.out.println(temp);
    }

    public static void add(double a, double b){
        double temp = a + b;
        System.out.println(temp);
    }


}
