package oops.oops6.generics.comparing;

public class Student implements Comparable<Student> {

    int rollno;
    float marks;

    public Student(int i, float f) {
       this.rollno = i;
       this.marks = f;
    }

    @Override
    public int compareTo(Student other) {
        return (int)(this.marks - other.marks);
    }

    public Student(int rollno, float marks) {
        
    }
    
}
