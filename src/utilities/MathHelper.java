package utilities;

public class MathHelper {
    //Create a method that takes 3 ints and returns the max
    public static int maxOfThree(int num1,int num2,int num3){
        return Math.max(num1,Math.max(num2,num3));
    }

    //method overloading
    public static double maxOfThree(double num1, double num2, double num3){
        return Math.max(num1, Math.max(num2, num3));
    }
    //Create a method that creates 3 byte num and returns the min
    public static byte maxOfThreeByte(byte numb1, byte numb2, byte numb3){
        return (byte) Math.min(Math.min(numb1,numb2),numb3);
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static boolean isOdd(int num){
        return num % 2 != 0;
    }
    //Create a method that takes one int as an argument and returns if the number is positive.
    //If the number is positive, it will return true.
    //Otherwise, it will return false.

    public static boolean isPositive(int num){
        return num > 0;
    }
    public static boolean isNegative(int num){
        return num < 0;
    }

    public static boolean isZero(int num){
        return num == 0;
    }




}
