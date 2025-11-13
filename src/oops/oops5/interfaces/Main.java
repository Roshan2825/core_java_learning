package oops.oops5.interfaces;

public class Main {
    public static void main(String[] args){
        
        // Engine car =new Car();
        
        // car.a;
        // car.acc();
        // car.start();
        // car.stop();

        // Media carMedia=new Car();
        // carMedia.stop();

        NiceCar cars=new NiceCar();
        cars.start();
        cars.stop();
        cars.upgradeEngine();
        cars.start();
    }
   
}
