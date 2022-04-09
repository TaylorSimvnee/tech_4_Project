package scanner;

import java.util.Scanner;
public class ScannerExercises {
    public static void main(String[] args) {


        /*
         Write a Java program that reads 1stName and LastNAme from user then print those as full name in 1 statement
         */

        /*
        Pseudo code:
        1. create an object -> scanner
        2.Print out instructions about what we need
        3. Use next() method for reading
        4. Print out the first and last name in one statement
         */

        Scanner input = new Scanner(System.in); // only use '.' after the object before the method

        System.out.println("What is your first name");
        String userFirstName = input.nextLine();

        System.out.println("What is your last name?");
        String userLastName = input.nextLine();

        System.out.println("First name and the last name of the user is = " + userFirstName + " " + userLastName);


        /*
        1. Print out instructions about what we need
        3. Use next() method for reading
        4. Print out the full address in one statement
         */
// if you use next() (any kind int line etc.) to prevent the next scanner from grabbing the empty space, use a new scanner.
        System.out.println("What is your address?");
        String userAddress = input.nextLine();

        System.out.println("The users address is = " + userAddress);





    }
}
