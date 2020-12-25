public class FatoryTest {
    public static void main(String[] args) {
        ShapeFactory newFactory=new ShapeFactory();

        Shape s1=newFactory.shapeFactory("Circle");
        s1.draw();

        Shape s2=newFactory.shapeFactory("Square");
        s2.draw();

        Shape s3=newFactory.shapeFactory("Rectangle");
        s3.draw();
    }
}
