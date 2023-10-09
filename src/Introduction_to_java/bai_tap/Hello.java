package Introduction_to_java.bai_tap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên vào đây");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}
