import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        System.out.println(lastKDigits(Arrays.asList(4,5,6)));;
    }

    public static int multiply(List<Integer> ar){
        Integer product = ar.stream().reduce(1, (a, b) -> a * b);
        if(String.valueOf(product).length() < 2){
            return -1;
        }
        product = product % 100;
        if(product == 0){
            return -1;
        }
        return product;
    }

    // Returns last k digits in product of a[]
    static int lastKDigits(List<Integer>ar)
    {
        int num = (int)(Math.pow(10, 2)); // Last two digits
        System.out.println(num);
        int mul = ar.get(0) % num;

        for (int i = 1; i < ar.size(); i++) {
            ar.set(i,ar.get(i) % num);
            mul = (ar.get(i) * mul) % num;
        }
        return mul;
    }
}
