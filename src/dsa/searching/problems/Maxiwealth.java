package dsa.searching.problems;

public class Maxiwealth {
    public static void main(String[] args){
        int[][] arr={
            {1,2,3},
            {3,2,1},
            {7,9}
        };
        int sum=sumMax(arr);
        System.out.println(sum);
    }
    static int sumMax(int[][] arr){
        int sumo=0;
        for(int i=0;i<arr.length;i++){
            if(sum(arr[i])>sumo)
                sumo=sum(arr[i]);
        }
        return sumo;
    }
    static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }
}
