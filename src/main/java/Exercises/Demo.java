package Exercises;

import javax.print.attribute.HashAttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aabba");
        list.add("gaga");
        list.add("zuze");
        list.add("Vakare");
        list.add("Vakare");
        list.add("vakare");

        list = ExcercicesSDA.list(list);
        System.out.println(list);

        list = ExcercicesSDA.list2(list);
        System.out.println(list);


        Map<String,Integer> map = new HashMap<>();
        map.put("Java",18);
        map.put("Python", 1);
        map.put("PHP",0);

        ExcercicesSDA.MapPrint(map);
//
//      Storage.addToStorage("ala", "mala");
//      Storage.addToStorage("ala", "mala");
//      Storage.addToStorage("baba","mala");
//     Storage.addToStorage("tete","kala");
//
//        Storage.printValues(map1, "tete");
//        Storage.findValues(map1, "mala");




        }
    }

