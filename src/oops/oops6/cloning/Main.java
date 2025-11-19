package oops.oops6.cloning;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) throws CloneNotSupportedException {
         Human kunal=new Human(21, "Kunal");
         //Human twin=new Human(kunal);//copy constructor
         Human twin=(Human) kunal.clone();//clone method
         System.out.println(twin.name+" "+twin.age+" "+Arrays.toString(twin.arr));
         twin.arr[0]=100;
         twin.age=10;
         twin.name="Kunal kushwaha";
         System.out.println(kunal.name+" "+kunal.age+" "+Arrays.toString(kunal.arr));
         System.out.println(twin.name+" "+twin.age+" "+Arrays.toString(twin.arr));

    }   
}
