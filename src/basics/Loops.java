package basics;

public class Loops {
    public static void main(String[] args) {
        //while loop
        int sum=0,i=1;
        while(i<=10){
            sum+=i;
            i++;
        }
        System.out.println("Sum of first 10 natural numbers using while loop: " + sum);
        //do
        int summ=0,j=1;
        do{
            summ+=j;
            j++;
        }while(j<=10);
        System.out.println("Sum of first 10 natural numbers using do-while loop: " + summ);
        //for loop
        int summ1=0;
        for(int z=1;z<=10;z++){
            summ1+=z;
        }
        System.out.println("Sum of first 10 natural numbers using for loop: " + summ1);
        //nested
        for(int x=1;x<=10;x++){
            for(int y=1;y<=x;y++){
                System.out.print(x*y + " ");
            }
            System.out.println(); 
        }
        //for each
        int[] cars = {1,2,3,4,5,6,7,8,9,10};
        for (int d : cars) {
            System.out.println(d*2);
        }
        //break and conte
        for(int s=1;s<10;s++){
            if(s==4)
                continue;//or break
            System.out.println(s);    
        }

        
    }
}
