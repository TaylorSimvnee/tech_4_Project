package collections.arrayLists;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
    public static void main(String[] args){

        /*
        TASK-1
        Create an ArrayList of germanCars and add below items
        BMW
        Mercedes
        Volkswagen

        Then print the list

        RESULT:
        German cars is = [BMW, Mercedes, Volkswagen]
         */
        System.out.println("Task 1");
        ArrayList<String> germanCars = new ArrayList<>();
        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");

        System.out.println("German cars = " + germanCars);


        System.out.println("Task 2");

        /*
        TASK-2
        Create an ArrayList of japaneseCars and add below items
        Honda
        Toyota
        Lexus

        Then print the list

        RESULT:
        Japanese cars = [Honda, Toyota, Lexus]
         */
        ArrayList<String> japaneseCars = new ArrayList<>();
        japaneseCars.add("Honda");
        japaneseCars.add("Toyota");
        japaneseCars.add("Lexus");
        System.out.println("Japanese cars = " + japaneseCars);

        System.out.println("Task 3");
        /*
        TASK-3
        Create an ArrayList of luxuryCars and store below cars
        Maserati
        Tesla
        Range Rover
        Jaguar

        Then print the list

        RESULT:
        Luxury cars = [Maserati, Tesla, Range Rover, Jaguar]
         */

        ArrayList<String> luxuryCars = new ArrayList<>();
        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");

        System.out.println("Luxury cars = " + luxuryCars);

        System.out.println("Add all together");

        ArrayList<String> inventory = new ArrayList<>();
        System.out.println("Begining inventory = " + inventory);

            // adding all german cars
        inventory.addAll(germanCars);
        System.out.println("Inventory after adding german cars = " + inventory);

        // adding all luxury cars
        inventory.addAll(luxuryCars);
        System.out.println("Inventory after adding luxury cars = " + inventory);

        // adding all japanese cars to 0 index
        inventory.addAll(0, japaneseCars);
        System.out.println("Inventory after adding japanese cars = " + inventory);

        System.out.println("inventory size = " + inventory.size());
        System.out.println(inventory.contains("Tesla"));

        //Remove all japanese cars form inventory

        inventory.removeAll(japaneseCars);
        System.out.println("Inventory after removing japanese cars = " + inventory);





    }
}
