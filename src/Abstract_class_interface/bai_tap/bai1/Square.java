package Abstract_class_interface.bai_tap.bai1;


public class Square extends Shape implements Resizeable {
    private double edges = 1.0;

    public Square() {
    }

    public Square(double edges) {
        this.edges = edges;
    }

    public Square(String color, boolean filled, double edges) {
        super(color, filled);
        this.edges = edges;
    }

    public double getEdges() {
        return edges;
    }

    public void setEdges(double edges) {
        this.edges = edges;
    }

    public double getArea() {
        return Math.pow(getEdges(), 2);
    }

    public double getPerimeter() {
        return getEdges() * 4;
    }

    @Override
    public String toString() {
        return "Hình vuông có cạnh = "
                + getEdges()
                + " Diện tích = " + getArea();
    }

    @Override
    public void resize(double percent) {
        this.setEdges(this.edges += percent);
    }

}
