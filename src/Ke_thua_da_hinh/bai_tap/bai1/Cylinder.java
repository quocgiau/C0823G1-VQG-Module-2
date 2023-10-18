package Ke_thua_da_hinh.bai_tap.bai1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return super.getAcreage() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "Độ cao = " + height +
                ", Thể tích = " + getVolume() +
                '}';
    }
}
