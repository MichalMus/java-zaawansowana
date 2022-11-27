package ZadaniaJavaZaawansowanaPlik.OOP_Zadania.zd1.zd1;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public float[] getXYZ() {
        System.out.println(x+" " + y+ " "+z);
        return new float[]{x, y, z};
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
       this.setXY(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("(%f,%f,%f)",x,y,z);
    }
}
