package day10;

import java.io.Console;
import java.util.Arrays;

public class LoginSensitiveInfo {

    public static void main(String[] args) {

        Console con = System.console();

        System.out.println("Enter username : ");
        String userName = con.readLine();
        System.out.println("Enter password : ");
        char[] password = con.readPassword();

        System.out.println("Username : " + userName);
        System.out.println("Password : " + Arrays.toString(password));

    }
}
