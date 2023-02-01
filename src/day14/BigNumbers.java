package day14;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {

    public static void main(String[] args) {

        long value = 999999999;

        BigInteger bigValue = BigInteger.valueOf(value);

        BigInteger bigValue1 = new BigInteger("9999999999999999");
        System.out.println(bigValue1);

        BigInteger addedValue =  bigValue1.add(BigInteger.valueOf(1));

        System.out.println(addedValue);

        //P * T * R / 100

        BigDecimal p = BigDecimal.valueOf(1000);
        BigDecimal t = BigDecimal.valueOf(12);
        BigDecimal r = BigDecimal.valueOf(7.33);

        BigDecimal interest = (p.multiply(t).multiply(r)).divide(BigDecimal.valueOf(100));

        System.out.println(interest);

        BigInteger negativeInteger = BigInteger.valueOf(-2);

        if(negativeInteger.signum() == -1){
            System.out.println("The number is negative");
        }else{
            System.out.println("The number is positive");
        }

    }
}
