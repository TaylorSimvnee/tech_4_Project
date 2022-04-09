package projects;

import utilities.ScannerHelper;

public class Project06 {
    public static void main(String[] args) {

        System.out.println("********Task-1********");

        /*
        1.Use scanner to get String from user.
        2. store and trim scanner input
        2.Create a counter = 0 to increment space count
        3.Use fori loop to count spaces.
        4.use if else if to see sentence !contain a space ----- print message
                    else ------ print message
         */

        String sentence = ScannerHelper.getASentenceFromUser().trim();
        int counter1 = 0;

        for (int i = 0; i < sentence.length(); i++){
            if(!sentence.contains(" ")) {System.out.println("This sentence does not have multiple words");
            break;}
            else if (sentence.charAt(i) == ' '){
                    counter1++;
                    if(counter1 > 1) System.out.println("The sentence has " + (counter1 + 1)  + " words");
                }
            }

        System.out.println("********Task-2********");

        /*
        1.Use scanner to get a string from user
        2.create containers -- Container to count forward , container to count backwards
        3.check if String has at least 1 character-- print message
        4.Use 2 for I loop inside of if else statement.
        5.increment the first, decrement in the last.
        6. print statements
         */

        String word = ScannerHelper.getAStringFromUser().trim();
        String forward = "";
        String back = "";

        if(word.isEmpty()) System.out.println("This word does not have 1 or more characters");
        else {
            for (int i = 0; i < word.length(); i++) {
                forward += word.charAt(i);}

            for (int j = word.length()-1; j >= 0; j--) {
                back += word.charAt(j);}

            System.out.println((forward.equals(back)) ? "This word is a palindrome" : "This word is not a palindrome");}


        System.out.println("********Task-3********");

        /*
        1. Ask user to for a sentence
        2.store and .toUpper()
        3.Create container to count # of A's
        4. if () sentence .isEmpty() -- print message
        5. for i loop
        6. increment counter
        7.print message
         */

        String sentence2 = ScannerHelper.getASentenceFromUser().toUpperCase();
        int counter = 0;
        if (!sentence2.isEmpty()){
        for (int i = 0; i < sentence2.length(); i++){
            if(sentence2.charAt(i) == 'A') {
                counter++;
            }

            }System.out.println("This sentence has " + counter + " a or A letters");

        }else { System.out.println("This sentence does not have any characters");
        }

        System.out.println("********Task-4********");
        /*
        1.Ask user for number and store it
        2.Create for i loop
        3.If statements for diveded by 6,2, or 3, --- print out special strings
        4. else print the number
         */

        int number = ScannerHelper.getNumberFromUser();

        for (int i = 1; i <= number; i++) {
            if (i % 6 == 0) System.out.println("FooBar");
            else if(i % 2 == 0) System.out.println("Bar");
            else if (i % 3 == 0) System.out.println("Foo");
            else System.out.println(i);
        }

    }
}
