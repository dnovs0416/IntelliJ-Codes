package com.syntax.interview;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintValueAndKey {

    public static void main(String[] args) {

        LinkedHashMap<String, String> str = new LinkedHashMap<>();
        str.put("1 item", "apple");
        str.put("2 item", "banana");
        str.put("3 item", "pear");
        str.put("4 item", "tomato");
        str.put("5 item", "mango");
        str.put("6 item", "kiwi");

        Set<Map.Entry<String,String>> entries=str.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Key is "+entry.getKey()+" and values is "+entry.getValue());
        }
    }
}
