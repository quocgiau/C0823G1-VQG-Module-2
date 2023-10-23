package ss11_stack_queue.bai_tap.bai3;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển");
        int number = scanner.nextInt();
        int temp = number;
        int count;
        String str = "";
        Stack<Integer> stack = new Stack<>();
        while (number != 0) {
            count = number % 2;
            stack.push(count);
            number /= 2;
        }
        int length = stack.size();
        for (int i = 0; i < length; i++) {
            str += stack.pop();
        }
        System.out.print("Số nhị phân của số " + temp + " Là: ");
        System.out.println(str);
    }
}
