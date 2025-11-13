package dsa.recursion;

public class Recursion {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibonacci(n));
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=9;
        System.out.println(binaarySearch(arr,target,0,arr.length-1));
        String a="abc";
        String b=a;
        a="abcd";  
    
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
    static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    static int binaarySearch(int[] arr,int target,int start,int end){
        int mid=start+(end-start)/2;
        if(start>end)
            return -1;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return binaarySearch(arr,target,start,mid-1);
        } else {
            return binaarySearch(arr,target,mid+1,end);
        }    
    }
}

