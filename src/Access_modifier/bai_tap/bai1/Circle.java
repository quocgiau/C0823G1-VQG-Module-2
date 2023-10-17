package Access_modifier.bai_tap.bai1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Bán kính " + getRadius() + ", Màu '" + color + "', Diện tích " + getArea();
    }
}
