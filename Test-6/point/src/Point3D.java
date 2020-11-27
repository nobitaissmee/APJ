public class Point3D extends Point2D {
    float z;

    public Point3D() {}

    public Point3D(float z,float x, float y) {
        super(x, y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z=z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public float[] getXYZ() {
        return new float[]{x,y,z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
