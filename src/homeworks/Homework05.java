package homeworks;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args){

        //Task-1
        Scanner scanner = new Scanner(System.in);

     System.out.println("PLease enter 3 whole numbers");
     int num1 = scanner.nextInt();
     int num2 = scanner.nextInt();
     int num3 = scanner.nextInt();

     System.out.println("Max value = " + Math.max(Math.max(num1,num2),num3)+
             "\nMin Value = " + Math.min(Math.min(num1,num2),num3));

     //Task-2
        System.out.println("Please enter 5 whole numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();

        System.out.println("Max value = "+Math.max(Math.max(Math.max(Math.max(number1,number2),number3),number4),number5));
        System.out.println("Min value = "+Math.min(Math.min(Math.min(Math.min(number1,number2),number3),number4),number5));

        //Task-3
        System.out.println("Please enter 2 whole numbers");
        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();

        System.out.println("The difference between numbers is = " +  Math.abs(numb1-numb2));

        //Task-4

        int random1 = (int) (Math.random()*51) +50;
        int random2 = (int) (Math.random()*51) +50;
        int random3 = (int) (Math.random()*51) +50;

        System.out.println("Number 1 = "+random1+"\nNumber 2 = "+random2+"\nNumber3 = "+random3+
                "\nThe sum of the numbers is = "+(random1+random2+random3));

        //Task-5
        double alexMoney = 125;
        double mikeMoney = 220;
        double alexGive = 25.5;

        System.out.println("Alex's money: "+(alexMoney-alexGive)+"\nMike's money: "+(mikeMoney+alexGive));

        //Task-6
        double bicyclePrice = 390;
        double savePerDay = 15.6;

        System.out.println((bicyclePrice/savePerDay));



    }
}
