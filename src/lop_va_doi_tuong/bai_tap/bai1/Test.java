package lop_va_doi_tuong.bai_tap.bai1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation exp = new QuadraticEquation();
        System.out.println("Nhập a");
        double a = scanner.nextDouble();
        System.out.println("Nhập b");
        double b = scanner.nextDouble();
        System.out.println("Nhập c");
        double c = scanner.nextDouble();
        if (a != 0) {
            exp = new QuadraticEquation(a, b, c);
            if (exp.getDiscriminant() > 0) {
                System.out.println("Phương trình có 2 nghiệm là: x1 = " + exp.getRoot1() + " x2 = " + exp.getRoot2());
            } else if (exp.getDiscriminant() == 0) {
                System.out.println("Phương trình có nghiệm kép x = " + exp.getRoot());
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Vui lòng nhập số khác 0");
        }
    }
}
