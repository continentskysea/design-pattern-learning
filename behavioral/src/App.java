import template_method.Car;
import template_method.Plane;
import template_method.Ship;

public class App {
    public static void main(String[] args) throws Exception {

        
        System.out.println("templateMethodパターン");
        System.out.println();
        System.out.println("車クラス");
        Car car = new Car();
        car.run();
        car.stop();
        car.horn();
        
        System.out.println();
        System.out.println("船クラス");
        Ship ship = new Ship();
        ship.run();
        ship.stop();
        ship.horn();
        
        System.out.println();
        System.out.println();
        System.out.println("飛行機クラス");
        Plane plane = new Plane();
        plane.run();
        plane.stop();
        plane.horn();
        plane.takeOff();
        plane.toLand();


    }
}
