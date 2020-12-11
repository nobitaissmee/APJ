import javax.print.DocFlavor;

public class Rectangle extends Shape {
    double width = 1.0;
    double height = 1.0;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override

    public String toString() {
        return "A Circle with width="
                + getWidth()
                + " and length="
                + getWidth()
                + ", which is a subclass of "
                + super.toString();
    }
}
