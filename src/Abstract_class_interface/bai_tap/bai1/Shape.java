package Abstract_class_interface.bai_tap.bai1;

public abstract class Shape implements Resizeable {
    private String color = "green";
    private boolean filled = true;

    public abstract double getArea();

    public abstract double getPerimeter();

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public double increaseSize() {
        return getArea();
    }
}
