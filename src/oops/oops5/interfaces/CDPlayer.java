package oops.oops5.interfaces;

public class CDPlayer implements Media {

    @Override
    public void start() {
        System.out.println("Music on!!");
        
    }

    @Override
    public void stop() {
        System.out.println("Music off!!");
        
    }
    
}
