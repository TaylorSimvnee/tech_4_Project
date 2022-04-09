package learningObjects;

public class PrintOutPractice {
    public static void main(String[] args){

        char h = 'H';
        char e = 'e';
        char l = 'l';
        char o = 'o';

        System.out.print(h);
        System.out.print(e);
        System.out.print(l);
        System.out.print(l);
        System.out.print(o);

        String wave = "Hello";

        System.out.println("\n" + wave);


        System.out.println("\n\n\n\n\n");

        int valueOfCapitalH = 'H';
        int capitalHNumber = 72;


        System.out.println("capitalh =" + h);
        System.out.println("valueOfCapitalH = " + valueOfCapitalH);
        System.out.println( "" + h + e + l + l + o); // <-- if Java sees a tiny bit of string, it will print everything as string (it reads form left to righ
                                                     //so if the string is at the back of the () then Java will not make everything string. ex: (h+e+l+l+o"")

    }
}
