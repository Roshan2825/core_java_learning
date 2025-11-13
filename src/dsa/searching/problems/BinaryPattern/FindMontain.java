package dsa.searching.problems.BinaryPattern;

public class FindMontain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target=3;
        int peak=peakIndexInMountainArray(arr);
        int firsthalf=orderAgnosticBS(arr,target,0,peak);
        if(firsthalf!=-1){
            System.out.println("Element found at index: " + firsthalf);
            return;
        }
        int secondhalf=orderAgnosticBS(arr,target,peak+1,arr.length-1);
        System.out.println("Element found at index: " + secondhalf);
         
 
    }
      static int orderAgnosticBS(int[] arr,int target,int start,int end){
        boolean check=arr[end]>arr[start];
       
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
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
            
        }
        return -1;
    }
      static int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1;
        while(start<end ){
        int mid=start+(end-start)/2;
        if(arr[mid]>arr[mid+1])
            end=mid;
        if(arr[mid]<arr[mid+1])
            start=mid+1;  
        }
        return start;
    }
}
