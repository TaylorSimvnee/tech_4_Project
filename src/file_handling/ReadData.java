package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {

        /*
        1. create a new txt file called shoppingList
        2. Write all items below
        Ice-cream
        Fruits
        Pen
        Paper
        Milk
         */

       //Most common used Java packages : IO package UTIL Package Lang Package

        File file = new File("shoppingList.txt");

        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter("shoppingList.txt");
            fileWriter.write("Ice-cream\n");
            fileWriter.write("Fruits\n");
            fileWriter.write("Pen\n");
            fileWriter.write("Paper\n");
            fileWriter.write("Milk");
            fileWriter.close();


            //How to read information from a file
            Scanner scanner = new Scanner(file);

             /*
            for (int i = 1; scanner.hasNextLine(); i++) {
                Thread.sleep(1000);
                System.out.println("Item " + i + " = " + scanner.nextLine());
            }
             */

            int i = 1;
            while (scanner.hasNextLine()){
                System.out.println("Item " + i++ + " = " + scanner.nextLine());
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            file.delete();
        }

        System.out.println("End of the program!");
    }
}
