package characterClass;

public class UnderstandingCharacterClass {
    public static void main(String[] args) {

        char c = '9';
       boolean b = Character.isDigit('9');
       System.out.println(b);

       System.out.println(Character.isDigit('9')); // all above is done in one print out


       System.out.println(Character.isUpperCase('a')); //false
       System.out.println(Character.isUpperCase('B'));

       System.out.println(Character.isLowerCase('a'));
       System.out.println(Character.isLowerCase('B')); //false

       System.out.println(Character.isLetter('B'));
       System.out.println(Character.isLetter('u'));

       System.out.println(Character.isLetterOrDigit('B')); //true
       System.out.println(Character.isLetterOrDigit('t')); //true
       System.out.println(Character.isLetterOrDigit(' ')); // false

       System.out.println(Character.isWhitespace(' ')); // true
       System.out.println(Character.isSpaceChar(' ')); // true

        char c2 = '$';
        System.out.println(Character.isLetterOrDigit(c2) && Character.isSpaceChar(c2)); //true

        char c3 = 'A';
        String s = "AEIUOaeiou";
        System.out.println(s.contains(c3 + "")); //true
        System.out.println(s.contains(String.valueOf(c3))); // or true



        char c4 = 'a';
        boolean isC4Vowel = false;
        int sum = 0;
        int product = 1;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (c4 == s.charAt(i)) {
                isC4Vowel = true;
                break;
            }
        }

        if(isC4Vowel) System.out.println("c4 is Vowel");
        else System.out.println("c4 is not Vowel");
    }


}
