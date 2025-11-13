package oops.oops4.access;

public class SubClass extends A{
    
    public SubClass(int num,String name){
        super(num,name);
    }

    public static void main(String[] args){
        SubClass obj2=new SubClass(10,"Ashika");
        String name=obj2.name;//protected can be accessed in same package using subclass
        int[] arr=obj2.arr;//no modifier can be accessed in same package using sub class
    }

}
