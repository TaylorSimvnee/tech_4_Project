package loops.controlStatements;

public class UnderstandingControlStatements {
    public static void main(String[] args) {
        /*
        print 1 - 25 but skip all dividable by 10. using control statement
        now do not print any number that is moe than 15
         */

        for(int i = 1; i < 26; i++ ){
            if(i % 10 == 0) continue; // continue causes program to skip the current iteration and go to the next iteration.
            // Here the program will run till it hits continue and then will go back up to line 10.
            System.out.println(i);
            if (i == 15) break; // break causes the program loop to end no matter what
        }

    }
}
