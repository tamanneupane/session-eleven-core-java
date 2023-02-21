package day28;

import java.util.*;

public class SmallCollection {

    public static void main(String[] args) {

        List<WeekDay> weekDays = new ArrayList<>();
        weekDays.add(WeekDay.SUNDAY);
        weekDays.add(WeekDay.MONDAY);
        weekDays.add(WeekDay.TUESDAY);
        weekDays.add(WeekDay.WEDNESDAY);
        weekDays.add(WeekDay.THURSDAY);
        weekDays.add(WeekDay.FRIDAY);
        weekDays.add(WeekDay.SATURDAY);

//        EnumSet<WeekDay> weekDays = EnumSet.allOf(WeekDay.class);

        List<WeekDay> unmodifiableList = Collections.unmodifiableList(weekDays);

        System.out.println(unmodifiableList);

//        checkList(unmodifiableList);

        System.out.println(unmodifiableList);

//        List<String> weekDaysUnModifiable = List.of("Sunday","Monday","Tuesday","Wednesday","Thursday"
//        ,"Friday", "Saturday");
//
//        System.out.println(weekDaysUnModifiable);
//
//        checkList(weekDaysUnModifiable);
//
//        System.out.println(weekDaysUnModifiable);

    }

    public static void checkList(List<String> weekDays){
        weekDays.clear();
    }
}
