package ifElseStatements;

public class FindGreatestOfTwoNumbers {
    public static void main(String[] args){
        /*
        how to get random number between 0-10 (both included)
                        Math.random() * (End point - start point + 1)
         */

        int num1 = (int) (Math.random() * 11), num2= (int)(Math.random()*11);

        System.out.println(num1);
        System.out.println(num2);

        //Math.max()
       // System.out.println("The greatest of" + num1 + "and" + num2 + "is " + Math.max(num1,num2));

        // Less code is the best code. here is logic to find  the greatest number. it is redundant to have any more code.
        //if you get 7,7 then what is greatest? 7. so that is enough
        if (num1>num2){
            System.out.println("The greatest of " + num1 + " and " + num2 + " is " + num1);
        }
        else{ // num1 == num2 || num2 > num1
            System.out.println("The greatest of" + num1 + " and" + num2 + " is " + num2);
        }

        System.out.println("The greatest number is = " + (num1>num2));
    }

}
