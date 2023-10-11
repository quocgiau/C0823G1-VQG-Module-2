package mang_va_phuong_thuc_trong_java.bai_tap.bai4;

import java.util.Scanner;
// Tìm phần tử lớn nhất trong mảng hai chiều

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hàng");
        int row = scanner.nextInt();
        System.out.println("Nhập cột");
        int col = scanner.nextInt();
        int[][] arr2d = new int[row][col];
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.println("Nhập phần tử thứ [" + i + "][" + j + "]");
                arr2d[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Số lớn nhất trong mảng hai chiều đó là: " + maxNumber(arr2d));
    }

    public static int maxNumber(int[][] arr2d) {
        int max = 0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (arr2d[i][j] > max) {
                    max = arr2d[i][j];
                }
            }
        }
        return max;
    }
}
