package Introduction_to_java.bai_tap;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD bạn muốn chuyển đổi:");
        usd = scanner.nextDouble();
        double exchange = usd * vnd;
        System.out.println("Giá trị VNĐ tương ứng là: " + exchange);
    }
}
