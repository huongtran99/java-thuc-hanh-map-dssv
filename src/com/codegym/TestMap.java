package com.codegym;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(32, "Smith");
        hashMap.put(31, "Anderson");
        hashMap.put(28, "Lewis");
        hashMap.put(29, "Cook");
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

        Map<Integer, String> linkedHashMapI = new LinkedHashMap<>();
        linkedHashMapI.put(32, "Smith");
        linkedHashMapI.put(31, "Anderson");
        linkedHashMapI.put(28, "Lewis");
        linkedHashMapI.put(29, "Cook");
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMapI.get(31));
    }
}
