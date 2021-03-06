package stringMethods;

public class _06_charAt {
    public static void main(String[] args){
        /*
        Method Task: It helps to get a character at a specific index
        NOTE: Index starts with zero
        -It is non-static -you call it with object, NOT class name
        _It is a return type and returns char primitive
        -It takes an argument which is int (index)

        NOTE: It will throw StringIndexOutOfBoundsException when the given index is not in the bounds
         */

        String name = "Alex";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));

        // System.out.println(name.charAt(4)); // out of bound

       char firstChar = name.charAt(0);

        System.out.println();
       if (firstChar == 'A' || firstChar == 'a'){
           System.out.println("This name starts with A");

       }else{
           System.out.println("This name is not start with A");
       }



    }
}
