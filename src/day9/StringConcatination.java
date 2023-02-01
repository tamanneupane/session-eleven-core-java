package day9;

public class StringConcatination {

    public static void main(String[] args) {
        String message = "Hello" + " this" + " is" + " java" + " class";
        System.out.println(message);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" this");
        sb.append(" is");
        sb.append(" java");
        sb.append(" class");

        String finalString = sb.toString();
        System.out.println(finalString);

        // Java 11
        String repeatedString =  "a".repeat(10000);
        System.out.println(repeatedString);

        // Java 8
        StringBuilder sb1 = new StringBuilder();
        for (int i =0; i < 10000; i++){
            sb1.append("a");
        }
        String finalRepeated = sb.toString();
    }
}
