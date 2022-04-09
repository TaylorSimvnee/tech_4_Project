package operators.arithmeticOperators;

public class Excercise3 {
    public static void main(String[] args) {

        /*
        Pseudocode:
        1. create variables
        2. do equation
        3.print them out
         */
        double annual = 90_000.00; // '_' just for better reading not getting stored
        double monthly = annual / 12;
        double biWeekly = annual / 26;
        double weekly = annual/ 52;


        System.out.println("monthly = " + (monthly));
        System.out.println("biweekly = " + ( biWeekly));
        System.out.println("weekly = " + weekly);

    }
}
