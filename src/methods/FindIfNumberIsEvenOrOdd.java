package methods;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class FindIfNumberIsEvenOrOdd {
    /*
    Generate random number between  17 and 33 (Both included)
    First, Print the random number generated with a message "The Number generated is ="
    print "The Number Generated is EVEN" if the number is even
    print "The Number Generated is ODD" if the number is even
     */

    public static void main(String[] args) {

        int r1 = RandomNumberGenerator.getRandomNumber(17,33);
        System.out.println("The Number generated is = " + r1);

        if (MathHelper.isEven(r1)) System.out.println("The Number Generated is EVEN");
        else System.out.println("The Number Generated is ODD");





    }
}
