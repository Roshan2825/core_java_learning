package oops.oops6.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr=new int[]{1,2,3,4,5};
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // public Human(Human other){
    //     this.age = other.age;
    //     this.name = other.name;
    // }

    // public Object clone() throws CloneNotSupportedException{
    //     //shallow copy-the primitives will be copied but the reference value is not copied,
    //     //the reference variable wil point to the same object in heap memory
    //     return super.clone();
    // }

    public Object clone() throws CloneNotSupportedException{
        //shallow copy-the primitives will be copied but the reference value is not copied,
        Human twin=(Human) super.clone();
        twin.arr=new int[this.arr.length];//this is deep copy
        for(int i=0;i<this.arr.length;i++){
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }
}
