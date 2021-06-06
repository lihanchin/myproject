package com.johnson;

public class Person {

    String name;
    double height;
    double weight;

    public Person(double weight,double height){
    this.height=height;
    this.weight=weight;
}

    public Person(String name,double weight,double height){
        this(weight, height);
        this.name=name;
    }

    public double bmi(){
        return weight/(height*height);
    }
    public void hello(){
        System.out.println("Hello " + name);
    }
}
