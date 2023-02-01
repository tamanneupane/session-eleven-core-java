package day6;

public class Door {

    private static int counter;

    public static void  increaseCount(){
        counter++;
    }

    public static void decreaseCount(){
        counter--;
    }

    public static int getNumberOfPersonInMall(){
        return counter;
    }
}
