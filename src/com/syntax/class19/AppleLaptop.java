package com.syntax.class19;

import com.syntax.class20.Laptop;

public class AppleLaptop extends Laptop {
    void printMake(){
        // can't access because we are in a different package if it is default but can access if it is protected
        System.out.println(make);
    }
}
