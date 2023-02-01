package day10;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username : ");
        String userName = sc.next();
        System.out.println("Enter password : ");
        String password = sc.next();


        // Look for the username is available or not
        // If user is available then get that user

        // checkPassword(plainPassword, encryptedPassword)
        // Login is successful

        if(password.equals("password")){
            System.out.println("Login is successful");
        }else{
            System.out.println("Login is not successful");
        }
    }
}
