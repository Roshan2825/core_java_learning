package dsa.searching.problems.BinaryPattern;

public class CeilingNumber {
    public static void main(String[] args){
        int[] arr={2,3,5,9,14,16,18};
        int target=17;
       // int result=ceilingN(arr,target);
        int flooR=floor(arr,target);
       // System.out.println(result);
        System.out.println(flooR);
    }
    static int ceilingN(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        if(arr[end]<target)
            return -1;
     
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return arr[mid];
            if(arr[mid]>target)
                end=mid-1;
            if(arr[mid]<target)
                start=mid+1;    
        }
        return arr[start];

    }
    static int floor(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        if(arr[0]>target)
            return -1;
     
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return arr[mid];
            if(arr[mid]>target)
                end=mid-1;
            if(arr[mid]<target)
                start=mid+1;    
        }
        return arr[end];

    }
}