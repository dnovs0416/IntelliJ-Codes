package com.syntax.interview;

import java.util.*;

public class Repl209 {

    public static void main(String[] args) {
        List<Map<String,Object>> dataList = new ArrayList<>();

        LinkedHashMap<String,Object> appleMap = new LinkedHashMap<>();
        appleMap.put("Items","Apple");
        appleMap.put("Price",20.00);
        appleMap.put("Quantity",10.0);

        dataList.add(appleMap);

        LinkedHashMap<String,Object> orangeMap = new LinkedHashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10.0);

        dataList.add(orangeMap);

        double totalPurchase = 0.0;

        for (Map<String,Object> map : dataList){
            Set<String> keys = map.keySet();
            List<String> list = new ArrayList<String>(keys);

            double subtotal = 0.0;
            double price = 0.0;
            double quantity = 0.0;

            for (String key:keys){
                System.out.print(key+": "+map.get(key)+" ");
                if (key.equals("Price")){
                    price = (double) map.get(key);
                }else if (key.equals("Quantity")){
                    quantity = (double) map.get(key);
                }
            }
            subtotal = price*quantity;
            totalPurchase+=subtotal;

            System.out.println("Subtotal: "+subtotal);
            System.out.println();

        }
        System.out.println("Your Purchase total: "+totalPurchase);

    }
}
