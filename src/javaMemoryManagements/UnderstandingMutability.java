package javaMemoryManagements;

public class UnderstandingMutability {
    public static void main(String[] args) {

        String city = "Chicago";
        String address = "Chicago";

        System.out.println(city == address); //True - not properly chehcking if chicago = chicago, its checking if the location =same location
        System.out.println(city.equals(address)); //true and proper way



    }
}
