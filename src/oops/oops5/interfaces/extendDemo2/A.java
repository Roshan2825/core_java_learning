package oops.oops5.interfaces.extendDemo2;

public interface A {
    //static interface method should always have a body
    //call via interface name
    static void greeting(){
        System.out.println("I'm static in A");
    }

   default void fun(){
    System.out.println("I'm in A");
   }
}
 