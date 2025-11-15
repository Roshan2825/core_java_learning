package oops.oops6.generics.comparing;

public class Main {
    public static void main(String[] args){
        Student s1=new Student(101,85.5f);
        Student s2=new Student(102,90.0f);
        if(s1.compareTo(s2)<0){
            System.out.println("s1 has less marks than s2");
        }
    }
}
