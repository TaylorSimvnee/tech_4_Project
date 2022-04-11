package mathClass;

public class FindingRandom {
    public static void main(String[] args) {

        double random = Math.random();

        //formula for random:
       // (int) (Math.random() * (endPoint - startPoint + 1) + startPoint)

        double random0And10Included= Math.random() * 11; //0-10

        System.out.println(random);
        // if you need a touch of random, you can use this

        System.out.println(random0And10Included);

        int random0And20Included= (int) (Math.random() * 21);
        System.out.println(random0And20Included);

        int random0And20Include= (int) (Math.random() * 21);
        System.out.println(random0And20Include);

        int random10And20Include= (int) (Math.random() * 11)+10;
        System.out.println(random10And20Include);







    }
}
