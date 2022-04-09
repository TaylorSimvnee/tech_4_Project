package loops.controlStatements;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        /*
        1.get 2 numbers
        2.find min nd mX
        3.PRINT AALL OF THEM SKIP 5


         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number 0-10");
        int num1 = scan.nextInt();

        System.out.println("Please enter a number 0 - 10");
        int num2 = scan.nextInt();

        for (int i = Math.min(num1,num2); i <= Math.max(num1,num2); i ++){
            if(i == 5) continue;
            System.out.println(i);
        }


    }
}
