package basics;

import java.util.Scanner;
public class Ifprob {
    public static void main(String[] args){/* 
        int a=2,b=2,c=4;
        int ans=(a==b)?c:(a==c)?b:a;
        System.out.println(ans);*//* 
        int a=8,b=3,c=2;
        boolean ans=(a+b==c)||(a-b==c)||(a*b==c)||((float)a/b==c)?true:false;
        System.out.println(ans);*/


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("enter the operator +,-,*,/:");
        char operator=scanner.next().charAt(0);
        switch (operator){
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println((float)a/b);
            break;
            default:
            System.out.println("give valid symbol!");
            break;
        }
        
        scanner.close();
    }
}
