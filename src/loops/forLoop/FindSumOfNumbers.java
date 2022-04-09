package loops.forLoop;

public class FindSumOfNumbers {
    public static void main(String[] args) {

       // 1. create result container
            int sum = 0;
        //2. start filling your result
        for(int i = 10; i<=15 ; i++ ){
            sum += i;
        }
        System.out.println(sum);
    }
}
