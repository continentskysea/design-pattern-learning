import builder.builders.CarBuilder;
import builder.builders.CarManualBuilder;
import builder.cars.Car;
import builder.cars.Manual;
import builder.director.Director;

public class BuilderDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("builderパターン");
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.pring());
    }
}
