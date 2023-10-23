package ss11_stack_queue.bai_tap.bai1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu là: ");
        System.out.println(Arrays.toString(arr));
        Stack<Integer> numbers = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            numbers.push(arr[i]);
        }
        int lengthStack = numbers.size();
        for (int i = 0; i < lengthStack; i++) {
            arr[i] = numbers.pop();
        }
        System.out.println("Mảng sau khi đảo ngược là: ");
        System.out.println(Arrays.toString(arr));
    }
}
