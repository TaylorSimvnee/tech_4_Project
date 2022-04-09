package utilities;

public class Calculator {
    /*
    1.Proper name
    2. Decide its accessibility level (public)
    3.Decide its accessibility way (You want to call it with class name or with object name)
        static --> You want to call it with class name
        non-static --> you want to call it with object name
    4. Decide if it returns something or not
        if it returns -> decide what it returns
        if it doesn't return -> then put void
    5. Does it take any arguments
        if it takes, then decide what arguments it takes and how many arguments it takes

        NOTE: if your method is not void, then it is return type, then you MUST use return keyword in the body
        of the method
        NOTE: if your method returns an int, then your variable used next to return keyword in the body MUST be an int
        NOTE: Whatever primitive used ^, then you must use that primitive in the body.
        NOTE: Every method must have a body that runs a task
        NOTE: We can have multiple methods sharing the same name in the same class only if they have different arguments.
        Different arguments could be the number of arguments are different or the types of arguments are different
        NOTE: Whatever the method returns, you will HAVE to store it in the matching. ex; returns int STORE in int when using

        NOTE: Do not ever try to create a method inside another method
     */



//Create a method that finds the product of 2 int numbers and returns it
//Create a method that finds the product of 2 double numbers and returns it


    public static int divide(int num1, int num2){ //15,2 ->7
        return num1 / num2;
    }

    public static double divide(double num1, double num2){
        return num1 / num2;

    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    public static int absDifference(int num1, int num2){
        return Math.abs(num1-num2);
    }
    public static double absDifference(double num1, double num2){
        return Math.abs(num1-num2);
    }
    public static int product(int num1, int num2){
        return num1*num2;
    }
    public static double product(double num1, double num2){
        return num1*num2;
    }
}
