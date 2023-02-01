package day23;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionPractice {

    public static void main(String[] args) {

        ExceptionOccurance exceptionOccurance = new ExceptionOccurance();

        try {
            exceptionOccurance.printValueOfArray();
        }catch (ArrayIndexOutOfBoundsException | FileNotFoundException ex){
            ex.printStackTrace();
        }



        try {
            exceptionOccurance.readFile();
        }catch (FileNotFoundException ex){
            System.out.println("FNF Exception Occurred");
        }

        try {
            exceptionOccurance.saveImage();
        }catch (Exception ex){
            System.out.println("Normal Exception Occurred");
        }


    }
}
