package loops.forLoop;

import utilities.MathHelper;

public class PrintEvenNumbers {
    public static void main(String[] args) {

        /*
        print even numbers from 0 - 10 (0 and 10 included)

        start point 0
        end point 10
        update increment
         */

        for(int i = 0; i<=10 ; i++ ){
           if(i % 2 == 0) System.out.println(i);
        }
        for(int i = 0; i<=10 ; i++ ){
            if(MathHelper.isEven(i)) System.out.println(i);
        }
        for(int i = 0; i<=10 ; i+= 2){ // be careful with start point
            System.out.println(i);
        }
        for(int i = 0; i<=10 ; i++ ){
           System.out.println(i++);
        }
        for(int i = 0; i<=10 ; i++ ){
            System.out.println(i);
            i++;
        }

    }
}
