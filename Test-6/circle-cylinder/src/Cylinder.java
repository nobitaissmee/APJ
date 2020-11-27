public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVol() {
        return height * getArea();
    }

    @Override
    public String toString() {
        return "A Cylinder has heigth:"
                + height
                + "radius="
                + getRadius()
                + "color="
                + getColor();
    }
}
