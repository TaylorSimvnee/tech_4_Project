package homeworks;

import utilities.ScannerHelper;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("       -Task-1-");
        String user = ScannerHelper.getAStringFromUser().trim();
        if(user.length()<1) System.out.println("Length is zero");
        else{
            System.out.println("Length is = " + user.length());
            System.out.println("First char is = " + user.charAt(0));
            System.out.println("Last char is = " + user.charAt(user.length()-1));
            if(user.toLowerCase().contains("a") || user.toLowerCase().contains("e")
                    ||user.toLowerCase().contains("i") ||user.toLowerCase().contains("o")
                    ||user.toLowerCase().contains("u")){
                System.out.println("This String has a vowel");
            }else  System.out.println("This String does not have a vowel");
        }

        System.out.println("       -Task-2-");
        String user2 = ScannerHelper.getAStringFromUser().trim();

        if (user2.length() < 3) System.out.println("Length is less than 3");
        else{
            if(user2.length() % 2 == 0){
                System.out.println(user2.substring(user2.length()/2-1, user2.length()/2+1));
            }else System.out.println(user2.charAt(user2.length()/2));
        }

        System.out.println("       -Task-3-");
        String user3 = ScannerHelper.getAStringFromUser().trim();

        if (user3.length() < 4) System.out.println("INVALID INPUT");
        else {
              System.out.println("First 2 characters are = " + user3.substring(0,2));
              System.out.println("Last 2 characters are = " + user3.substring(user3.length()-2));
              System.out.println("The other characters are = " + user3.substring(2, user3.length()-2));
          }

        System.out.println("       -Task-4-");
        String user4 = ScannerHelper.getAStringFromUser().trim();

        if(user4.length() < 2) System.out.println("Length is less than 2");
        else{
            String first = user4.substring(0,2);
            String last = user4.substring(user4.length()-2);
            System.out.println((first.equalsIgnoreCase(last)) ? "true" : "false");
            }

         System.out.println("       -Task-5-");
        String user5A = ScannerHelper.getAStringFromUser().trim();
        String user5B = ScannerHelper.getAStringFromUser().trim();

        if (user5A.length() < 2 || user5B.length() < 2) System.out.println("INVALID INPUT");
        else {
            String first = user5A.substring(1,user5A.length()-1);
            String second = user5B.substring(1,user5B.length()-1);
            System.out.println(first + second);
        }

        System.out.println("       -Task-6-");
        String user6 = ScannerHelper.getAStringFromUser().trim();

        if(user6.length() < 4) System.out.println("INVALID INPUT");
        else{
            String start = user6.substring(0,2);
            String end = user6.substring(user6.length()-2);
            System.out.println((start.equals("xx") && end.equals("xx")) ? "true" : "false");
        }
    }
}
