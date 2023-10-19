package Abstract_class_interface.bai_tap.bai2;


public class Square extends Rectangle implements Colorable {

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
        return "A Square with edges="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides...");
    }
}
