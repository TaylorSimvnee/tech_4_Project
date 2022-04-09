package mathClass;

public class FindMax {
    public static void main(String[] args) {

        int x = 8;
        int y = 20;
        int z = 12_930;
        int a = 34;
        int b = 123;

        //Math.max only takes 2 values
        int maxValueOfXY = Math.max(x, y); // can use char.

        int maxValueOfXYZ = Math.max(maxValueOfXY, z);

        int maxValueAB = Math.max(a, b);

        int maxOfEveryNumb = Math.max(maxValueOfXYZ, maxValueAB);

        System.out.println("maxValueOfXY " + maxValueOfXY);
        System.out.println("maxValueOfXYZ " + maxValueOfXYZ);
        System.out.println("maxValueAB " + maxValueAB);
        System.out.println("maxValueEveryNumb " + maxOfEveryNumb);







    }
}
