public class ShapeFactory {

    public Shape getShapeInstance(String shapeType){
        return switch (shapeType) {
            case "Rectangle" -> new Rectange();
            case "Circle" -> new Circle();
            case "Square" -> new Square();
            default -> null;
        };
    }
}
