package mang_va_phuong_thuc_trong_java.bai_tap.bai1;

import java.util.Arrays;
import java.util.Scanner;
//  Xoá phần tử khỏi mảng
public class Erase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa:");
        int number = scanner.nextInt();
        int[] arr = {1, 2, 3, 3, 5, 6};
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                count = i;
                flag = true;

            }
        }
        if (flag) {
            for (int j = count; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = 0;
            String arrString = Arrays.toString(arr);
            System.out.println("Mảng sau khi xóa phần tử là: " + arrString);
        }else {
            System.out.println("Phần tử không tồn tại trong mảng");
        }
    }
}
