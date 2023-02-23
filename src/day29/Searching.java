package day29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Searching {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);

        Collections.sort(numbers);

        System.out.println(numbers);

        int index = Collections.binarySearch(numbers, 8);

        System.out.println(index);

        int[] iNumbers = new int[5];
        iNumbers[0] = 5;
        iNumbers[1] = 4;
        iNumbers[2] = 3;
        iNumbers[3] = 2;
        iNumbers[4] = 1;

        ArrayList<Integer> listNumbers =  new ArrayList<>();

        for (int i : iNumbers) {
            listNumbers.add(i);
        }

        List<Integer> list = Arrays.stream(iNumbers).boxed().collect(Collectors.toList());
    }
}
