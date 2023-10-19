package Abstract_class_interface.bai_tap.bai1;


public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    public double getSide() {
        return getWidth();
    }

    public double getArea() {
        return Math.pow(getSide(), 2);
    }

    public double getPerimeter() {
        return getSide() * 4;
    }

    @Override
    public String toString() {
        return "Hình vuông có cạnh = "
                + getSide()
                + " Diện tích = " + getArea();
    }

    @Override
    public void resize(double percent) {
        double count = getSide() + percent;
        this.setSide(count);
    }

}
