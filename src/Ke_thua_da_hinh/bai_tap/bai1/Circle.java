package Ke_thua_da_hinh.bai_tap.bai1;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getAcreage(){
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Bán kính = " + radius +
                ", Màu = '" + color + '\'' +
                ", Diện tích = " + getAcreage() +
                '}';
    }
}
