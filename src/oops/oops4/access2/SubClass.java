package oops.oops4.access2;
import oops.oops4.access.A;

public class SubClass extends A{
     public SubClass(int num,String name){
        super(num,name);
    }

    public static void main(String[] args){
        SubClass obj2=new SubClass(10,"Ashika");
        String name=obj2.name;//protected can be accessed in diff package using subclass
        //int[] arr=obj2.arr;//no modifier cant be accessed in diff package using subclass
    }
}
