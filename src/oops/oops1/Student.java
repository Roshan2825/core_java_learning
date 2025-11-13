package oops.oops1;

public class Student {
     int rno;
    String name;
    float marks;

    Student (int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }

    Student (Student other){
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }
}
