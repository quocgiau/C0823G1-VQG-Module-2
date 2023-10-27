package ss15_xu_ly_ngoai_le.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    private static final Scanner scanner = new Scanner(System.in);

    public IllegalTriangleException(String msg) {
        super(msg);
    }

    public static int checkNumber(String str) {
        int number;
        do {
            try {
                System.out.println("Nhập cạnh " + str);
                number = Integer.parseInt(scanner.nextLine());
                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Vui lòng nhập lại cạnh " + str + " số lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số cho cạnh " + str);
            }
        } while (true);
    }

    public static void checkTriangle(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Cạnh " + a + " " + b + " " + c + " Không phải là 3 cạnh của 1 tam giác");
        }
    }
}
