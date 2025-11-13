package oops.oops3.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        Shapes c = new Circle();
        Shapes sq = new Square();
        Triangle t = new Triangle();
        
        c.area();

    }
}
