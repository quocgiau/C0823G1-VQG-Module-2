package Vong_lap_trong_java.bai_tap;

import java.util.Scanner;
// Vẽ hình
public class Drawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ cao:");
        int high = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hình bạn muốn vẽ: " + "(1: Hình chữ nhật) " + "(2: Hình tam giác vuông) " + "(3: Hình Tam giác cân)");
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 1) {
            rectangle(high);
        }
        if (number == 2) {
            rightTriangleBotLeft(high);
            rightTriangleTopLeft(high);
        }
        if (number == 3) {
            isoscelesTriangle(high);
        }
//        if (name == 4) {
//            rightTriangleTopRight(high);
//        }
    }

    public static void rectangle(int a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài");
        int length = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j < length; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void rightTriangleBotLeft(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rightTriangleTopLeft(int a) {
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    public static void rightTriangleTopRight(int a) {
//        for (int i = 1; i <= a; i++) {
//            for (int j = a; j >= i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    public static void isoscelesTriangle(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a + i - 1; j++) {
                if (j <= a - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
