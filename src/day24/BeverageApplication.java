package day24;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BeverageApplication {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {

        if(args[0].equalsIgnoreCase("DEBUG")){
            logger.setLevel(Level.ALL);
        }else{
            logger.setLevel(Level.WARNING);
        }

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
