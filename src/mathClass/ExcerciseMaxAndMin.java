package mathClass;

import java.util.Scanner;

public class ExcerciseMaxAndMin {
    public static void main(String[] args) {

        /*
        1. assign values
        2. use math.min and math.max method to find min and max
         */

        int x =4 , y= 67, z=-54 ;

        int minA = Math.min(x,y);
        int maxb = Math.max(x,y);

        int minAll = Math.min(minA, z);
        int maxAll = Math.max(maxb, z);

        System.out.println("Max of every number" + maxAll);

        //OR I LKE THIS ONE BETTER

        System.out.println("Max of every number " + Math.min(Math.min(x,y) , z));



        /*
        Write a program which is going to print the max of given 3 numbers
        4,56,23
         */

        int numb1 = 4;
        int numb2 = 56;
        int numb3 = 23;

        Math.max(Math.max(numb1,numb3), numb2);

        // below i did nit store the numbers because I am not going to use them later, i don't need to store them.

        System.out.println("Max of given 3 numbers are = " + Math.max(Math.max(4,56),23));


        /*
        Write a program which is going ask 4 numbers then print the max of retrived 4 numbers. *Remember,
        number of Math.max or Math.min() methods called is total numbers - 1. so 4 numbers? 4-1 = 3 Math.max();
        will be used below

         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("Give 4 numbers: ");
        int number1 = userInput.nextInt(), number2 = userInput.nextInt(), number3 = userInput.nextInt(),
                number4 = userInput.nextInt();

        System.out.println("The max of the numbers you entered is = " +
                Math.max(Math.max (number1,number2), Math.max(number3, number4)));

        System.out.println("The min of the numbers you entered is = " +
                Math.min( Math.min(number1,number2), Math.min(number3,number4)));







    }
}
