package dsa.searching.problems;

public class SingleNum {
    public static void main(String[] args){
        int[] arr={1,2,2,4,4,5,6,5,6};
        int result=0;
        for(int i=0;i<arr.length;i++){
            result=result^arr[i];
        }
        System.out.println(result);
    }
}
