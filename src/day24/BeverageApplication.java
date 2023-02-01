package day24;

import java.io.IOException;
import java.util.Scanner;

public class BeverageApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your email : ");
        String email = sc.nextLine();

        System.out.println("Enter your password : ");
        String password = sc.nextLine();

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        User user = new User(email, password, age);

        UserService userService = new UserService();

        try {
            userService.registerUser(user);
        }catch (AgeRestrictionException | EmailNotValidException ex){
            System.out.println(ex.getMessage());
        }

        sc.close();
    }
}
