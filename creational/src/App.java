// import singleton.Singleton;

// import java.util.ArrayList;
// import java.util.List;

// import prototype.Circle;
// import prototype.Rectangle;
// import prototype.Shape;

// import factory_method.factory.Dialog;
// import factory_method.factory.HtmlDialog;
// import factory_method.factory.WindowsDialog;

// import builder.builders.CarBuilder;
// import builder.builders.CarManualBuilder;
// import builder.cars.Car;
// import builder.cars.Manual;
// import builder.director.Director;

public class App {
    // private static Dialog dialog;
    public static void main(String[] args) throws Exception {
        // System.out.println("builderパターン");
        // Director director = new Director();

        // CarBuilder builder = new CarBuilder();
        // director.constructSportsCar(builder);

        // Car car = builder.getResult();
        // System.out.println("Car built:\n" + car.getCarType());

        // CarManualBuilder manualBuilder = new CarManualBuilder();

        // director.constructSportsCar(manualBuilder);
        // Manual carManual = manualBuilder.getResult();
        // System.out.println("\nCar manual built:\n" + carManual.pring());
        
        // configure();
        // runBusinessLogic();
        // // Singleton Parttern
        // System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
        // "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
        // "RESULT:" + "\n");
        
        // // 実行時はFooしかoutputされない
        // Singleton singleton = Singleton.getIncetance("Foo");
        // Singleton anotherSingleton = Singleton.getIncetance("BAR");
        // System.out.println(singleton.value);
        // System.out.println(anotherSingleton.value);
        // Prototype Pattern
        // System.out.println("Prototype Pattern");

        // List<Shape> shapes = new ArrayList<>();
        // List<Shape> shapesCopy = new ArrayList<>();

        // Circle circle = new Circle();
        // circle.x = 10;
        // circle.y = 20;
        // circle.color = "red";
        // shapes.add(circle);


        // Circle anotherCircle =  (Circle) circle.clone();
        // shapes.add(anotherCircle);

        // Rectangle rectangle = new Rectangle();
        // rectangle.width = 10;
        // rectangle.height = 20;
        // rectangle.color = "blue";
        // shapes.add(rectangle);

        // cloneAndCompare(shapes, shapesCopy);
    }

    // private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
    //     for (Shape shape : shapes) {
    //         shapesCopy.add(shape.clone());
    //     }

    //     for (int i = 0; i < shapes.size(); i++) {
    //         if (shapes.get(i) != shapesCopy.get(i)) {
    //             System.out.println(i + ": Shapes are different objects (yay!)");

    //             if (shapes.get(i).equals(shapesCopy.get(i))) {
    //                 System.out.println(i + ": And they are identical (yay!)");
    //             } else {
    //                 System.out.println(i + " : But they are not identical (booo!)");
    //             }
    //         } else {
    //             System.out.println(i + " : Shape objects are the same (booo!)");
    //         }
    //     }
    // }

    // static void configure() {
    //     if (System.getProperty("os.name").equals("Windows 10")) {
    //         dialog = new WindowsDialog();
    //     } else {
    //         dialog = new HtmlDialog();
    //     }
    // }

    // static void runBusinessLogic() {
    //     dialog.renderWindow();
    // }
}
