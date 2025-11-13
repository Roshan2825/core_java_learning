package oops.oops4.access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        A obj=new A(10,"Roshan");
        //need to do a few things
        //1.access the data members
        //2.modify the data members

        // ArrayList<Integer> list=new ArrayList<>(23);//here initial capacity can be given
        // list.DEFAULT_CAPACITY;//private cant be accessed
        String name=obj.name;//can access protected in same package
        int[] arr=obj.arr;//can access no modifier in same package
        
        
    }
}
