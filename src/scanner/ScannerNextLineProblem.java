package scanner;

import java.util.Scanner;
public class ScannerNextLineProblem {
    public static void main(String[] args) {

        /*
        1.

         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your first name?");
        String userFirstname = userInput.next();

        System.out.println("What's your age?");
        int age = userInput.nextInt();

        System.out.println("Is your brain fried?");
        boolean brainStatus = userInput.nextBoolean();
        System.out.println("What is your address");
        userInput.next();
        String address  = userInput.next();

        System.out.println("User name is = " + userFirstname + "\n what is your age?= " + age
                + "\n Is your brain okay? " + brainStatus +
                "\n What is your address?" + address );

        /*
        Write a Java program that asks user to enter 3 numbers and print the sum of those 3 numbers
         */
// () allows for math equations

        
        System.out.print("number 1");
        int userNumber1 = userInput.nextInt();
        System.out.print("numb 2");
        int userNumber2 = userInput.nextInt();
        System.out.print("num 3");
        int userNumber3 = userInput.nextInt();

        System.out.println("Sum = " + (userNumber1 + userNumber2 +
                userNumber3));




    }
}
