package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {


        String[][] studentGroups ={
                                    {"Kaly", "Guluzar", "Melda"},
                                    {"Torrie", "David"},
                                    {"Abe", "Data"}
                                    };

        System.out.println(studentGroups[0][1]); //Guluzar
        System.out.println(studentGroups[1][0]); //Torrie
        System.out.println(studentGroups[1][1]); //David

        //How to get the size of the studentGroups
        System.out.println(studentGroups.length);//3

        //How to get the size of the second Group
        System.out.println(studentGroups[1].length); //2

        //How to print the third group
        System.out.println(Arrays.toString(studentGroups[2])); // [Abe, Data]

        //How to print all
        System.out.println(Arrays.deepToString(studentGroups));

        //How to print each group in separate lines
        System.out.println(Arrays.toString(studentGroups[0]));
        System.out.println(Arrays.toString(studentGroups[1]));
        System.out.println(Arrays.toString(studentGroups[2])); //or

        for (int i = 0; i < studentGroups.length; i++) {
            System.out.println(Arrays.toString(studentGroups[i])); //or
        }

        for (String[] group : studentGroups) {
            System.out.println(Arrays.toString(group));
        }

        //How to print each group member in separate lines







    }
}
