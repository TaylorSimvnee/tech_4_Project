package homeworks;

public class Homework21 {
    /**
     -Create a method called fizzBuzz1()
     -This method will take an int argument, and it will print numbers starting from 1
     to given argument. BUT, it will print “Fizz” for the numbers divided by 3, “Buzz”
     for the numbers divided by 5, and “FizzBuzz” for the numbers divided both by 3 and 5.
     */

    public static void fizzBuzz1(int num){
        for (int i = 1; i <=  num; i++) {
            if (i % 15 == 0) System.out.println("FIZZBUZZ");
            else if (i % 3 == 0) System.out.println("FIZZ");
            else if (i % 5 == 0) System.out.println("BUZZ");
            else System.out.println(i);
        }
    }

    /**
     -Create a method called fizzBuzz2()
     -This method will take an int argument, and it will return a String. BUT it will return
     “Fizz” if the given number is divided by 3, “Buzz” if the number is divided by 5, and
     “FizzBuzz” if the number is divided both by 3 and 5. Otherwise, it will return number itself.
     */

    public static String fizzBuzz2(int num){
        if (num % 15 == 0) return "FIZZBUZZ";
        else if(num % 3 == 0) return "FIZZ";
        else if(num % 5 == 0) return "BUZZ";
        else return String.valueOf(num);
    }

    /**
     -Create a method called findSumNumbers()
     -This method will take a String argument ,and it will return an int which is the sum of all numbers presented in the String.

     NOTE: If there are no numbers represented in the String, return 0.
     */

    public static int findSumNumbers(String str){
        String s = "";
        int sum = 0;

        for (int i = 0; i < str.length()-1; i++) {
            if (Character.isDigit(str.charAt(i))){
                if (i < str.length()-1 && Character.isDigit(str.charAt(i+1))){
                    s += str.charAt(i);

                }
                else {
                    s += str.charAt(i);
                    sum += Integer.parseInt(s);
                    s = "";
                }
            }
        }
     return sum;
    }

    /**
     -Create a method called findBiggestNumber()
     -This method will take a String argument and it will return an int which is the number presented in the String.

     NOTE: If there are no numbers represented in the String, return 0.
     */

    public static int findBiggestNumber(String str){
        int biggest = 0;
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                if (i < str.length()-1 && Character.isDigit(str.charAt(i+1))){
                    s += str.charAt(i);

                }
                else {
                    s += str.charAt(i);
                 if (Integer.parseInt(s)> biggest) {
                     biggest = Integer.parseInt(s);
                 }
                    s = "";
                }
            }
        }
        return biggest;
    }

    /**
     -Create a method called countSequenceOfCharacters()
     -This method will take a String argument and it will return a String which is the count of repeated characters in a sequence in the String.
     NOTE: If given String is empty, then return empty String.
     NOTE: It is case sensitive!!!
     */

    public static String countSequenceOfCharacters(String str){
        int count = 0;
        String newString = "";
        if (str.isEmpty()) return str;
        else{
            for (int i = 0; i < str.length(); i++) {
                if (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                    count ++;
                }
                else{
                    count ++;
                    newString+= "" + count + str.charAt(i);
                    count =0;
                }

            }
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println("Task-1");
        fizzBuzz1(5);
        fizzBuzz1(30);

        System.out.println("Task-2");
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(30));

        System.out.println("Task-3");
        System.out.println(findSumNumbers("ab110c045d"));
        System.out.println(findSumNumbers("abc123dsfk"));

        System.out.println("Task-4");
        System.out.println(findBiggestNumber("abc^"));
        System.out.println(findBiggestNumber("a1bf4 n6"));
        System.out.println(findBiggestNumber("ab110jd34jdfh245"));

        System.out.println("Task-5");
        System.out.println(countSequenceOfCharacters("abc"));
        System.out.println(countSequenceOfCharacters("abbcca"));
        System.out.println(countSequenceOfCharacters("aaAAa"));

    }
}
