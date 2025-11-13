package oops.oops3.inheritance;

public class Main {
    public static void main(String[] args){
        // Box box1 =new Box(4,5,6); //compile time polymorphism
        // Box box2 =new Box(box1);
        // System.out.println(box1.l+" "+box1.w+" "+box1.h);
        // System.out.println(box2.l+" "+box2.w+" "+box2.h);

        // BoxWeight box3=new BoxWeight();
        // System.out.println(box3.l+" "+box3.w+" "+box3.h+" "+box3.weight);

        Box box5=new BoxWeight(4,5,6,8);
        System.out.println(box5.l+" "+box5.w+" "+box5.h);
        // System.out.println(box5.weight); // it will throw an error because the reference type is box
        //there are many variablesin bothparent and child classes
        //you can access only the variables which are present in the reference type
        //hence,you should have access to weight variable
        //this also means ,that the ones you are trying to access should be initialized
        //but here ,when the obj itself is of type parent class.how will you call the constructor of child class
        //hence it will throw an error

        BoxPrice box=new BoxPrice(4,57,8);
        BoxPrice.information();
    }
}
