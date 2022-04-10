package javaMemoryManagements;

public class Dog {

    public String breed;
    public int age;

    //This method will execute whenever a Dog object looses reference
    @Override
    protected void finalize(){ //Interview Q.. what is finalized method?
        System.out.println("A dog object is garbage collected");
        System.out.println("The object is ======" + this.getClass().getName());
    }



}
