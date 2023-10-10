package Vong_lap_trong_java.bai_tap;

import java.util.Scanner;
// Hiển thị 20 số nguyên tố đầu tiên
public class PrimeFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố bạn cần in:");
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int i = 2;
        System.out.println(number + " số nguyên tố đầu tiên là: ");
        while (count != number) {
            if (checkNumber(i) == 2){
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
    public static int checkNumber(int a){
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0){
                count++;
            }
        }
        return count;
    }
}
