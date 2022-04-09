package casting;

public class CastingPrimitives {
    public static void main(String[] args){
        /*
        double > float> long > int >= char > short > byte

        smaller data to bigger = implicit
        bigger data to smaller = explicit (you always have to explicitly tell java if u want to convert to another primitive)
         */

        int myInt = 32;
        long myLong = myInt; //implicit casting

        myInt = (int) myLong; //explicit casting


        int mySecondInt = 'B'; //implicit
        char myChar = (char) 56; //you don't have to cast int and char
        char my2Char = 56;


        int myThirdInt = (int) 45.4; // EXPLICITLY TELLING JAVA TO CONVERT TO THE DESIRED DATA TYPE

        short myShort = (short) myChar;
        char myThirdChar = (char) myShort;

        /*
        char doesn't have a negative value, so you will have to explicitly cast
         */




    }
}
