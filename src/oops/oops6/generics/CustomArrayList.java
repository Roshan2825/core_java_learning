package oops.oops6.generics;
//import java.util.ArrayList;

public class CustomArrayList {
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private void resize() {
       int[] temp=new int[data.length*2];
       temp=data;;
       data=temp;
    }
    private boolean isFull() {
       return size==data.length;
    }
    public int remove(){
        return data[--size];
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    @Override
    public String toString(){
        return "CustomArrayList{" +
                "data=" + java.util.Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
    public static void main(String[] args){
        // ArrayList list=new ArrayList();
        // list.add(10);
        // list.add("Hello");
        // list.add(15.5);
        // list.remove(1);
        // list.get(0);
        // list.size();
        CustomArrayList list=new CustomArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
    }
}
