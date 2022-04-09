package loops.forLoop;

public class PrintNumbersAscending {
    public static void main(String[] args) {
        /*
        write program 1-10. ascending

        Do not forget inside the loop syntax, ALWAYS use int for initialization= assigning your variable.
        The termination condition will result in a boolean
        decide for forLoop syntax:
        start point     : 1
        end point       : 10
        change / update : increment amount

         */

        for(int i = 1; i <=7; i++){
            System.out.println(i);
        }
        for(int i = 1; i <11; i++){
            System.out.println(i);
        }
        for(int i = 1; i ==10; i++){ // wouldn't even run, always false.
            System.out.println(i);
        }
    }
}
