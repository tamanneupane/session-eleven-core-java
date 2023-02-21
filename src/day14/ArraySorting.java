package day14;



import java.util.*;

public class ArraySorting {

    public static void main(String[] args) {
        String[] names = {"Taman", "Aman", "Raman"};
        Arrays.sort(names, Comparator.reverseOrder());
        System.out.println(Arrays.toString(names));

        //TODO(Will do this when we will study about the interface)
        Student[] students = new Student[3];
        students[0] = new Student("Taman", 30);
        students[1] = new Student("Aman", 18);
        students[2] = new Student("Raman", 34);

        Arrays.sort(students, (o1, o2) -> o2.getAge() - o1.getAge());

        System.out.println(Arrays.toString(students));

        String random = UUID.randomUUID().toString();
        System.out.println(random);

//        int randomNumber = (int) Math.round(Math.random() * 100);
//        if(randomNumber > 70){
//            randomNumber = 70;
//        }
//        System.out.println(randomNumber);

        int i = 1;
        Random randomInt = new Random();
        LinkedHashSet<Integer> generatedNumbers = new LinkedHashSet<>();
        while (i <= 6){
            int rand = randomInt.nextInt(70);

            if(generatedNumbers.contains(rand)) break;

            if(i < 6)
                generatedNumbers.add(rand);

            if(i == 6 && rand <= 25){
                generatedNumbers.add(rand);
            }

            i++;
        }

        System.out.println(generatedNumbers);

        if(generatedNumbers.size() == 6){
            System.out.println("Winner");
        }else{
            System.out.println("Looser");
        }

    }
}
