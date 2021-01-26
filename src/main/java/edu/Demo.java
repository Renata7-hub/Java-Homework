package edu;


import Exercises.ExcercicesSDA;

import java.util.ArrayList;
import java.util.List;

import static Exercises.ExcercicesSDA.list;

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


    }
}
