package com.syntax.interview;

import java.util.LinkedList;
import java.util.List;

public class Main {
     static boolean isPrimeNum(int num){
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
//        int num = 25;
//
//        for (int i = 2; i < num; i++) {
//            if(num%i==0){
//                System.out.println("not prime");
//                break;
//            }
//        }
        List<Integer> primeList = new LinkedList<>();
        for (int i = 1; i <= 100; i++) {
            if (isPrimeNum(i)) {
                primeList.add(i);
            }
        }

        System.out.println(primeList);
    }
}
