package oops.oops4.access;

public class A {
    private int num;
    protected String name;
    int[] arr;
    //protected,no modifier,private 
    //cant be accessed with diff package and not subclass

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num,String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }

}
