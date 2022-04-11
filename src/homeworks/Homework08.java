package homeworks;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        //////Task-1////////
        int num = (int) (Math.random() * 51);

        if (num >= 10 && num <= 25) System.out.println(true);
        else System.out.println(false); //OR below
        System.out.println(num >= 10 && num <= 25);//OR
        System.out.println(num >= 10 && num <= 25 ? true : false);

        ////////Task-2////////
        int number = (int) (Math.random()* 100)+1;

        if (number>=1 && number<=25) System.out.println(number + " is in the 1st half\n" + number + " is in the 1st quarter");
        else if (number>=26 && number<=50) System.out.println(number + " is in the 1st half\n"+ number + " is in the 2nd quarter");
        else if (number>51 && number<=75) System.out.println(number + " is in the 2nd half\n" + number + " is in the 3rd quarter");
        else System.out.println(number + " is in the 2nd half\n" + number + " is in the 4th quarter");

        //New- clearer logic
        System.out.println(number);
        if(number < 26) System.out.println("1st quart");
        else if(number < 51) System.out.println("2nd quart");
        else if(number < 75) System.out.println("3rd quart");
        else System.out.println("4th quart");
        System.out.println(number < 51 ? number + " is in the 1st half" : number + " is in the 2nd half");

        ////////Task-3////////
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 5 numbers between 1-10");
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        int num3 = scan.nextInt();
//        int num4 = scan.nextInt();
//        int num5 = scan.nextInt();
//        int points = 0;


//        if (num1>= 1 && num1<=10){
//            num1 *= 5;
//            points += num1;
//        if(num2>= 1 && num2<=10){
//            num2 *= 4;
//            points += num2;
//            if (num3>= 1 && num3<=10){
//                num3 *= 3;
//                points += num3;
//                if (num4>= 1 && num4<=10){
//                    num4 *= 2;
//                    points += num4;
//                    if (num5>= 1 && num5<=10){
//                        num5 *= 1;
//                        points += num5;}}}}}
  

//        System.out.println(points);

    }
}
