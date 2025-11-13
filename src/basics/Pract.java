package basics;

//import java.util.Scanner;

public class Pract{
    public static void main(String[] args) {
        // //fibonacci
        // Scanner input=new Scanner(System.in);
        // int n=input.nextInt();
        // int a=0,b=1,count=2;
        // for(;count<=n;count++){
        //     int temp=b;
        //     b=b+a;
        //     a=temp;
        // }
        // System.out.println(b);


        // Scanner in=new Scanner(System.in);
        // int n=in.nextInt();
        // System.out.println("which number to count?");
        // int c=in.nextInt();
        // int count=0;
        // while(n>0){
        //     int rem=n%10;
        //     if(rem==c)
        //         count++;
        //     n=n/10;    
        // }
        // System.out.println(count);



        //reverse
        int n=23597;
        int result=0;
        while(n>0){
            int rem=n%10;
            result=result*10+rem;
            n=n/10;
        }
        System.out.println(result);
        


    }
}