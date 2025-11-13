package oops.oops1;

public class Classobject {
      public static void main(String[] args) {
        Student karthi=new Student();
        karthi.rno=20;
        karthi.name="Karthick Roshan";
        karthi.marks=98.7f;
        System.out.println(karthi.rno);
        System.out.println(karthi.name);
        System.out.println(karthi.marks);

    }

    public static void fun(){
        System.out.println("Hello");
    } 
}
class Student{
    int rno;
    String name;
    float marks;

}
 


