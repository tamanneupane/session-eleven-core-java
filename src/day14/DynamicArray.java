package day14;

import java.util.Arrays;

public class DynamicArray {

    public static void main(String[] args) {

//        String[] alphabet = new String[2];
//        alphabet[0] = "a";
//        alphabet[1] = "b";

        String[] alphabet = { "a", "b" };

//        alphabet[2] = "c";

        System.out.println(Arrays.toString(alphabet));

        System.out.println(alphabet);

        alphabet = Arrays.copyOf(alphabet,3);

        System.out.println(alphabet);

        System.out.println(Arrays.toString(alphabet));

        alphabet[2] = "c";

        System.out.println(Arrays.toString(alphabet));

        int[] score = new int[10];

        Arrays.fill(score, 100);

        System.out.println(Arrays.toString(score));

    }
}
