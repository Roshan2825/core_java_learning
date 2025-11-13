package oops.oops5.abstractDemo;

public class Daughter extends Parent{

    Daughter(int age){
        super(age);
    }

    @Override
    void career() {
         System.out.println("Iam going to be a teacher");
        
    }

    @Override
    void partner() {
        System.out.println("I love Chimpan he is 20");
        
    }
    
}
