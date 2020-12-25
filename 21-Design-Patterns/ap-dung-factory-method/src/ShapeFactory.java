public class ShapeFactory {

    public static Shape shapeFactory(String type){
        if("Circle".equals(type)){
            return new Circle();
        }
        if ("Square".equals(type)){
            return new Square();
        }
        if ("Rectangle".equals(type)){
            return new Rectangle();
        }
        return null;
    }
}
