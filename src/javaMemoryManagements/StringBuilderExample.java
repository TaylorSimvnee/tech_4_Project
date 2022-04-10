package javaMemoryManagements;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("John"); //Johnathan
        sb.append("athan");

        System.out.println(sb); //Johnathan

        sb.append(389);
        System.out.println(sb);

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}
