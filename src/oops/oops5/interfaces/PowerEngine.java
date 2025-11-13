package oops.oops5.interfaces;

public class PowerEngine implements Engine{

    @Override
    public void acc() {
        System.out.println("PowerEngine accelerate");
        
    }

    @Override
    public void start() {
        System.out.println("PowerEngine start");
        
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine stop");
        
    }
    
}
