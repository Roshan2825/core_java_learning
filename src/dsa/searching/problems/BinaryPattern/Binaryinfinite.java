package dsa.searching.problems.BinaryPattern;

public class Binaryinfinite {
       public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 7;
        int result = startEnd(arr, target);
        System.out.println("Element found at index: " + result);
       
    }
    static int startEnd(int[] arr,int target){
        int start=0,end=1;
        while(target>arr[end] && end<arr.length-1){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
            if(end>=arr.length)
                end=arr.length-1;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target,int start,int end) {
        while(start<=end ){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(arr[mid]>target)
                end=mid-1;
            if(arr[mid]<target)
                start=mid+1;  
        }
        return -1;
    }
}
