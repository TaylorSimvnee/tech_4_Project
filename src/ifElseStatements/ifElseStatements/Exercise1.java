package ifElseStatements.ifElseStatements;

public class Exercise1 {
    public static void main(String[] args) {


       /*
Write a program that is gonna create 3 random numbers
between 45-90. Print out the all the numbers max, min,
and the middle.

56, 78, 63

output:

num1= 56
num2= 78
num3= 63
max= 78
min= 56
middle= 63
 */

        int num1 = (int)(Math.random() *46) + 45;
        int num2 = (int)(Math.random() *46) + 45;
        int num3 = (int)(Math.random() *46) + 45;

        int max = Math.max(Math.max(num1,num2),num3);
        int min = Math.min(Math.min(num1,num2),num3);
        int mid;

        if (num1 != max && num1 != min){
            //num1 is middle, if it is NOT max  AND not min, that means num1 is middle
            mid= num1;
        }else if (num2 != max && num2!= min){//num2 mid possibility is going HERE
            mid = num2;
        }else{ //num3 mid possibility is HERE
            mid = num3;
        }


       // if (num2 != max && num2!= min){
            //num1 is middle, if it is NOT max  AND not min, that means num1 is middle
       //     mid= num2;
       // }if (num3 != max && num3 != min){
            //num1 is middle, if it is NOT max  AND not min, that means num1 is middle
      //      mid= num3;
      //  } IF YOU DO ALL IF JAVA WILL BE LOOKING FOR THE ELSE AND WILL NEED FULL EXPLANATION STATEMENT FOR FINAL NUMBER



        System.out.println(
                "\num1 = " + num1 +
                "\nnum2 = " + num2 +
                "\nnum3 = " + num3 +
                "\nnum3 = " + num3 +
                "\nmax = " + num1 +
                "\nmid= " + num1
        );




    }
}
