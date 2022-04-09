package ifElseStatements.ifElseIfStatements;

public class Exercise1 {
    public static void main(String[] args){

        /*
        1.Generate random number
        2.Create if statements for number of possibilities (here it is 3)
        3.Do proper action for every single possibility
         */

        int num1 = (int) (Math.random() * 21) -10; // number you multiply is the range. the number you add is the start point.n



      //  System.out.println(num1);
      //  if (num1 <0){ //NEGATIVE
       //     numb =  num1;
       //     System.out.println("Number is NEGATIVE");

      //  } if (num1 > 0){ //POSITIVE
       //     System.out.println("Number is POSITIVE");
      //  } if(num1 == 0) { //ZERO
      //      numb = num1;
      //      System.out.println("Number is ZERO");
      //  }
        //If they are LINKED you can use if,elseif


        System.out.println(num1);
        if (num1 <0){ //NEGATIVE

            System.out.println("Number is NEGATIVE");

        }else if (num1 > 0){ //POSITIVE
            System.out.println("Number is POSITIVE");
        }else { //ZERO

            System.out.println("Number is ZERO");
        }




    }
}
