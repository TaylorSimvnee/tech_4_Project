package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args){

        File firstFile = new File("studentList.txt");

        try {
            firstFile.createNewFile();
            Thread.sleep(5000);
            FileWriter fileWriter = new FileWriter("studentList.txt");
            fileWriter.write("Abe\n");
            fileWriter.write("Vita\n");
            fileWriter.write("Torrie\n");
            fileWriter.write("Taylor");
            fileWriter.close(); //Like: save and closes the file
            Thread.sleep(5000);
        }

        catch (Exception e) {
            e.printStackTrace();
        }finally {
           firstFile.delete();
        }








    }
}
