package homeworks;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println("Task-1");

        for (int i = 1; i < 11; i++){
            if(i % 10 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }

        System.out.println("\nTask-2");
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        boolean isPos = false;
        boolean isNeg = false;
        int positive = -1;
        int negative = 1;
        for (int num : numbers){
            if (num > 0 && !isPos){
                isPos = true;
                positive = num;
            }else if (num < 0 && !isNeg){
                isNeg = true;
                negative = num;
            }
        }
        System.out.println("First positive number is: " + positive);
        System.out.println("First positive number is: " + negative);

        System.out.println("\nTask-3");

        int[] randoms = new int[5];

        boolean isFound = false; //raise flag
        int counter = 0;
        for (int i = 0; i <5; i++){
            randoms[i] = (int) (Math.random()* 11 + 1);
              if (randoms[i] == 2 || randoms[i] == 3 && !isFound){
                  counter++;
              }
        }
        System.out.println(Arrays.toString(randoms)); //This was for me, not part of expected output(:
        System.out.println(counter > 0);

        System.out.println("\nTask-4");

        String[] list = {"banana", "orange", "Apple"};

        boolean contains = false;
        for(String fruit : list){
            if (fruit.equalsIgnoreCase("apple")){
                contains = true;
                break;
            }
        }
        System.out.println(contains);

        System.out.println("\nTask-5");

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        int counter2 = 0;
        boolean isMatching = false;
        for (int num : numbers1){
            if (numbers2[counter2] == num){
                System.out.println(num);
                counter2++;
            }
        }
        if (counter2 == 0 && !isMatching) System.out.println("There is no matching elements");


        System.out.println("\nTask-6");

        String str = "baNana";
        String str2 = str.toLowerCase();
        String[] bananaSplit = str.split("");

        int counter4 = 1;
        for (int i = 0; i < str.length(); i++){
            String first = "" + str.charAt(i);
            String second = "" + str.charAt(counter4);
            if(first.equalsIgnoreCase(second) && !str2.substring(0,i).contains(first)){
                System.out.println(bananaSplit[i]);
                counter4++; }
            }

        String duplicates = ""; // a

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {

                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) &&
                        !duplicates.contains(str.toLowerCase().substring(i, i + 1))){
                    duplicates += str.toLowerCase().charAt(i);
                    System.out.println(str.charAt(i));
                    break;
                }

            }
        }
    }
}
