package projects;

import java.util.Arrays;

public class Project07 {


    //Task-1
    public static void findGreatestAndSmallestWithSort(int[] variableName){
        Arrays.sort(variableName);
        System.out.println("Smallest = " + variableName[0]);
        System.out.println("Smallest = " + variableName[variableName.length-1]);
    }

    //Task-2
    public static void findGreatestAndSmallest(int[] variableName){

        int greatest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int x : variableName){
            if(x > greatest){
                greatest = x;
            }
            else if(x < smallest){
                smallest = x;
            }
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Greatest = " + greatest);
    }

    //Task-3
    public static void findSecondGreatestAndSmallestWithSort(int[] variableName){

        Arrays.sort(variableName);

        int greatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < variableName.length; i++) {
            if (variableName[i] > greatest) greatest = variableName[i];
        }

            for (int j = 0; j < variableName.length; j++) {
                if(variableName[j] > secondGreatest && variableName[j] != greatest){
                    secondGreatest = variableName[j];
            }
        }
        for (int i = 0; i < variableName.length; i++) {
            if (variableName[i] < smallest) smallest = variableName[i];
        }

        for (int j = 0; j < variableName.length; j++) {
            if(variableName[j] < secondSmallest && variableName[j] != smallest){
                secondSmallest = variableName[j];
            }
        }
        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);

    }


    //Task-4
    public static void findSecondGreatestAndSmallest(int[] variableName){

        int secondGreatest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        int greatest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;


        for(int x : variableName){
            if(x > greatest) greatest = x;
        }
        for (int x : variableName){
            if(x > secondGreatest && x != greatest) secondGreatest = x;
        }

        for(int x : variableName){
            if(x < smallest) smallest = x;
        }
        for (int x : variableName){
            if(x < secondSmallest && x != smallest) secondSmallest = x;
        }

        System.out.println("Second Smallest = " + secondSmallest);
        System.out.println("Second Greatest = " + secondGreatest);

    }

    //Task-5

    public static void findDuplicatedElementsInAnArray(String[] variableName) {

        String duplicates = "";

        for (int i = 0; i < variableName.length; i++) {

            for (int j = i + 1; j < variableName.length - 1; j++) {
                if (variableName[i].equals(variableName[j]) && !duplicates.equals(variableName[i])) {
                    duplicates += variableName[i];
                    System.out.println(variableName[i]);
                    break;
                }
            }
        }
    }

        //Task-6
        public static void findMostRepeatedElementInAnArray(String[] variableName) {

            String element = "";
            int count = 0;

            for (int i = 0; i < variableName.length; i++) {
                String element2 = variableName[i];
                int repeatCount =  0;

                for (int j = 0; j < variableName.length; j++) {
                if(variableName[j].equals(element2)){
                    repeatCount++;
                }
                   if (repeatCount > count){
                        element = element2;
                        count = repeatCount;

                }
            }}
            System.out.println(element);


        }}
