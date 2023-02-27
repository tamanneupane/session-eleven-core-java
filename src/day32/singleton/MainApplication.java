package day32.singleton;

public class MainApplication {

    public static void main(String[] args) {
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();

        System.out.println(database1);
        System.out.println(database2);

        System.out.println(database1 == database2);
    }

}
