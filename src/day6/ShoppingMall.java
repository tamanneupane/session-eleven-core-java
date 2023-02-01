package day6;

public class ShoppingMall {

    public static void main(String[] args) {
//        Door door1 = new Door();
//
//        Door door2 = new Door();
//
//        Door door3 = new Door();
//
//        Door door4 = new Door();

        // Man enters from door 1

        Door.increaseCount();

        Door.increaseCount();

        Door.decreaseCount();

        System.out.println("Door1 : " + Door.getNumberOfPersonInMall());
        System.out.println("Door2 : " + Door.getNumberOfPersonInMall());
        System.out.println("Door3 : " + Door.getNumberOfPersonInMall());
        System.out.println("Door4 : " + Door.getNumberOfPersonInMall());

    }
}
