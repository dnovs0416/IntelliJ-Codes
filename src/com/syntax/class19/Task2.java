package com.syntax.class19;

public class Task2 {
    /* Create a method that will accept an array as parameters and
will return a sum of all elements from that array.
Method should be visibly only within same package and
accessible by the creating an instance of the class.
 */

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str = "Monday";
        System.out.println(Task2.reverseString("Monday"));
    }

}
