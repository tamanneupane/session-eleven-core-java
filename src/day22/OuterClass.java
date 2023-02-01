package day22;

public class OuterClass {

    private int a = 100;

    public class InnerClass{

        public void printValue(){
            System.out.println(OuterClass.this.a);
        }
    }
}
