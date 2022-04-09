package myFirstDay;
import java.util.Scanner;

public class Mock1Prep {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        /*
        1.create scanner object
        2.create question to gather user input
        3.collect, use in proper logic
         */

        System.out.println("Please enter 3 thole numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1>num2){
            if(num2>num3){
                System.out.println("The greatest number = " + num1);}
        }else if (num2>num3){
            System.out.println("The greatest number = " + num2);
        }else{
                System.out.println("The greatest number = " + num3);
            }

    }
}