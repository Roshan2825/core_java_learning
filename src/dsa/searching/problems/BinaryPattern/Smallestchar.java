package dsa.searching.problems.BinaryPattern;

public class Smallestchar{
    public static void main(String[] args){
        char[] ch={'a','c','e','k'};
        char target='a';
        char ans=nextGreatestLetter(ch,target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length;
        if(target>=letters[letters.length-1])
            return letters[0];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]==target){
                start=mid+1;
            }
               
            if(letters[mid]>target)
                end=mid-1;
            if(letters[mid]<target)
                start=mid+1;            
        }
        return letters[start];
    }
}
