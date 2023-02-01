package day23;

import java.io.FileNotFoundException;

public class ExceptionOccurance {

    public void printValueOfArray() throws ArrayIndexOutOfBoundsException, FileNotFoundException {
        // array , position
        throw new ArrayIndexOutOfBoundsException();
    }

    public void readFile() throws FileNotFoundException{

        throw new FileNotFoundException();
    }

    public void saveImage() throws Exception{
        throw new Exception();
    }

}
