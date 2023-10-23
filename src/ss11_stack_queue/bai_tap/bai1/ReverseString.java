package ss11_stack_queue.bai_tap.bai1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String str = scanner.nextLine();
        String[] arr = str.split("");
        String srtNew = "";
        Stack<String> strings = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            strings.push(arr[i]);
        }
        int lengthStack = strings.size();
        for (int i = 0; i < lengthStack; i++) {
            srtNew += strings.pop();
        }
        System.out.println("Chuỗi sau khi đảo ngược là: ");
        System.out.println(srtNew);
    }
}
