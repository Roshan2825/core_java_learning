package oops.oops6.generics;

import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<=5;i++){
            list.add(i+1);
        }
        list.forEach((item)->System.out.println(item*2));

        Operation sum=(a,b)->a+b;
        Operation sub=(a,b)->a-b;
        Operation mul=(a,b)->a*b;

        LambdaFunctions myCalc=new LambdaFunctions();
        System.out.println(myCalc.operate(5,3,sum));
        System.out.println(myCalc.operate(5,3,sub));
        System.out.println(myCalc.operate(5,3,mul));
        
    }

    public int sum(int a,int b){
        return a+b;
    }
    private int operate(int a,int b,Operation op){
        return op.operration(a,b);
    }

}

interface Operation{
    int operration(int a,int b);
}   
