package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Combine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng 1");
            arr1[i] = scanner.nextInt();
        }
        int[] arr2 = new int[4];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng 2");
            arr2[i] = scanner.nextInt();
        }
        int[] newArr = new int[arr1.length + arr2.length];
        for (int j = 0; j < arr1.length; j++) {
            newArr[j] = arr1[j];
        }
        int count = arr1.length;
        for (int k = 0; k < arr2.length; k++) {
            newArr[count]= arr2[k];
            count++;
        }
        String arrString = Arrays.toString(newArr);
        System.out.println("Mảng sau khi gộp là: " + arrString);
    }
}
