package oops.oops2;
public class Staticblock{
    static int a=5;
    static int b;
    static{//static block used to initialize static variable or to write code which we want to execute only once
        System.out.println("Static block initialized");
        b=a*5;
    }//executes only once when the class is loaded for the first time
    public static void main(String[] args){
        Staticblock obj=new Staticblock();
        System.out.println(Staticblock.a+" "+Staticblock.b);

        Staticblock.b+=3;
        System.out.println(Staticblock.a+" "+Staticblock.b);
        
        Staticblock obj2=new Staticblock();
        System.out.println(Staticblock.a+" "+Staticblock.b);
    }
}