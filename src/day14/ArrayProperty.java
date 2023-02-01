package day14;

import java.util.Arrays;

public class ArrayProperty {

    static  int[] a ={1,3,2,8,4};
    public static void main(String[] args) {

//        System.out.println(Arrays.toString(a));
//
//        someFunction(Arrays.copyOf(a,a.length));
//
//        System.out.println(Arrays.toString(a));

//        int i = 10;
//
//        anotherFunction(i);
//
//        System.out.println(i);

//        int[] aCopy = Arrays.copyOf(a, a.length);
//
//        aCopy[0] = 100;
//
//        System.out.println(Arrays.toString(a));

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

    }

    public static void someFunction(int[] a){
        a[0] = 10;
    }

    public static void anotherFunction(int i){
        i = 20;
    }


    public int[] getMyArray(){
        return Arrays.copyOf(a, a.length);
    }
}
