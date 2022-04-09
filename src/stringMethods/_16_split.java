package stringMethods;

import java.util.Arrays;

public class _16_split {
    public static void main(String[] args) {

        String s = "Banana is nice";
        //split is case-sensitive
        s.split(" "); // returns an array
        String[] sSpitFromSpaces = s.split(" ");

        System.out.println(Arrays.toString(sSpitFromSpaces));


        String[] sSplitFromI = s.split("i");

        System.out.println(Arrays.toString(sSplitFromI));



    }
}
