package scanner;
import java.util.Scanner;
public class LearningScanner {
    public static void main(String[] args){

        /*
        1. I'm going to use scanner class for creating my object
        2. I will use the object for reading the data.
         */

        Scanner scanner = new Scanner(System.in); // Creating a scanner object

       System.out.println("PlASE PUT YOUR FIRST NAME"); // This is what i want the user to put(then they will put their input in next line)
       String firstName = scanner.next(); //storing the first name from the user (input from keyboard)

        System.out.println("PLEASE PUT YOUR LAST NAME"); //second set of instructions for user
        String lastName = scanner.next(); // storing the name from user (input from keyboard)
        System.out.println("The user put =" + firstName); // Printing my object/variable
        System.out.println("The user put =" + lastName ); //Printing the stored data from keyboard input



    }
}
