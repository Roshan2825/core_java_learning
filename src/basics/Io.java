package basics;

import java.util.Scanner;
public class Io{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name:");
        String name=scanner.nextLine();
        System.out.println("what is your age:");
        int age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter email:");
        String email=scanner.nextLine();
        System.out.println("enter a number:");
        String num=scanner.nextLine();
        


        System.out.println("hi "+name);
        System.out.println("your age is:"+age);
        System.out.println("your email id is:"+email);
        System.out.println(" "+" "+" "+num+" "+" "+" ");
        System.out.println(" "+" "+num+num+num+" "+" ");
        System.out.println(" "+num+num+num+num+num+" ");
        System.out.println(num+num+num+num+num+num+num); 

        int a=3,b=4,c;
        c = a + b + a++ + b++ + ++a + ++b;//3+4+3+4+5+6=25
        System.out.println(c);

        scanner.close();
    }
}