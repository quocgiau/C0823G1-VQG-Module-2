package mang_va_phuong_thuc_trong_java.bai_tap.bai6;

import java.util.Scanner;

// Tính tổng các số ở một cột xác định
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Nhập hàng");
        int row = scanner.nextInt();
        System.out.println("Nhập cột");
        int col = scanner.nextInt();
        int[][] arr2d = new int[row][col];
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.println("Nhập phần tử thứ [" + i + "][" + j + "]:");
                arr2d[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhập cột bạn muốn tính");
        int findColumn = scanner.nextInt();
        for (int i = 0; i < arr2d.length; i++) {
            sum += arr2d[i][findColumn];
        }
        System.out.println("Tổng ở cột " + findColumn + " là: " + sum);
    }
}
