package loops.nestedLoop;

public class PrintAllLetters {
    public static void main(String[] args) {

        System.out.println("------Separate loops---------");

        System.out.println("Lowercase Letters");
        for (int i = 97; i <= 122; i++){
            System.out.print((char) i + " ");
        }
        System.out.println("\n\nUppercase Letters");
        for (int j = 'A'; j <= 'Z'; j++){
            System.out.print((char) +j + " ");
        }

        System.out.println("\n\n-------Nested Loops (: ------------");
        for (int i = 1; i <= 2; i++){
            int start = 97;
            if (i == 1){
                //First iteration - start 97 end 122 = start + 25
                System.out.println("Lowercase Letters");

            }
            else{
                // Second iteration start 65 end 90
                System.out.println("\n\nUppercase letters");
                start = 65;
            }

            for (int j = start; j <= start+25; j++){
                System.out.print((char) j + " ");
            }
        }



    }
}
