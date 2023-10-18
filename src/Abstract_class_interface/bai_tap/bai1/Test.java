package Abstract_class_interface.bai_tap.bai1;

import java.util.concurrent.ThreadLocalRandom;

public class Test {
    public static void main(String[] args) {
        int percent;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Square(5);
        System.out.println("Kích thước ban đầu:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("Kích thước sau khi tăng:");
        percent = ThreadLocalRandom.current().nextInt(1, 100);
        for (Shape shape : shapes) {
            shape.resize(percent);
            System.out.println(shape);
        }
    }
}
