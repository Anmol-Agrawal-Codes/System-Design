import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShapeInstance("Rectangle");

        shape.draw();
    }
}