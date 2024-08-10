package WithArgs.FactoryMethod;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("Triangle")){
            return new Triangle();
        } else if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
