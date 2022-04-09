package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {

        //First... you can create an object with the empty car class bc of the default constructor
        Car car1 = new Car(); // when your print this object it will give you the location in the memory
        System.out.println(car1); //oop_principles.class_objects.Car@1540e19d
        //All objects can use its parents' methods..in this case...it can use object methods

        // Object = instance of a class

        car1.color = "Black";
        car1.make = "Dodge";
        car1.model = "Challenger";
        car1.year = 2020;

        System.out.println(car1.color); //if the attributes are not defined as above or defined in class..the attributes will print null
        System.out.print(" -" + car1.make);
        System.out.print(" -" +car1.model);
        System.out.print(" -" +car1.year);
        System.out.println("\n");
        System.out.println(car1);

        car1.drives(); //This car drives
        car1.honks(); //This car honks

        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        car4.make = "Tesla";
        car2.make = "Honda";
        car3.make = "BMW";


        System.out.println("------Car list ------");
        List<Car> myCars = new ArrayList<>();
        myCars.add(car1);
        myCars.add(car2);
        myCars.add(car3);
        myCars.add(car4);

        for (Car myCar : myCars) {
            if(myCar.make.equals("Tesla"))System.out.println(myCar);
        }

        //Print cars that are Tesla




    }
}
