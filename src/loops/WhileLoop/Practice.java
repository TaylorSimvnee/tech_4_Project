package loops.WhileLoop;

public class Practice {
    public static void main(String[] args) {

        for (int i = 1; i < 101; i++ ){
            if(i % 2 != 0 && i % 3 !=0 ) System.out.println(i); }

        int start = 1;
        while(start <101){
            if(start % 2 != 0 && start % 3 !=0 ) System.out.println(start);
            start++;
        }

        int count = 1;
        do{
            if(count % 2 != 0 && count % 3 !=0 ) System.out.println(count);
            count++;
        }while(count <101);


    }
}
