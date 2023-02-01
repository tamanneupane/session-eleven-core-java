package day13;

public class LoopUseCase {

    public static void main(String[] args) {

//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
//        System.out.println(6);
//        System.out.println(7);
//        System.out.println(8);
//        System.out.println(9);
//        System.out.println(10);

//        boolean isOnline  = true;
//
//        int i = 11;
//        while (isOnline){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("Out of the loop : " + i);
//
//        int j = 11;
//        do {
//            System.out.println(j);
//            j++;
//        }while (j <= 10);
//        System.out.println("Out of the loop : " + j);



//        int i;
//        for (i= 1 ; i <= 10 ; i += 2){
//            System.out.println(i);
//        }
//
//        System.out.println("Out of the loop : " + i);
//
//        for (;;){
//
//        }
        int totalSaving = 0;
        int age = 20;
        for (;;){
            double randomSaving = Math.random() * 1000;
            totalSaving += randomSaving;
            if(totalSaving >= 10000){
                break;
            }
            age++;
        }

        System.out.println("Age at retirement : " + age);

        for (int i = 1; i <= 10; i++){
            if(i == 2){
                System.out.println("Found 2");
                break;
            }
            System.out.println(i);
        }


//        while (true){
//
//        }
//
//        do{
//
//        }while (true);


    }
}
