package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {

        //Task 1
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter three numbers of your choice");
        int user3Numb1 = userInput.nextInt();
        int user3Numb2 = userInput.nextInt();
        int user3Numb3 = userInput.nextInt();
        System.out.println("The product of the numbers entered is = " + (user3Numb1*user3Numb2
        *user3Numb3));

        //Task 2
        System.out.println("What is your first name?");
        String userFirstName = userInput.next();

        System.out.println("What is your last name?");
        String userLastName = userInput.next();

        System.out.println("What is your year of birth?");
        int userBirthYear = userInput.nextInt();

        System.out.println(userFirstName + " " + userLastName + "'s age is = " + (2022 - userBirthYear));

        userInput.nextLine();


        //Task 3

        System.out.println("What is your full name?");
        String userFullName = userInput.nextLine();
        userInput.nextLine();

        System.out.println("What is your weight?");
        int userWeightKg = userInput.nextInt();

        System.out.println(userFullName + "'s weight is = " + (userWeightKg * 2.205) + " lbs.");
        userInput.nextLine();

        //Task 4

        System.out.println("What is your full name?");
        String userFullName1 = userInput.nextLine();
        userInput.nextLine();

        System.out.println("What is your age?");
        int userAge1 = userInput.nextInt();

        System.out.println("What is your full name?");
        String userFullName2 = userInput.nextLine();
        userInput.nextLine();

        System.out.println("What is your age?");
        int userAge2 = userInput.nextInt();

        System.out.println("What is your full name?");
        String userFullName3 = userInput.nextLine();
        userInput.nextLine();

        System.out.println("What is your age?");
        int userAge3 = userInput.nextInt();

        int minOfUser1And2 = Math.min(userAge1,userAge2);
        int maxOfUser1And2 = Math.max(userAge1,userAge2);

        System.out.println(userFullName1 + "'s age is " + userAge1);
        System.out.println(userFullName2 + "'s age is "+ userAge2 );
        System.out.println(userFullName3 + "'s age is "+ userAge3);
        System.out.println("The average age is " + (userAge1+userAge2+userAge3)/3);
        System.out.println("The eldest age is " + Math.max(maxOfUser1And2,userAge3));
        System.out.println("The youngest age is " + Math.min(minOfUser1And2, userAge3));








    }
}
