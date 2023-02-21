package day27;

import java.util.*;

public class QueueExample {

    public static void main(String[] args) {

        ArrayDeque<String> names = new ArrayDeque<>();

        names.add("Ram");
        names.add("Shyam");
        names.add("Anish");

        System.out.println(names);

        String removedData = names.peek();

        System.out.println(removedData);

        System.out.println(names);

        ArrayList<String> names1 = new ArrayList<>();

        PriorityQueue<String> namesPriority = new PriorityQueue<>();

        namesPriority.add("Ram");
        namesPriority.add("Shyam");
        namesPriority.add("Anish");

        System.out.println(namesPriority);

        System.out.println(namesPriority.remove());
        System.out.println(namesPriority.remove());
        System.out.println(namesPriority.remove());

        HashMap<String, Object> info = new HashMap<>();
        info.put("gender", "male");
        info.put("age", 30);
        info.put("name", "A");

        System.out.println(info);

        info.put("gender", "female");

        System.out.println(info);

        Set<String> keyset = info.keySet();

        System.out.println(keyset);

        Collection<Object> valueSet = info.values();

        System.out.println(valueSet);



        String name = (String) info.get("name");
//
//        System.out.println(name);
    }
}
