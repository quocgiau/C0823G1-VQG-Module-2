package mang_va_phuong_thuc_trong_java.bai_tap.bai2;

import java.util.Arrays;
import java.util.Scanner;
// Thêm phần tử vào mảng
public class Increase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] newArr = new int[arr.length + 1];
        System.out.println("Nhập phần tử cần chèn: ");
        int number = scanner.nextInt();
        System.out.println("Nhập vị trí bạn muốn chèn vào mảng");
        int index = scanner.nextInt();
        if (index <= -1 || index >= arr.length - 1) {
            System.out.println("Không thể chèn phần tử vào mảng");
        } else {
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = number;
            for (int j = index; j < arr.length; j++) {
                newArr[j + 1] = arr[j];
            }
            System.out.println("Mảng sau khi chèn phần tử là: ");
            String newArrString = Arrays.toString(newArr);
            System.out.println(newArrString);
        }
    }
}
