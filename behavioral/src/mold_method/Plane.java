package mold_method;

public class Plane extends Vehicle {
    @Override
    public void run() {
        System.out.println("走行する");
    }
    @Override
    public void stop() {
        System.out.println("停止する");
    }

    @Override
    public void horn() {
        System.out.println("ピリピリピリピリピリピリ!");
    }

    public void takeOff() {
        System.out.println("離陸する");
    }

    public void toLand() {
        System.out.println("着陸する");
    }
    
}
