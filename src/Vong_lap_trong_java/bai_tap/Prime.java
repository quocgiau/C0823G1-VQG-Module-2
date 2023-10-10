package Vong_lap_trong_java.bai_tap;

import java.util.Scanner;
// Hiển thị các số nguyên tố nhỏ hơn 100

public class Prime {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 2; i < 100; i++) {
            if (checkNumber(i) == 2) {
                System.out.print(i + " ");
            }
        }
    }

    public static int checkNumber(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        return count;
    }
}
