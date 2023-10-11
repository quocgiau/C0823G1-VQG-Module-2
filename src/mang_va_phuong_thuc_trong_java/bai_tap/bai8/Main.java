package mang_va_phuong_thuc_trong_java.bai_tap.bai8;

import java.util.Scanner;

//Đếm số lần xuất hiện của ký tự trong chuỗi
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Nhập chuỗi để kiểm tra");
        String str = scanner.nextLine();
        System.out.println("Nhập ký tự bạn muốn tìm kiếm: ");
        String find = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (find.equals(String.valueOf(str.charAt(i)))){
                count++;
            }
        }
        System.out.println("Ký tự " + find + " xuất hiện " + count + " lần trông chuỗi.");
    }
}
