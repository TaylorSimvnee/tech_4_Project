package operators.shortHandAssignmentOperators;


import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner collect = new Scanner(System.in);


        System.out.println("PLease enter your balance");
        double balance = collect.nextDouble();

        System.out.println("Enter your first transaction");
        double firstTransaction = collect.nextDouble();
        balance -= firstTransaction; // balance has changed here (reassigned balance number )
        System.out.println("Balance after 1st transaction = $" + balance);

        System.out.println("Enter your second transaction");
        double secondTran = collect.nextDouble();
        balance -= secondTran;
        System.out.println("Balance after 2nd transaction = $" + balance);

        System.out.println("Enter your third transaction");
        double thrirdTransaction = collect.nextDouble();
        balance -= thrirdTransaction;
        System.out.println("Balance after 3rd transaction = $" + balance);




    }
}
