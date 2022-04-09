package utilities;

public class CharacterHelper {

    //////Task-1//////
    public static boolean isSpace(char space){
        return space == 32;
    }
    //////Task-2//////
    public static boolean isDigit(char digit){
        return digit >= 48 && digit <= 57;
    }
    //////Task-3//////
    public static boolean isUppercase(char upperCase){
        return upperCase >= 65 && upperCase<= 90;
    }
    //////Task-4//////
    public static boolean isLowercase(char lowerCase){
        return lowerCase >=97 && lowerCase<=122;
    }
    //////Task-5//////
    public static boolean isLetter(char letter){
//        return letter >=65 && letter<= 90 || letter >= 97 && letter<=122;
        return isUppercase(letter) || isLowercase(letter);
    }
    //////Task-6//////
    public static boolean isVowel(char vowel){
        return vowel == 65||vowel == 69||vowel ==73 ||vowel == 79||vowel == 85||vowel ==97 ||vowel == 101||vowel == 105||vowel == 111||vowel == 117;
    }
    //////Task-7//////
    public static boolean isConsonant(char consonant){
        return !isVowel(consonant) && consonant >=65 && consonant<= 90 || consonant >=97 && consonant<=122;
    }
}
