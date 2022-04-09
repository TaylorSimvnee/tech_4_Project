package stringMethods;

import utilities.ScannerHelper;

public class PracticeSubstring {
    public static void main(String[] args) {

        String str = ScannerHelper.getASentenceFromUser();
        String str2 = ScannerHelper.getASentenceFromUser();

        System.out.println("The first word is = " + str.substring(0, str.indexOf(' ')));
        System.out.println("The last word is = " + str.substring(str.lastIndexOf(' ')+ 1));


        System.out.println("The first word is = " + str2.substring(0, str2.indexOf(' ')));
        System.out.println("The last word is = " + str2.substring(str2.lastIndexOf(' ')+ 1)); // +1 will exclude the space
    }
}
