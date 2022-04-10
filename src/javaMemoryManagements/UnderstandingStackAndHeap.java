package javaMemoryManagements;

public class UnderstandingStackAndHeap {
    public static void main(String[] args) {

        int age = 45;
        System.out.println(age);


        //reference - object    // here is a clear use of the default constuctor being used. all i created was two instance variables
        Dog dog1 = new Dog();
        System.out.println(dog1); //here i will get the location because i havent overrided the toString method yet
                                    // once i create to string method i would get the default values of the instance variables until i assign them.


        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.breed = "Yorkie";
        dog1.age = 9;




    }
}
