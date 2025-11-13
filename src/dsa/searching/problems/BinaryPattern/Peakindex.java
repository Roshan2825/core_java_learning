package dsa.searching.problems.BinaryPattern;
public class Peakindex {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,1,2};
        int result = peakIndexInMountainArray(arr);
        System.out.println("Peak index is: " + result);
    }
 

    static int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1;
        if(arr.length==1)
            return 0;
        while(start<end ){
        int mid=start+(end-start)/2;
        if(arr[mid]>arr[mid+1]){
            end=mid;
        }
        else{
            start=mid+1;  
        }
        }
        return start;
    }
}
