package dsa.searching;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr={45,67,2,3,98,44};
        int[][] array={
            {1,2,3,4},
            {5,6,7,8,9},
            {10,11,12,13}
        };
        String str="Karthick Roshan";
        int targetI=4;
        char targetC='R';
        int max=maxTA(array);
        System.out.println(linearSearchA(arr,targetI));
        System.out.println(linearSearchS(str,targetC));
        System.out.println(Arrays.toString(linearSearchTA(array,targetI)));
        System.out.println(max);
        

    }
    
    static boolean linearSearchA(int[] arr,int target){//array
        if(arr.length==0)
            return false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return true;
        }  
        return false;  
    }

    static boolean linearSearchS(String str,char target){//string
        if(str.length()==0)
            return false;
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)==target)
        //         return true;
        // }  
        for(char ch:str.toCharArray()){
            if(ch==target)
                return true;
        }
        return false;  
    }

    static int[] linearSearchTA(int[][] arr,int target){//2d array
        if(arr.length==0)
            return new int[]{};
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==target)
                return new int[]{i,j};
           }
        }  
        return new int[]{};  
    }

    static int maxTA(int[][] arr){//max in 2d array
        int max=Integer.MIN_VALUE;
        if(arr.length==0)
            return -1;
        for(int[] array:arr){
            for(int element:array){
                if(element>max)
                    max=element;
            }
        }  
        return max;  
    }
}
