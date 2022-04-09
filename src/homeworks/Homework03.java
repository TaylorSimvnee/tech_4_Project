package homeworks;


import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args){

                    //Task 1

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter any whole number of your choice.");
        int numb1 = userInput.nextInt();

        System.out.println("Please enter one more whole number of your choice");
        int numb2 = userInput.nextInt();



        System.out.println("The number 1 entered by user is = " + numb1);
        System.out.println("The number 2 entered by user is = " + numb2);
        System.out.println("The sum of number 1 and number 2 entered by user is = " + (numb1 + numb2));


                    //Task 2
        System.out.println("Please enter a number that may have decimals, if desired.");
        double number1 = userInput.nextDouble();

        System.out.println("Please enter one more number that may have decimals, if desired.");
        double number2 = userInput.nextDouble();

        System.out.println("The number 1 entered by user is = " + number1);
        System.out.println("The number 2 entered by user is = " + number2);
        System.out.println("The division of number 1 and number 2 entered by user is = " + (number1 / number2));


                //Task 3
        System.out.println(-10 + 7*5);
        System.out.println((72+24) % 24);
        System.out.println(10 + (-3 * 9/9));
        System.out.println(5 + 18/3 * 3 - (6 % 3));


                //Task 4
        System.out.println("Please enter a number that may have decimals");
        double userNumb1 = userInput.nextDouble();

        System.out.println("Please enter one more number that may have decimals");
        double userNumb2 = userInput.nextDouble();

        System.out.println("The sum of the given numbers is = " + (userNumb1 + userNumb2));
        System.out.println("The product of the given numbers is = " + (userNumb1 * userNumb2));
        System.out.println("The subtraction of the given number is = " +(userNumb1 - userNumb2));
        System.out.println("The division of the given numbers is = " + (userNumb1 / userNumb2));
        System.out.println("The remainder of the gievn numebrs is = " + (userNumb1 % userNumb2));

                //Task 5

        double rectangleWidth = 7.5;
        double rectangleHeight = 10.5;

        System.out.println("The area of the rectangle = " + (rectangleHeight * rectangleWidth));
        System.out.println("The perimeter of the rectangle = " + (rectangleHeight *2 + rectangleWidth*2 ));

                //Task 6

        double softwareEngineerSalary = 90_000.00;

        System.out.println("A Software Engineer in Test can earn " + (softwareEngineerSalary*3) + " in 3 years.");














    }
}
