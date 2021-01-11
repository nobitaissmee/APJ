public class Point {
    private double point1 = -1, point2 = -1, point3 = -1, point4 = -1;

    public Point() {
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
        boolean isRunning = false;
        double sum = 0;
        if (point1 != -1) {
            sum += point1;
            isRunning = true;
        }
        if (point2 != -1) {
            sum += point2;
            isRunning = true;
        }
        if (point3 != -1) {
            sum += point3 * 2;
            isRunning = true;
        }
        if (point4 != -1) {
            sum += point4 * 3;
            isRunning = true;
        }
        if (isRunning) return sum / 7;
        return -1;
    }
}
