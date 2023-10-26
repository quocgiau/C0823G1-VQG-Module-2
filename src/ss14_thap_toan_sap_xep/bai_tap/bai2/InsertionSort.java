package ss14_thap_toan_sap_xep.bai_tap.bai2;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        int pos;
        int x;
        for (int i = 1; i < list.length; i++) { //đoạn array[0] đã sắp xếpk
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
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
