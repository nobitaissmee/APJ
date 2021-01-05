public class Point {
    private double point1, point2, point3, point4, GPA;

    public Point() {
    }

    public Point(double point1, double point2, double point3, double point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        this.GPA = (point1 + point2 + point3 * 2 + point4 * 3) / 7;
    }

    public double getPoint1() {
        return point1;
    }

    public void setPoint1(double point1) {
        this.point1 = point1;
    }

    public double getPoint2() {
        return point2;
    }

    public void setPoint2(double point2) {
        this.point2 = point2;
    }

    public double getPoint3() {
        return point3;
    }

    public void setPoint3(double point3) {
        this.point3 = point3;
    }

    public double getPoint4() {
        return point4;
    }

    public void setPoint4(double point4) {
        this.point4 = point4;
    }

    public double getGPA() {
        return GPA;
    }
    @Override
    public String toString() {
        return "Point{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                ", point4=" + point4 +
                ", GPA=" + GPA +
                '}';
    }
}
