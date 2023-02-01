package day24;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {

    private static final String EMAIL_REGEX = "^(.+)@(.+)$";

    public boolean registerUser(User user) throws AgeRestrictionException{
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher emailMatcher = pattern.matcher(user.getEmail());

        if(!emailMatcher.matches()){
            throw new EmailNotValidException("User is not registered because email is not valid");
        }

        //TODO Password verification (One capital, length 8 ,1 number,1 special character) => Regex
        // Powered1@



        if(user.getAge() < 18){
            throw new AgeRestrictionException("User is not registered because of invalid age");
        }

        // User save to the database
        System.out.println("User register successfully");
        System.out.println(user);
        return true;
    }

    public boolean loginUser(){
        return true;
    }
}
