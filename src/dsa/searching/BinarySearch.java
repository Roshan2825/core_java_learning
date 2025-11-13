package dsa.searching;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {999,987,786,45,12,1};
        int target = 1,start=0,end=arr.length-1;
        int result = binarySearch(arr, target,start,end);
        int optiresult=orderAgnosticBS(arr,target);
        System.out.println("Element found at index: " + result);
        System.out.println("Element found at index: " + optiresult);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target)
                return mid;
            if(arr[mid]>target)
                end=mid-1;
            if(arr[mid]<target)
                start=mid+1;     
        }
        return -1;
    }
    static int orderAgnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean check=arr[end]>arr[start];
       
        while(start<=end){
            int mid=start+(end-start)/2;
            if(check){
                if(arr[mid]>target)
                    end=mid-1;
                if(arr[mid]<target)
                    start=mid+1;    
            }
            else{
                if(arr[mid]>target)
                    start=mid+1;
                if(arr[mid]<target)
                    end=mid-1;    
            }
            if(arr[mid]==target)
                return mid;
        }
        return -1;
    }
}   