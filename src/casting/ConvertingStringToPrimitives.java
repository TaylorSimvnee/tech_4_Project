package casting;

public class ConvertingStringToPrimitives {
    public static void main(String[] args) {

        String num1 = "23";
        String num2 = "12";


        int num1Int = Integer.parseInt(num1); // String--> int
        int num2Int = Integer.parseInt(num2); // returns primitive

     


        // Integer is the CLASS version of the primitive
        // valueOf() is returning a CLASS
        //parseInt() is returning the primitive
        Integer num1Integer = Integer.valueOf(num1); // returns wrapper class
        Integer num2Integer = Integer.valueOf(num2);// String --> Integer


        System.out.println(num1Int + num2Int);
        System.out.println(num1Integer + num2Integer);

    }
}
