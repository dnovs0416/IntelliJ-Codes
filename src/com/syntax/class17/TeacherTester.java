package com.syntax.class17;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.name="Zombie";
        teacher.schoolName="Marvard";

        /*
        Because printInfo is public, we can call
        it in other classes and because it is the
        part of Teacher class, it can access the
        private fields which in turn let us access
        those fields
         */
        teacher.printInfo();
    }
}
