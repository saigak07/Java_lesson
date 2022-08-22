package Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Collections {



    public static void main (String[] args){

        String[] stringArray1 = new String[]  {"dog", "cat", "bird", "house", "dog", "apple", "cat", "apple", "chair", "spoon"};
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : stringArray1) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        System.out.println("Elements and entry numbers");
        System.out.println(map);


        Set<String> uniq = new HashSet<>(Arrays.asList(stringArray1));
        System.out.println("Unique Elements");
        System.out.println(uniq);

        PhoneList phoneList = new PhoneList();

        phoneList.add("Ivanov", "123");
        phoneList.add("Petrov", "456");
        phoneList.add("Petrov", "789");

        System.out.println("Ivanov " + phoneList.get("Ivanov"));

    }
}
