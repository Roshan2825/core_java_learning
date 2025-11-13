package oops.oops3.inheritance;

public class BoxWeight extends Box{
    double weight;


    BoxWeight(){
        super();
        this.weight=-1;
    }

    BoxWeight(double l,double w,double h,double weight){
        super(l,w,h); // it will call the constructor of parent class
        //used to initialize the values present in the parent class
        this.weight=weight;
    }

    BoxWeight(BoxWeight other){ 
        super(other);
        this.weight=other.weight;
    }
    BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }
}
