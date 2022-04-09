package homeworks;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args){

        //Task-1

        String s1 = "5", s2 = "10";

        int numb1 = Integer.parseInt(s1);
        int numb2 = Integer.parseInt(s2);

        System.out.println("-Sum of 5 and 10 is = " + (numb1+numb2)+
                "\n-Product of 5 and 10 is = " + (numb1*numb2)+
                "\n-Division of 5 and 10 is = " + (numb1/numb2)+
                "\n-Subtraction of 5 and 10 is = " + (numb1-numb2)+
                "\n-Remainder of 5 and 10 is = " + (numb1%numb2));

        //Task-2

        String s_1 = "200", s_2 = "-50";

        int number1 = Integer.parseInt(s_1);
        int number2 = Integer.parseInt(s_2);

        System.out.println("The greatest value is = " + Math.max(number1,number2)+
                "\nThe smallest value is = "+ Math.min(number1,number2)+
                "\nThe average is = "+ (number1+number2)/2 + "\nThe absolute difference is = " +
                Math.abs(number1-number2));

        //Task-3

        double save = .96;

        System.out.println((int)(24 / save) + " days");
        System.out.println((int)(168/save)+ " days");
        System.out.println("$"+save*150);

        //Task-4

        int computerPrice = 1250;
        double savingsPerDay = 62.5;

        System.out.println((int) (computerPrice/savingsPerDay));

        //Task-5
        int newCar = 14_265;
        double option1 = 475.50;
        int option2 = 951;

        System.out.println("Option 1 will take " + (int)(newCar/option1)+" months"+
                            "\nOption 2 will take " + (newCar/option2)+" months");

        //Task-6
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int number1Int = scan.nextInt();
        int number2Int = scan.nextInt();

        System.out.println((double) number1Int / (double) number2Int);







    }
}
