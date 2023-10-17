package Access_modifier.bai_tap.bai1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0); //Khởi tạo đối tượng có bán kính là 5
        System.out.println(circle1);
        System.out.println("Bán kính " + circle1.getRadius());
        System.out.println("Diện tích " + circle1.getArea());
    }
}
