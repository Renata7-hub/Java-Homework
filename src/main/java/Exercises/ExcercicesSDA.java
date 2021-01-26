package Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ExcercicesSDA {

    public static List<String> list(List<String> list) {
//            Collections.sort(list);  1 budas
//            Collections.reverse(list);
        list.sort(String::compareTo);
        Collections.reverse(list);
        return list;
    }

   public static List<String> list2(List<String> list2) {
    //list2.sort(String::compareToIgnoreCase); - 1 budas
    Collections.sort(list2, String.CASE_INSENSITIVE_ORDER);
    Collections.reverse(list2);
    return list2;
   }

    public static void MapPrint (Map<String,Integer>map){
        String[]values = map.entrySet()
                .stream()
                .map(Entry -> "Key: "+ Entry.getKey() + ", Value: " + Entry.getValue())
                .toArray(String[]::new);
        System.out.println(String.join(",\n", values) + '.');
        //Create a method that takes the map as a parameter, where the key is string and the value number,
        // and then prints each map element to the console in the format: Key: <k>, Value: <v>.
        // There should be a comma at the end of every line except the last, and a period at the last.
        // Example:Key: Java, Value: 18,
        // Key: Python, Value: 1,...
        // Key: PHP, Value: 0
    }
}


