package dsa.searching.problems.BinaryPattern;

public class Rotatedsorted {
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        int target = 3;
        int result = search(arr, target);
        System.out.println("Element found at index: " + result);
    }

    static int search(int[] arr, int target) {
        int pivot = pivot(arr);

        // Case 1: not rotated
        if (pivot == -1) {
            return binaryS(arr, target, 0, arr.length - 1);
        }

        // Case 2: found pivot
        if (arr[pivot] == target) return pivot;

        // Case 3: target lies in left sorted side
        if (target >= arr[0]) {
            return binaryS(arr, target, 0, pivot - 1);
        }

        // Case 4: target lies in right sorted side
        return binaryS(arr, target, pivot + 1, arr.length - 1);
    }
    
      static int binaryS(int[] arr,int target,int start,int end){
       
        while(start<=end){
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
}


