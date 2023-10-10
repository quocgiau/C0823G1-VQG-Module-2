package Introduction_to_java.bai_tap;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        double rate = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD bạn muốn chuyển đổi:");
        usd = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.println("Giá trị VNĐ tương ứng là: " + vnd);
    }
}
