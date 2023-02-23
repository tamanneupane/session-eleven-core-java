package day29;

import java.util.*;
import java.util.stream.Collectors;

public class ExtraQuestions {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(4, 3, 1, 1, 6, 8, 9);
        int k = 4;
        List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6, 7);

        Set<Integer> window = new HashSet<>(list1.subList(0, k));

        List<Integer> resultList = list2.stream()
                .filter(x -> !window.contains(x))
                .collect(Collectors.toList());

        System.out.println(resultList);
    }
}
