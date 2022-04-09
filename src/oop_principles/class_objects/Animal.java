package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    //default constructor
    public Animal(){

    }
     //Create constructor with 6 arguments
    public Animal(String name, String color, int age, boolean isHerbivore, boolean isCarnivore, boolean isOmnivore){
        //I should assign these local variables into instance variables
        this.name = name;
        this.age = age; //this. keyword = current object reference...im saying this declared object = the local variable
        this.color = color;
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
    }


    //Fields of an Animal instance
    public static final boolean hasEyes = true;
    public String name;
    public String color;
    public int age;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;

    @Override //toStirng is typically last in the class
    public String toString() {
        String s = "Animal{";
        if(this.name != null) s +=   "name='" + this.name + '\'';
        if(this.color != null) s += ", color='" + this.color + '\'';
        if(this.age != 0) s +=  ", age=" + this.age;
        if(this.isCarnivore) s += ", isCarnivore=" + this.isCarnivore;
        if(this.isHerbivore) s += ", isHerbivore=" + this.isHerbivore;
        if(this.isOmnivore) s += ", isOmnivore=" + this.isOmnivore;
        s += '}';
        return s;
    }

    public static void main(String[] args) {

        /*
        Create an animal object called a1 and define its information as below
        Cow
        3
        Black
        Herbivore
         */

        Animal a1 = new Animal();
        a1.name = "cow";
        a1.age = 3;
        a1.color = "Black";
        a1.isHerbivore = true;

        System.out.println(a1);

        Animal mine = new Animal("Kanari", "Brown", 9, false, false,true);
        System.out.println(mine);
        Animal a2 = new Animal("Cat", "Grey", 1, false, false,true);
        System.out.println(a2);
        //This constructor is my own. not the default, when i create the object it is set to take defining characteristics in the ()
        Animal mine2 = new Animal("Horse", "Deep Brown", 3, true, false, false);
        System.out.println(mine2);



        /*
        Create a3 object with below info
        Parrot
        2
        White
        Herbivore

        Print it as well
         */

        Animal a3 = new Animal("Parrot", "White", 2, true, false, false);
        System.out.println(a3);

          /*
        Create a4 object with below info
        Lion
        4
        Beige
        Carnivore

        Print it as well
         */

        Animal a4 = new Animal("Lion", "Beige", 4, false, true, false);
        System.out.println(a4);


        List<Animal> zoo = new ArrayList<>();
        zoo.add(a1);
        zoo.add(a2);
        zoo.add(a3);
        zoo.add(a4);


        int countHerb = 0;
        int countCarnivore = 0;
        int countOmnivore = 0;

        for (Animal animal : zoo) {
            if(animal.isHerbivore)countHerb++;
            else if(animal.isCarnivore)countCarnivore++;
            else countOmnivore++;  // use if else-if else bc they are all dependant
                                    // use if if if ... if they are independent and need to be checked independently
        }
        System.out.println("Herbivore = " + countHerb );
        System.out.println("Carnivore = " + countCarnivore );
        System.out.println("Omnivore = " + countOmnivore );


            //java stream
        int countH = (int) zoo.stream().filter(animal -> animal.isHerbivore).count();
        int countC = (int) zoo.stream().filter(animal -> animal.isCarnivore).count();
        int countO = (int) zoo.stream().filter(animal -> animal.isOmnivore).count();

        System.out.println("Herbivore = " + countHerb);
        System.out.println("Omnivore = " + countOmnivore);
        System.out.println("Carnivore = " + countCarnivore);
    }

}
