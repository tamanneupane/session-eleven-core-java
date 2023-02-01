package day14;

import java.math.BigDecimal;
import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

//        int a = 5;
//
        String[] names = new String[5];

        System.out.println(Arrays.toString(names));

        names[2] = "Taman";

        System.out.println(Arrays.toString(names));

        String value = names[2];

        System.out.println(value);

        int length = names.length;

        System.out.println(length);
//

        for (int index = 0; index < names.length ; index++){
            System.out.println(index);
            String value1 = names[index];
            System.out.println(value1);
        }

        // Enhanced For Loop
        int index = 0;
        for (String name : names) {
            System.out.println(name);
            System.out.println(index);
            index++;
        }

    }
}
