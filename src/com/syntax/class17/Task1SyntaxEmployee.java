package com.syntax.class17;

public class Task1SyntaxEmployee {
    /*
    Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
     */
    String empID;
    int salary;
    //whenever we are sure that two objects of a class can different values for
    // a variable or if we have to share that variable between two or more methods of that
    // class, we should always go with instance variables.
    static String CEO="Sumair";

    public static void main(String[] args) {
        Task1SyntaxEmployee emp=new Task1SyntaxEmployee();
        emp.empID="123";
        emp.salary=200000;

        Task1SyntaxEmployee emp2=new Task1SyntaxEmployee();
        emp2.empID="1234";
        emp2.salary=250000;
        System.out.println(emp.empID);
        System.out.println(emp.salary);
        System.out.println(emp2.empID);
        System.out.println(emp2.salary);
    }
}
