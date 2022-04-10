package projects;

import java.util.ArrayList;

public class Project08 {

    //Task-1
    public static int countMultipleWords(String[] arr) {

        int countMultipleWord = 0;
        for (String element : arr) {
            String trimmed = element.trim();
            if (trimmed.contains(" ")) countMultipleWord++;
        }
        return countMultipleWord;
    }

    //Task-2
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> arr) {
        arr.removeIf(integer -> integer < 0);
        return arr;
    }

    //Task-3
    public static boolean validatePassword(String password) {
        if (password.length() > 16 || password.length() < 8 || password.contains(" ")) return false;

        else {
            boolean digit = false, upper = false, lower = false, special = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) digit = true;
                else if (Character.isUpperCase(password.charAt(i))) upper = true;
                else if (Character.isLowerCase(password.charAt(i))) lower = true;
                else special = true;
            }
            return digit && upper && lower && special;
        }
    }

    //Task-4
    public static boolean validateEmailAddress(String email) {
        if (email.contains(" ") || !email.contains(".")) return false;

        else {
            int count = 0;
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') count++;
            }

            if (count != 1) return false;

            else if (!email.substring(email.indexOf('@')).contains(".")) return false;

            else {
                boolean front = email.substring(0, email.indexOf('@')).length() > 2;
                boolean middle = email.substring(email.indexOf('@') + 1, email.indexOf('.')).length() > 2;
                boolean end = email.substring(email.indexOf('.')).length() > 2;

                return front && middle && end;
            }
        }
    }
}