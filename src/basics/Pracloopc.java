package basics;

public class Pracloopc {
    public static void main(String[] args){/* 
        int n=7,i;
        if(n<=1){
            System.out.println(n+" is not prime");
        }else{
            for(i=2;i<=n/2;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime");
                    break;
                }
            }  
            if(i>n/2)
                System.out.println(n+" is prime");
        }*/
     /*   int n=80;
        double nroot=Math.floor((Math.sqrt(n)));
        double acroot=nroot*nroot;
            if((double)n==acroot){
                System.out.println(n+" is perfect square number");
            }
            else{
                ++nroot;
                acroot=nroot*nroot;
                System.out.println((int)acroot+" is perfect square number greater than "+n);
                
            }*/
    
      /*   for(int i=1;i<100;i++){
            if(i%4==0 && i%6==0)
                continue;
            System.out.println(i);
        }*/
       for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            if((i==2 && j>=2)||(i==4 && j>=2)||(i==3 && j>=4)){
                continue;
            }
            System.out.print("*");
        }
        System.out.println();
       }        
        
    }
}
