package oop_principles.class_objects;

public class Car {

    //Class = template

    //Default constructor
    public Car(){

    }
    /*
    Attributes of a car
    Make, model, year, color
    ATTRIBUTES ARE DEFINING WHAT EVERY OBJECT OF CAR SHOULD HAVE
     */

    //Declaring attributes of car
    public String make;
    public String model;
    public int year;
    public String color;
    //Here the attributes are declared... you can also declare and assign -->
    // If so, when an object is created...by default they will be the assigned value

    //Defining behaviors of car objects
    //What car does

    public void drives(){
        System.out.println("This car drives");
    }

    public void honks(){
        System.out.println("This car honks");
    }


    //Shortcut = right click -> Generate -> toString ... This is generating to String method
    @Override // this is an Annotation - telling us this info is overridden
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
