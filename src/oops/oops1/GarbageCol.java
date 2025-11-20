package oops.oops1;

public class GarbageCol {
    public static void main(String[] args) {
        // A obj;
        // for(int i=0;i<100000000;i++){
        //     obj=new A("random name");
        // }
    
       
    }
}
class A{
    final int num=10;
    String name;
    public A(String name){
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is garbage collected");
    }
}