package loops.forLoop;

public class PrintEachCharFromString {
    public static void main(String[] args) {

        String str = "TechGlobal School";
        for(int i = 0; i<=str.length()-1 ; i++ ){
            System.out.println(str.charAt(i));
        }

    }
}
