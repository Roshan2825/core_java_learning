package dsa.searching.problems.BinaryPattern;

public class Rotationcount{
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        int result = count(arr);
        System.out.println("Array is rotated " + result + " times");
    }


        static int pivot(int[] arr) {
        int start=0,end=arr.length-1;
        
        while(start<=end ){
        int mid=start+(end-start)/2;
        if(mid<end && arr[mid]>arr[mid+1])
            return mid;
        if(mid>start && arr[mid]<arr[mid-1])
            return mid-1;
        if(arr[start]>=arr[mid])
            end=mid-1;       
        else
            start=mid+1;       

        }
        return -1;
    }
    static int count(int[] arr) {
        int pivot=pivot(arr);
        return pivot+1;
    }
}