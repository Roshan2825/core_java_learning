package oops.oops3.polymorphism;

public class Circle extends Shapes {
    //this will run when obj of circlr is created
    //hence it is overriding the parent method
    @Override//this is called annotation
    void area(){
        System.out.println("Area of Circle:pie * r * r");
    }
}
