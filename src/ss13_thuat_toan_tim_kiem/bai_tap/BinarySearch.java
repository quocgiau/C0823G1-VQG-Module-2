package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int minIndex, int maxIndex, int value) {
        if (maxIndex > minIndex) {
            int middle = (minIndex + maxIndex) / 2;
            if (array[middle] == value) {
                return middle;
            }
            if (value > array[middle]) {
                return binarySearch(array, middle + 1, maxIndex, value);
            }
            return binarySearch(array, minIndex, middle - 1, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ " + i + 1);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        System.out.println("Nhập số cần tìm");
        int number = Integer.parseInt(scanner.nextLine());
        int index = binarySearch(arr, 0, arr.length - 1, number);
        if (index == -1) {
            System.out.println("Số " + number + " không nằm trong mảng");
        } else {
            System.out.println("Số " + number + " có nằm trong mảng");
        }
    }
}
