package methods;

import utilities.MathHelper;

public class FindGreatestOrSmallestOf3Numbers {
    public static void main(String[] args) {

        int max = MathHelper.maxOfThree(5,1,5);
        System.out.println("Max of three numbers is = " + max);

        System.out.println("Max = " + MathHelper.maxOfThree(1.1,1.2,1.3));

        byte b1 = (byte) (Math.random()*10);
        byte b2 = (byte) (Math.random()*10);
        byte b3 = (byte) (Math.random()*10);

        System.out.println("Random 1 = " + b1);
        System.out.println("Random 1 = " + b2);
        System.out.println("Random 1 = " + b3);

        System.out.println(MathHelper.maxOfThreeByte(b1,b2,b3));



    }
}
