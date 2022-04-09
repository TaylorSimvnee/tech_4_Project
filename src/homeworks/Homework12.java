package homeworks;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {

        System.out.println("Task-1");
        int[] numbers = new int[10];

        numbers[2]= 23;
        numbers[4]= 12;
        numbers[7]= 34;
        numbers[9]= 7;
        numbers[6]= 15;
        numbers[0]= 89;

        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\nTask-2");
        String[] s =  new String[5];
        s[1]= "abc";
        s[4]= "xyz";

        System.out.println(s[3]);
        System.out.println(s[0]);
        System.out.println(s[4]);
        System.out.println(Arrays.toString(s));

        System.out.println("\nTask-3");
        int[] numbers2 = { 23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(numbers2));
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        System.out.println("\nTask-4");
        String[] countries = { "Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("\nTask-5");
        String[] cartoonDogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(cartoonDogs));
        Arrays.sort(cartoonDogs);
        System.out.println(Arrays.binarySearch(cartoonDogs, "Pluto") >= 0);

        System.out.println("\nTask-6");
        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));
        String gar = "";
        String fel = "";
         for(String cats : cartoonCats){
             if(cats.equals("Garfield")) gar = "Garfield";
            else if(cats.equals("Felix")) fel = "Felix";
         }
        System.out.println(gar.equals("Garfield") && fel.equals("Felix"));

        System.out.println("\nTask-7");
        double[] doubles = {10.5, 20.75, 70, 80, 15.75};

        System.out.println(Arrays.toString(doubles));
        System.out.println(doubles[0]);
        System.out.println(doubles[1]);
        System.out.println(doubles[2]);
        System.out.println(doubles[3]);
        System.out.println(doubles[4]);

        System.out.println("\nTask-8");
        char[] chars = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        System.out.println(Arrays.toString(chars));
        int letters = 0;
        int lowerC = 0;
        int upperC = 0;
        int digits = 0;
        int special = 0;
        for (char chars_ : chars){
            if(Character.isLetter(chars_)){
                letters++;
                if(Character.isUpperCase(chars_)){
                    upperC++;
                }else lowerC++;
            }else if(Character.isDigit(chars_)){
                digits++;
            }else special++;
        }
        System.out.println("Letters = " + letters);
        System.out.println("Uppercase letters = " + upperC);
        System.out.println("Lowercase letters = " + lowerC);
        System.out.println("Digits = " + digits);
        System.out.println("Special characters = " + special);

        System.out.println("\nTask-9");
        String[] objects = { "Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        System.out.println(Arrays.toString(objects));
        int upperCase = 0;
        int lowerCase = 0;
        int startsWith = 0;
        int contains = 0;
        for(String object : objects){
            char c = object.charAt(0);
            if (object.toLowerCase().contains("book") || object.toLowerCase().contains("pen")){
                contains++;
            }
            if (object.toLowerCase().startsWith("b") || object.toLowerCase().startsWith("p")){
                startsWith++;
            }
            if(Character.isUpperCase(c)) upperCase++;
            else lowerCase ++;
        }
        System.out.println("Elements starts with uppercase = " + upperCase);
        System.out.println("Elements starts with lowercase = " + lowerCase);
        System.out.println("Elements starting with B or P = " + startsWith);
        System.out.println("Elements having \"book\" or \"pen\" = " + contains);

        System.out.println("\nTask-10");
        int[] numCollection = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(numCollection));

        int moreThan = 0;
        int lessThan = 0;
        int areTen = 0;

        for(int num : numCollection){
            if (num > 10) moreThan++;
            else if (num < 10) lessThan++;
            else areTen++;
        }
        System.out.println("Elements that are more than 10 = " + moreThan);
        System.out.println("Elements that are less than 10 = " + lessThan);
        System.out.println("Elements that are 10 = " + areTen);

        System.out.println("\nTask-11");
        int[] first = {5, 8, 13, 1, 2};
        int[] second = {9, 3, 67, 1, 0};
        int[] third = new int[5];

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        int nextIndex = 0;
        for(int f : first){
            third[nextIndex] = Math.max(f, second[nextIndex]);
            nextIndex++;
        }
        System.out.println("1st array is = " + Arrays.toString(first));
        System.out.println("2nd array is = " + Arrays.toString(second));
        System.out.println("3rd array is = " + Arrays.toString(third));
    }
}
