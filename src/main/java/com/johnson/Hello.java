package com.johnson;

import java.sql.SQLOutput;

public class Hello {
    public static void main(String[] args) {
       /*System.out.println("Hello world");
       new Person().hello();*/
        Person p = new Person("Johnson" ,75.5,1.77);
        p.name="Johnson";
        p.hello();
        /*p.weight=75.5;
        p.height=1.77;*/
        System.out.println("Your BMI :" + p.bmi() );

    }
}