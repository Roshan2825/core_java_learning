package oops.oops5.abstractDemo;

public class Son extends Parent{

    Son(int age){
        super(age);
    }
    
    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("Iam going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Maadu she is 20");
        
    }
    
}
