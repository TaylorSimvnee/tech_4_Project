package homeworks;
import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {


        //Task-1
        int num1 = (int) (Math.random()* 11);
        int num2 = (int) (Math.random()* 11);
        int num3 = (int) (Math.random()* 11);
        int num4 = (int) (Math.random()* 11);

        int i = 1;
        System.out.println("Number " + i++ +"= " + num1);
        System.out.println("Number " + i++ +"= " + num2);
        System.out.println("Number " + i++ +"= " + num3);
        System.out.println("Number " + i +"= " + num4);

        int five = 5;
        System.out.println("Absolute difference of " + num1+ " with" + five + "is = " + Math.abs(num1-5));
        System.out.println("Absolute difference of " + num1+ " with" + five + "is = " + Math.abs(num2-5));
        System.out.println("Absolute difference of " + num1+ " with" + five + "is = " + Math.abs(num3-5));
        System.out.println("Absolute difference of " + num1+ " with" + five + "is = " + Math.abs(num4-5));

        System.out.println("Greatest number is = " + Math.max(Math.max(Math.max(num1,num2),num3),num4));
        System.out.println("Greatest number is = " + Math.min(Math.min(Math.min(num1,num2),num3),num4));

        //Task-2

        int numb1 =(int) (Math.random()* 101)-50;
        int numb2 =(int) (Math.random()* 101)-50;
        int numb3 =(int) (Math.random()* 101)-50;
        int numb4 =(int) (Math.random()* 101)-50;
        int numb5 =(int) (Math.random()* 101)-50;
        int numb6 =(int) (Math.random()* 101)-50;
        int numb7 =(int) (Math.random()* 101)-50;
        int numb8 =(int) (Math.random()* 101)-50;

        System.out.println("Number 1 = " + numb1);
        System.out.println("Number 2 = " + numb2);
        System.out.println("Number 3 = " + numb3);
        System.out.println("Number 4 = " + numb4);
        System.out.println("Number 5 = " + numb5);
        System.out.println("Number 6 = " + numb6);
        System.out.println("Number 7 = " + numb7);
        System.out.println("Number 8 = " + numb8);

        int largeRandom =
            Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(numb1,numb2),numb3),numb4),numb5),numb6),numb7),numb8);
        int smallRandom =
            Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(numb1,numb2),numb3),numb4),numb5),numb6),numb7),numb8);
        System.out.println("Greatest number is = " + largeRandom);

        System.out.println("Smallest number is = " + smallRandom);

        System.out.println("Average of 8 numbers is = " + ((numb1+numb2+numb3+numb4+numb5+numb6+numb7+numb8)/8));
        System.out.println("Absolute difference between smallest and greatest is " + Math.abs(largeRandom - smallRandom));

        if (numb3>0)System.out.println("3rd number is positive = true");
        else System.out.println("3rd number is positive = false");

        if (numb5>0) System.out.println("5th number is positive = true");
        else if (numb5<0) System.out.println("5th number is positive = false");

        if (numb1==0 || numb2==0 || numb3==0|| numb4==0|| numb5==0|| numb6==0|| numb7==0|| numb8==0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else{
            System.out.println("There is at least one zero among those numbers is = false");
        }


        //Task-3
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 7 numbers between 0 and 50");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();
        int number6 = input.nextInt();
        int number7 = input.nextInt();


        System.out.println("Number 1 = " + number1);
        System.out.println("Number 2 = " + number2);
        System.out.println("Number 3 = " + number3);
        System.out.println("Number 4 = " + number4);
        System.out.println("Number 5 = " + number5);
        System.out.println("Number 6 = " + number6);
        System.out.println("Number 7 = " + number7);

        System.out.println("Greatest number is = " +
                Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(number1,number2),number3),number4),number5),number6),number7));
        System.out.println("Smallest number is = " +
                Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(number1,number2),number3),number4),number5),number6),number7));
        System.out.println("Average of 7 numbers is = " + (number1+number2+number3+number4+number5+number6+number7)/7);

        System.out.println("First number is greater than or equal to 10 =" + (number1>=10));
        //instead of using if else below (line 102-105), we can use simple print out above (line 99)

//        if (number1>=10){
//            System.out.println("First number is greater than or equal to 10 = true");
//        }else{
//            System.out.println("First number is greater than or equal to 10 = false");
//        }

        if (number7<=40){
            System.out.println("Last number is less than or equal to 40 = true");
        }else {
            System.out.println("Last number is less than or equal to 40 = false");
        }


        if (number1>25 && number7>25){
            System.out.println("Both first and last numbers are greater than 25 = " + true );
        }
        else{
            System.out.println("Both first and last numbers are greater than 25 = " + false);
        }

        if (number1== 0 ||number1== 50 || number2== 0 ||number2== 50 ||number3== 0 ||number3== 50
                ||number4== 0 ||number4== 50 ||number5== 0 || number5== 50 ||number6== 0 ||number6== 50
                ||number7== 0 || number7== 50){
            System.out.println("At least oe of those numbers is 0 or 50 = true");
        }else {
            System.out.println("At least oe of those numbers is 0 or 50 = false");
        }

        if (number1<40 || number1>50 || number2<40 || number2>50 || number3<40 || number3>50 || number4<40
                || number4>50 || number5<40 || number5>50 || number6<40 || number6>50 || number7<40 || number7>50){
            System.out.println("There is no number between 40 and 50 = false");

        }else{
            System.out.println("There is no number between 40 and 50 = true");
        }

        //Task-4
        int Random1 = (int) (Math.random() * 101);
        int Random2 = (int) (Math.random() * 101);
        int Random3 = (int) (Math.random() * 101);

        if (Random1>25 && Random2>25 && Random3>25) System.out.println("True");
        else System.out.println("False");

        //new - simplifies line 143/144
        System.out.println(Random1 > 25 && Random2 > 25 && Random3 > 25);


        //Task-5
        System.out.println("Please enter a number between 1 and 7 (1 and 7 included)");
        int dayOfTheWeekNumber = input.nextInt();

        switch (dayOfTheWeekNumber){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Sorry this is not an acceptable number(:");
        }

        //Task-6
        System.out.println("Please enter a number between -10 and 10 (-10 and 10 are included");
        int inputNumber = input.nextInt();

        if(inputNumber>0){
            System.out.println("Number entered is POSITIVE");
            if (inputNumber % 2 != 0){
                System.out.println("Number entered is ODD");
            }else{
                System.out.println("Number entered is EVEN");}
            }
        if (inputNumber<0){
            System.out.println("Number entered is Negative");
            if (inputNumber % 2 != 0){
                System.out.println("Number entered is ODD");
            }else{
                System.out.println("Number entered is EVEN");}
            }
        if (inputNumber == 0){
            System.out.println("Number entered is ZERO");
        }

        //new - simplifies Task 6
        if(inputNumber == 0) System.out.println("Number is zero");
        System.out.println(inputNumber > 0 ? "Number is positive" : "Number is negative");
        System.out.println(inputNumber % 2 == 0 ? "Number is EVEN" : "Number is ODD");

        //Task-7
        System.out.println("Please enter your 3 exam results");
        int gradeAverage = ((input.nextInt() + input.nextInt() + input.nextInt())/3);

        if(gradeAverage>=70)System.out.println("YOU PASSED!");
        else System.out.println("YOU FAILED!");

        //new simplifies line 211-212
        System.out.println(gradeAverage >= 70 ? "YOU PASSED" : "YOU FAILED");

        //Task-8

        System.out.println("Enter 3 numbers");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();

        if (numberOne == numberTwo && numberOne == numberThree) System.out.println("TRIPLE MATCH");
        else if (numberOne == numberTwo || numberOne == numberThree || numberTwo == numberThree) System.out.println("DOUBLE MATCH");
        else System.out.println("NO MATCH");
    }
}
