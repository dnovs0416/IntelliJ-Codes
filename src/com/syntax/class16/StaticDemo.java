package com.syntax.class16;

public class StaticDemo {

    int noOfEmployees=10;
    String name;

    static void method1(){
        //System.out.println(noOfEmployees); not static variable so static method cannot access it
        //System.out.println(name); because each object will be having a separate copy
        // of this name variable, java gets confused which value to print

    }

    void method2(){
        System.out.println(noOfEmployees);
        System.out.println(name);
    }

    public static void main(String[] args) {
        StaticDemo st=new StaticDemo();
        st.name="Omid";

        StaticDemo st2=new StaticDemo();
        st2.name="Rachid";
    }
}
