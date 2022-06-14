package com.syntax.class16;

public class Tester {
    public static void main(String[] args) {
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();
        //System.out.println(ac.password); error because it is private
        System.out.println(ac.ssn);
        System.out.println(ac.name);
    }
}
