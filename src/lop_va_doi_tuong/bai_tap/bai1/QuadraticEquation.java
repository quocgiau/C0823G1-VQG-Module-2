package lop_va_doi_tuong.bai_tap.bai1;

import java.util.Scanner;

// Xây dựng lớp QuadraticEquation (Phương trình bậc hai)
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

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

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return ((-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a));
    }

    public double getRoot2() {
        return ((-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a));
    }

    public double getRoot() {
        return -this.b / (2 * this.a);
    }
}
