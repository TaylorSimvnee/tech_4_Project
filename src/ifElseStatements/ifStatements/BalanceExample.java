package ifElseStatements.ifStatements;

public class BalanceExample {
    public static void main(String[] args) {

        double balance = 150;
        // you can use relational and logical operators
        //statement/expression will be true if balance is less than 0
        boolean isBalanceLessThan0 = balance < 0; //false
        boolean isBalanceEquals100 = balance == 100; //false
        boolean isBalanceBiggerOrEqualThan1000 = balance>= 1000; //false

        //create an expression for cheking if balance is not equal to -1
        boolean isBalanceNotEqual = balance != -1; //true



        if(isBalanceLessThan0 ){ // you can put any statement in parentheses. a 1 time statement or a stored statement
            //action my code to be executed
            System.out.println("Your balance is not equal to -1");

        }



    }
}
