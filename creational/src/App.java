// import singleton.Singleton;

import java.util.ArrayList;
import java.util.List;

import prototype.Circle;
import prototype.Rectangle;
import prototype.Shape;

public class App {
    public static void main(String[] args) throws Exception {
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
        System.out.println("Prototype Pattern");

        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.color = "red";
        shapes.add(circle);


        Circle anotherCircle =  (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");

                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + " : But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + " : Shape objects are the same (booo!)");
            }
        }
    }
}
