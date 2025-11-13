package oops.oops2;

public class Innerclass {//outer class cannot be static
    //test class is not dependent on outer class so it can be static else it need instance of outer class   
    static class test{//inner class can be static,test is nested class
        String name;
        test(String name){
            this.name=name;
        }
    }
    public static void main(String[] args){
        test obj=new test("Roshan");
        test obj2=new test("Ashika");
        System.out.println(obj.name);
        System.out.println(obj2.name);
        
    }
}
