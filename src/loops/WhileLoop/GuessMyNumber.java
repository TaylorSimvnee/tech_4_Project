package loops.WhileLoop;

import utilities.ScannerHelper;

import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int myNumber = r.nextInt(10)+1;

        int userNumber = ScannerHelper.getNumberFromUser();

        while(userNumber != myNumber){
            userNumber = ScannerHelper.getNumberFromUser();
        }
        System.out.println("Finally you found the number");
    }
}
