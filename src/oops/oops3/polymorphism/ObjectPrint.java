package oops.oops3.polymorphism;

public class ObjectPrint {

    int num;

    ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "The number is: " + this.num;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(10);
        System.out.println(obj);//prints the hashcode of the object
        System.out.println(obj.toString());//prints the hashcode of the object
    }
}
