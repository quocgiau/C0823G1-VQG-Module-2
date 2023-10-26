package ss14_thap_toan_sap_xep.bai_tap.bai1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void insertionSort(int[] arr) {
        int pos;
        int x;
        for (int i = 1; i < arr.length; i++) {
            System.out.println("Bước " + i + " gán x  = list[" + i + "] = " + arr[i] + " và pos = " + i);
            pos = i;
            x = arr[i];
            System.out.println("Tiếp theo nếu x < list[post - 1]");
            while (pos > 0 && x < arr[pos - 1]) {
                System.out.println("Đổi chỗ cho list[" + pos + "] và list[" + (pos - 1) + "]");
                arr[pos] = arr[pos - 1];
                pos--;
            }
            System.out.println("Gán lại list[" + pos + "] = " + x);
            arr[pos] = x;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {3, 4, 6, 8, 75, 8, 34, 54};
        insertionSort(arr);
        System.out.println("Mảng sau khi sắp xếp là: ");
        System.out.println(Arrays.toString(arr));
    }
}
