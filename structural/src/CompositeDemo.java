import java.awt.Color;

import composite.editor.ImageEditor;
import composite.shapes.Circle;
import composite.shapes.CompoundShape;
import composite.shapes.Dot;
import composite.shapes.Rectangle;

public class CompositeDemo {
    public static void main(String[] args) {
        System.out.println("Compositeパターン");
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
            new Circle(10, 10, 10, Color.BLUE),

            new CompoundShape(
                new Circle(110, 110, 50, Color.RED),
                new Dot(160, 160, Color.RED)
            ),

            new CompoundShape(
                new Rectangle(250, 250, 100, 100, Color.GREEN),
                new Dot(240, 360, Color.GREEN),
                new Dot(240, 360, Color.GREEN),
                new Dot(360, 360, Color.GREEN),
                new Dot(240, 360, Color.GREEN)
            )
        );
    }
}
