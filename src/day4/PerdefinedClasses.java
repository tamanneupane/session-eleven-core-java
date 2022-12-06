package day4;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class PerdefinedClasses {

    public static void main(String[] args) {
        /*
            Type of class
            1. The class whose object cannot be created (Math)
            2. Creating object using new operator
            3. Creating object without using new
        */

        double ceilValue = Math.ceil(5.000001);
        System.out.println(ceilValue);

        double floorValue = Math.floor(5.99999);
        System.out.println(floorValue);

        long roundedValue = Math.round(5.4);
        System.out.println(roundedValue);

        double random = Math.random();
        System.out.println(Math.round(random * 1000));

        int maxValue = Math.min(10,100);
        System.out.println(maxValue);

        // Date, LocalDate, Calendar
//        "2022/01/05"

        Date currentDate1 = new Date(123, Calendar.JANUARY,1);
        System.out.println(currentDate1);
        Date currentDate2 = new Date();
        System.out.println(currentDate2);
        System.out.println(currentDate1.before(currentDate2));

//        LocalDate localDate = new LocalDate();
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate  specificDate1 = LocalDate.of(2022, Month.JANUARY, 1);
//        System.out.println(specificDate1);

        LocalDate  specificDate2 = LocalDate.of(2023, Month.FEBRUARY, 1);
        System.out.println(specificDate2.lengthOfMonth());

        Calendar now = Calendar.getInstance();
        now.setTime(currentDate2);
        System.out.println(now.getTime());
    }
}
