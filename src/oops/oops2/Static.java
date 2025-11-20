package oops.oops2;

public class Static {
    public static void main(String[] args){
        // Human rose=new Human(20,"Roshan",177);
        // Human ash=new Human(20,"Ashika",155);
        // Human aro=new Human(20,"Arockiya",157);



      //  System.out.println(rose.population); not access static variable by object reference
      //  System.out.println(ash.population);

        System.out.println(Human.population);//access static variable by class name 
        Static obj=new Static();//static method can access non static method by creating object
        obj.greeting();
       // greeting(); static method cannot access non static method directly
        obj.fun2();
        Static.fun1();//static method can access static method directly by class name
        fun1();//static method can access static method directly

    }
    static void fun1(){
        System.out.println("Static method");
    }
    void greeting(){
        System.out.println("Hello");
    }
    void fun2(){
        greeting();
    }
}
