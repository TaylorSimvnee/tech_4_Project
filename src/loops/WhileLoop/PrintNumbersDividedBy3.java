package loops.WhileLoop;

public class PrintNumbersDividedBy3 {
    public static void main(String[] args) {

/*
        Write a Java program to check numbers from 1 to 30 (30 is included)
        and print all the numbers that can be divided by 3
        NOTE: Use while loop
        Expected output:
        3
        6
        9
        .
        .
        .
        24
        27
        30
        start point : 1
        end point : 30
        update: ++ increment ... below your update is the last statement
         */ // if you know the start and end point you might as well use for loop
        int i = 1;
        while(i<=30){
            if(i % 3 ==0) System.out.println(i);
            i++;
        }



    }
}
