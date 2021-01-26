package Exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Storage {
    //Exercise 4.
    // Create a Storage class that will have a private Map field, a public constructor, and methods:
    // addToStorage(String key, String value)→ adding elements to the storage
    // printValues(String key) → displaying all elements under a given key
    // findValues(String value)→ displaying all keys that have a given value
    // The Storage class should allow you to store multiple values under one key

    private Map<String, List<String>> inventory;

    public Storage() {
        inventory = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        inventory.computeIfAbsent(key, t -> new ArrayList<>());
        inventory.get(key).add(value);
    }

    public void printValues(String key) {
        inventory.get(key).stream().forEach(System.out::println);
        // System.out.println(inventory.keySet()); -irgi tinka
    }

    public List<String> findKeys(String value) {
//            Stream<String> keys = map1.entrySet()
//                .stream()
//                .filter(x -> value.equals(x.getValue()))
//                .map(Map.Entry::getKey);
        return inventory
                .entrySet()
                .stream()
                .filter(kvp -> kvp.getValue().contains(value))
                .map(kvp -> kvp.getKey())
                .collect(Collectors.toList());
    }
}
