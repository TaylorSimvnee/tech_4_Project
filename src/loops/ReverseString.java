package loops;

import utilities.ScannerHelper;

public class ReverseString {
    public static void main(String[] args) {


       String reversedName = "";
        String name = ScannerHelper.getANameFromUser();
        for (int i = name.length() - 1; i >= 0; i--) {
          reversedName += name.charAt(i);
        }

        System.out.println("The reverse name = " + reversedName);









    }
}
