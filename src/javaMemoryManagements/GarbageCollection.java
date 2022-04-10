package javaMemoryManagements;

public class GarbageCollection {

    public static void main(String[] args) {


        Dog dog1 = new Dog();
        Dog dog2 = new Dog();


        System.out.println("\n ----- Object references before loosing reference");
        System.out.println(dog1); //Dog@1540e19d
        System.out.println(dog2); //Dog@677327b6
        System.out.println(dog1.equals(dog2)); //false

        System.out.println("\n ----- Object references after loosing reference");
        dog1 = dog2; //Dog1 refernce is lost HERE and is garbage collected by below explicit garbage method.. if not it wouldve been implicitly collected

        //Explicitly doing Garbage Collection -- Interview Q..is there a way that you can do garbage collection yourself?
        System.gc();
        Runtime.getRuntime().gc();

        System.out.println(dog1);//Dog@677327b6
        System.out.println(dog2);//Dog@677327b6
        System.out.println(dog1.equals(dog2)); //true



    }
}
