package operators.arithmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args){

        int number1 = 9;
        int number2 = 3;

        number1 = 5; //if you want to re-assign a variable this is how. the re-assignment begins starting at that line

        //addition
        int sum = number1 + number2; // 8

        //subtraction
        int sub = number1 - number2; //2

        //multiplication
        int times = number1 * number2; // 15 will be stored in 'times'

        //division
        int div = number1 / number2;

        //remainder
        int remainder = number1 % number2; // 2

        System.out.println("addition" + sum);
        System.out.println("subtraction " + sub );
        System.out.println("multpication " + times);
        System.out.println("division " + div);
        System.out.println("remainder is " + remainder);






    }
}
