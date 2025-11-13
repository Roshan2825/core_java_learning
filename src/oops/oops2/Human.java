package oops.oops2;

public class Human{
    int age;
    String name;
    float height;
    static long population;

    Human(int age, String name, float height){
        this.age=age;
        this.name=name;
        this.height=height;
        population++;
    }
}