package day20;

public enum WeekDays {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private int abbr;
    WeekDays(int abbr){
        System.out.println("Constructor getting called");
        this.abbr = abbr;
    }

    @Override
    public String toString() {
        return String.valueOf(this.abbr);
    }
}
