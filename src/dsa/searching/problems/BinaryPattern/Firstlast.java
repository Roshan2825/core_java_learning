package dsa.searching.problems.BinaryPattern;

public class Firstlast {
    public static void main(String[] args){
        int[] arr={5,7,7,8,8,10};
        int target=8;
        int[] ans=searchRange(arr,target);
        System.out.println(ans[0]+" "+ans[1]);
        
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=index(nums,target,true);
        ans[1]=index(nums,target,false);
        return ans;
    }

    static int index(int[] nums,int target,boolean starts){

        int start=0,result=-1;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;   
            }     
            else{
                result=mid;
                if(starts)
                    end=mid-1;
                else
                    start=mid+1;    
            }
        }
        return result; 
    }
}
