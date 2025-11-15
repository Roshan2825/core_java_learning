package oops.oops6.generics;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static final int DEFAULT_SIZE=10;
    private int size=0;

    public CustomGenericArrayList(){
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private void resize() {
       Object[] temp=new Object[data.length*2];
       for(int i=0;i<data.length;i++){
           temp[i]=data[i];
       }
       data=temp;
    }
    private boolean isFull() {
         return size==data.length;
     }
    @SuppressWarnings("unchecked")
    public T remove(){
        T removed=(T)(data[--size]);
        return removed;
    }
    @SuppressWarnings("unchecked")
    public T get(int index){
        return (T)data[index];
    }
    @SuppressWarnings("unchecked")
    public T getAtIndex(int index){
        return (T)data[index];
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
        CustomGenericArrayList<Integer> list=new CustomGenericArrayList<Integer>();
        for(int i=0;i<14;i++){
            list.add(2*i);
        }
        System.out.println(list);
    }
}


