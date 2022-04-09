package homeworks;

import utilities.ScannerHelper;

public class Homework09 {
    public static void main(String[] args) {

        ////////Task-1////////
       String name = ScannerHelper.getANameFromUser();
        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the  name is = " + name.charAt(name.length()-1));
        System.out.println("The first 3 characters in the name are = " + name.trim().substring(0,3));
        System.out.println("The last three characters in the name are = " + name.substring(name.length()-3));
        System.out.println(name.toUpperCase().startsWith("A") ? "You are in the club" : "Sorry, you are not in the club");

        ////////Task-2////////
        String address = ScannerHelper.getAddressFromUser();

        if (address.toUpperCase().contains("CHICAGO")){
            System.out.println("You are in the club");
        }
        else if(address.toUpperCase().contains("DES PLAINES")){
            System.out.println("You are welcome to join to the club");
        } else{
        System.out.println("Sorry, you will never be in the club");}

        ////////Task-3////////

        String colors = ScannerHelper.getAStringFromUser();

        if (colors.toLowerCase().contains("green") && colors.toLowerCase().contains("red") ){
            System.out.println("Green and red are in the list");
        }else if (colors.toLowerCase().contains("green")){
            System.out.println("Green is in the list");
        }else if (colors.toLowerCase().contains("red")){
            System.out.println("Red is in the list");
        }
        else{
            System.out.println("Green and red are not in the list");
        }

          ////////Task-4////////
        String str = "  Java is FUN  ";
        String str1 = str.trim().toLowerCase().substring(0,4);
        String str2 = str.trim().toLowerCase().substring(5,8);
        String str3 = str.trim().toLowerCase().substring(8);

        System.out.println("The first word in the str is = " + str1);
        System.out.println("The second word in the str is = " + str2);
        System.out.println("The third word in the str is = " + str3);
        

    }
}
