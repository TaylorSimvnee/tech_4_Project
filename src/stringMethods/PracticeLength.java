package stringMethods;


import utilities.ScannerHelper;

public class PracticeLength {
    public static void main(String[] args) {


        String book = ScannerHelper.getFavBookName();
        String quote = ScannerHelper.getQuote();

        System.out.println("First String length = " + book.length());
        System.out.println("Second String length = " + quote.length());

    }
}
