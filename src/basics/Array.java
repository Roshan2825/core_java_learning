package basics;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        // Scanner in=new Scanner(System.in);
        // int[] name=new int[5];
        // int i,n=name.length;
        // for(i=0;i<n;i++)
        //     name[i]=in.nextInt();
        // // for(i=0;i<n;i++)
        // //     System.out.print(name[i] + " ");    
        // for(int naam:name){
        //     System.out.print(naam + " ");
        // }   
        // System.out.print(Arrays.toString(name)); 

        // name[1]=56;
        // System.out.print(Arrays.toString(name)); 

        // int[][] nums=new int[3][3];
        // Scanner in=new Scanner(System.in);
        // int row,col;
        // for(row=0;row<nums.length;row++){
        //     for(col=0;col<nums[row].length;col++){
        //         nums[row][col]=in.nextInt();
        //     }
        // }

        // for(row=0;row<nums.length;row++){
        //     for(col=0;col<nums[row].length;col++){
        //         System.out.print(nums[row][col] + " ");
        //     }
        //     System.out.println();
        // }


        // for(row=0;row<nums.length;row++)
        //     System.out.println(Arrays.toString(nums[row]));

        //  for(int[] num:nums){
        //     System.out.println(Arrays.toString(num));
        //  }    

        //ArrayList<Integer> list=new ArrayList<>();
        // list.add(34);
        // list.add(343);
        // list.add(345);
        // list.add(341);
        // list.add(340);
        // System.out.println(list);
        // list.contains(34);
        // list.set(0,0);

        //Scanner input=new Scanner(System.in);
        // for(int i=0;i<5;i++)
        //  list.add(input.nextInt());
        // System.out.println(list);

        // ArrayList<ArrayList<Integer>> arr=new ArrayList<>();

        // //initialize
        // for(int i=0;i<3;i++){
        //     arr.add(new ArrayList<>());
        // }

        // //add elements
        // for(int i=0;i<3;i++)
        //     for(int j=0;j<3;j++)
        //         arr.get(i).add(input.nextInt());

        // System.out.println(arr);        

        int[] arr={1,2,3,4,5,6};
        swap(arr,1,4);
        int maxnum=max(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(maxnum);
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    
    }

    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    static int max(int[] arr){
        int i,maxi=arr[0];
        for(i=0;i<arr.length;i++){
            if(maxi<arr[i]){
                maxi=arr[i];
            }
        }
        return maxi;
    }
     
    static void reverse(int[] arr){
        int start=0,end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }   
    }

}
