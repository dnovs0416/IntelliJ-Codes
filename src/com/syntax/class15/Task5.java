package com.syntax.class15;

public class Task5 {
    /*
    Create a method createEmail(). Based on values of user name,
    lastName and email type, your method should return complete email Address.
    Example: createEmail(John, Snow, gmail) -> johnsnow@gmial.com
     */

    String completeEmail(String firstName,String lastName,String emailType){
        return firstName+lastName+"@"+emailType+".com";
    }


    public static void main(String[] args) {
        Task5 task5=new Task5();
        System.out.println(task5.completeEmail("Dave", "Novales","gmail"));
    }
}
