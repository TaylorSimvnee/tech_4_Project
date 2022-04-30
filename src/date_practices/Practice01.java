package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        Date currentDate = new Date();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth year");

        int age = Integer.parseInt(new SimpleDateFormat("y").format(currentDate)) - scan.nextInt();

        System.out.println("You are " + age + " years old!");




    }
}
