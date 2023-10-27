package ss15_xu_ly_ngoai_le.bai_tap;

public class Triangle {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        do {
            try {
                a = IllegalTriangleException.checkNumber("a");
                b = IllegalTriangleException.checkNumber("b");
                c = IllegalTriangleException.checkNumber("c");
                IllegalTriangleException.checkTriangle(a, b, c);
                System.out.println("Cạnh " + a + " " + b + " " + c + " Là 3 cạnh của 1 tam giác");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
