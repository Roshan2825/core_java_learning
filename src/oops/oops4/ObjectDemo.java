package oops.oops4;

public class ObjectDemo {

    int num;
    float gpa;
    public ObjectDemo(int num,float gpa) {
        this.num = num;
        this.gpa=gpa;
    }


    @Override
    public int hashCode(){//random unique number for each object
        return super.hashCode();
    }
    @Override   
    public boolean equals(Object obj) {//compares the memory address of two objects
        return this.num==((ObjectDemo)obj).num;
    }
    @Override
    public String toString() {//gives the string representation of the object
        return num+"";
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {//creates a copy of the object
        // TODO Auto-generated method stub
        return super.clone();
    }
    @Override
    protected void finalize() throws Throwable {//called before garbage collection
        // TODO Auto-generated method stub
        super.finalize();
    }

    public static void main(String[] args){
        ObjectDemo obj=new ObjectDemo(10,3.3f);
        System.out.println(obj);
        ObjectDemo obj2=new ObjectDemo(10,8.9f);
        System.out.println(obj.equals(obj2));
    }
}
