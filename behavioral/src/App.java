import mold_method.Car;
import mold_method.Ship;
import mold_method.Plane;

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
