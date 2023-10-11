package mang_va_phuong_thuc_trong_java.bai_tap.bai5;

import java.util.Scanner;

// Tìm giá trị nhỏ nhất trong mảng
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minNumber(arr));
    }

    public static int minNumber(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
