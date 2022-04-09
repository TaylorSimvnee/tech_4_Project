package homeworks;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args){

        //Task-1
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two whole numbers");
        System.out.println("The average of the given 2 numbers  is: " + (scan.nextInt() +scan.nextInt())/2);

        //Task-2

        System.out.println("Please enter two whole numbers");
        int numberOne = scan.nextInt(), numberTwo = scan.nextInt();
        System.out.println("The product of the given 2 numbers is: " + (numberOne*numberTwo));

        //Task-3

        System.out.println("Please enter three whole numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        System.out.println("The 5 multiplied with 5 is = " + (num1*num1) + "\nThe 6 multiplied with the " +
                "6 is = "+ (num2*num2)+"\nThe 10 multiplied with the 10 is = "+(num3*num3));
        //Task-4
        System.out.println("Please enter two whole numbers");
        int wholeNum1 = scan.nextInt();
        int wholeNum2 = scan.nextInt();

        System.out.println("The remainder of 25 % 8 = " + (wholeNum1%wholeNum2));

        //Task-5
        System.out.println("Please enter five whole numbers");
        int wholeNumber1 = scan.nextInt();
        int wholeNumber2 = scan.nextInt();
        int wholeNumber3 = scan.nextInt();
        int wholeNumber4 = scan.nextInt();
        int wholeNumber5 = scan.nextInt();

        System.out.println("The average of the given 5 numbers is : " +
                (wholeNumber1+wholeNumber2+wholeNumber3+wholeNumber4+wholeNumber5)/5);



        //Task-6
        System.out.println("Please enter a whole number");
        int singleNum = scan.nextInt();

        System.out.println(singleNum + "*1= "+(singleNum*1)+"\n7*2= "+(singleNum*2)+"\n7*3= "+(singleNum*3)+"\n7*4= "+(singleNum*4)+
                "\n7*5= "+(singleNum*5)+"\n7*6= "+(singleNum*6)+"\n7*7= "+(singleNum*7)+"\n7*8= "+(singleNum*8)+
                "\n7*9= "+(singleNum*9)+"\n7*10= "+(singleNum*10));


        //Task-7
        System.out.println("Please enter the side of a square");
        int side = scan.nextInt();

        System.out.println("Perimeter of the square = " + (side*4) +"\nArea of the square = " + (side*side));

    }
}
