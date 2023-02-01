package day20;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.logging.Logger;

public class EnumPractice {

    public static void main(String[] args) {

//        ArrayList<WeekDays> weekDays = new ArrayList<>();
//        weekDays.add(WeekDays.SUNDAY);
//        weekDays.add(WeekDays.MONDAY);
//        weekDays.add(WeekDays.TUESDAY);
//        weekDays.add(WeekDays.WEDNESDAY);
//        weekDays.add(WeekDays.THURSDAY);
//        weekDays.add(WeekDays.FRIDAY);
//        weekDays.add(WeekDays.SATURDAY);
//        weekDays.add(WeekDays.ALL);
//
//        System.out.println(weekDays);

//        EnumSet<WeekDays> allDays = EnumSet.allOf(WeekDays.class);
//        System.out.println(allDays);
//
//        EnumSet<WeekDays> otherDaysBesideWeekEnd = EnumSet.range(WeekDays.MONDAY, WeekDays.FRIDAY);
//        System.out.println(otherDaysBesideWeekEnd);
//
//        EnumSet<WeekDays> someSpecificDays = EnumSet.of(WeekDays.SUNDAY, WeekDays.TUESDAY, WeekDays.THURSDAY, WeekDays.SATURDAY);
//        System.out.println(someSpecificDays);

//        EnumSet<WeekDays> emptyDays = EnumSet.noneOf(WeekDays.class);
//        System.out.println(emptyDays);

        System.out.println(WeekDays.WEDNESDAY);

        Logger.getGlobal().info(WeekDays.WEDNESDAY.toString());
    }
}
