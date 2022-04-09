package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        /*
        1. Import the scanner
        2.create the object
        3.Print out instructions for user
        4.Print out all user's information in a single print statement with correct formatting
         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter First name");
        String userFirstName = userInput.next();

        System.out.println("Enter last name");
        String userLastName = userInput.next();

        System.out.println("What is your age?");
        int userAge = userInput.nextInt();

        System.out.println("What is your email address?");
        String userEmailAddress = userInput.next();
        userInput.nextLine();

        System.out.println("What is your telephone number?");
        String userPhoneNumber = userInput.nextLine();

        System.out.println("What is your home address?");
        String userHomeAddress = userInput.nextLine();

        System.out.println("\tUser who joined this program is " + userFirstName + " " +
                userLastName + ". " + userFirstName +"'s age is " + userAge + ". " +
                userFirstName + "'s email\naddress is " + userEmailAddress + ", phone " +
                "number " + userPhoneNumber + ", and address is\n" + userHomeAddress +
                ".");



         /*
        1.Print out instructions for user
        2.Print out all user's information in a single print statement
        with correct formatting
         */

        System.out.println("What is your favorite book?");
        String usersFavoriteBook = userInput.nextLine();

        System.out.println("What is your favorite color?");
        String usersFavoriteColor = userInput.next();

        System.out.println("What is your favorite number?");
        int usersFavoriteNumber = userInput.nextInt();

        System.out.println("User's favorite book is: " + usersFavoriteBook + "\n" +
                "User's favorite color is: " + usersFavoriteColor + "\n" +
                "User's favorite number is: " + usersFavoriteNumber );
    }
}
