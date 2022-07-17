package com.syntax.interview;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Repl {
    List<String> removeElement(List<String> x){
        for(int i=0; i< x.size(); i++){
            if(x.get(i).startsWith("A")){
                x.remove(i);
            }
        }
        return x;
    }
    public static void main(String[] args) {

        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        Repl repl = new Repl();
        repl.removeElement(countries);
        System.out.println(countries);
    }
}
