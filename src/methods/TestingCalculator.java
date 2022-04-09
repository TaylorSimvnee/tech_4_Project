package methods;

import utilities.Calculator;

public class TestingCalculator {
    public static void main(String[] args) {

        int i1 = 15, i2 = 2;

        int result = Calculator.divide(i1,i2); // returns an int

        System.out.println(result);

        double d1 = 15, d2 = 2;

        double result2 = Calculator.divide(d1,d2); // returns a double

        System.out.println(result2);

        Introduction.introduce("Taylor","Coder",24,"books"); // this method is void, it returns nothing.

        double max2 = Math.max(12.3,32.4);

        System.out.println(Math.max(12.3,32.4)); //This is a return type method
        System.out.println(Calculator.divide(d1,d2)); //This is also a return type method


        //in the calculator class
        //Create a method that finds the sum of 2 int numbers and returns it
        //Create a method that finds the sum of 2 double numbers and returns it
        //Create a method that finds the absolute difference of 2 int numbers and returns it
        //Create a method that finds the absolute difference of 2 double numbers and returns it
        //Create a method that finds the product of 2 int numbers and returns it
        //Create a method that finds the product of 2 double numbers and returns it

        System.out.println(Calculator.sum(i1,i2));
        System.out.println(Calculator.sum(d1,d2));
        System.out.println(Calculator.divide(i1,i2));
        System.out.println(Calculator.divide(d1,d2));
        System.out.println(Calculator.product(i1,i2));
        System.out.println(Calculator.product(d1,d2));
        System.out.println(Calculator.absDifference(i1,i2));
        System.out.println(Calculator.absDifference(d1,d2));

    }
}
