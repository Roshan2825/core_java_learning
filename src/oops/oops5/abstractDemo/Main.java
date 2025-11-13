package oops.oops5.abstractDemo;

public class Main {
    public static void main(String[] args){
        Son son=new Son(20);
        son.career();
        son.normal();

        Parent daughter=new Daughter(21);
        //reference type can be parent class even object cant be created for abstract class
        daughter.career();

        //Parent parent=new Parent(20);
        //cant create object for abstract class,to create override {}

        Parent.hello();//allowed in abstract class(static method)
    }
}

