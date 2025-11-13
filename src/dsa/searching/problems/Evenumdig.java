package dsa.searching.problems;

public class Evenumdig {
    public static void main(String[] args){
        int[] arr={22,334,22,3453};
        int count=findEvenCount(arr); 
        System.out.println(count);
    }
    static int findEvenCount(int[] arr){
        int count=0,i=0;
        for(;i<arr.length;i++){
          if(even(arr[i])){
            count++;
          }  
        }   
        return count; 
    }

    static boolean even(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count%2==0;
    }
}
