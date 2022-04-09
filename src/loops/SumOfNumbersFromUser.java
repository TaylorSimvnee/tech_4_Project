package loops;

import java.util.Scanner;

public class SumOfNumbersFromUser {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many number you want to enter");
        int howManyNum = scan.nextInt();

        int sum = 0;
        for(int i = 1 ; i <= howManyNum ; i++){
            System.out.println("Please enter number " + i );
            sum += scan.nextInt();
        }
        System.out.println(sum);


    }
}
