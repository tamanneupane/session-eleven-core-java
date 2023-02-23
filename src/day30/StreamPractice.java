package day30;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {

        Integer[] ints = new Integer[4];
        ints[0] = 5;
        ints[1] = 4;
        ints[2] = 1;
        ints[3] = 3;

        Stream<Integer> intStream = Arrays.stream(ints);

        List<Integer> intList = intStream
                .map(x -> x*2)
                .collect(Collectors.toList());

        System.out.println(intList);

        ArrayList<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Avinab");
        names.add("Shyam");

        Stream<String> nameStream = names.stream();

        List<String> names1 = nameStream
                .limit(2)
                .distinct()
                .filter(x -> !x.equals("Ram"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(names1);

        List<CustomerTransaction> transactions = new ArrayList<>();
        transactions.add(new CustomerTransaction(1, 1000, LocalDate.of(2023, 1, 25)));
        transactions.add(new CustomerTransaction(2, 500,  LocalDate.of(2023, 2, 22)));
        transactions.add(new CustomerTransaction(3, 300,  LocalDate.of(2023, 2, 22)));
        transactions.add(new CustomerTransaction(5, 200,  LocalDate.of(2023, 2, 22)));
        transactions.add(new CustomerTransaction(1, 100,  LocalDate.of(2023, 2, 22)));

        double totalSales = 0;

        for (CustomerTransaction transaction : transactions) {
            totalSales += transaction.getAmount();
        }

        System.out.println(totalSales);

        double total = transactions.stream().filter(item -> item.getId() == 1).collect(Collectors.summarizingDouble(value -> value.getAmount())).getSum();

        System.out.println(total);

    }
}
