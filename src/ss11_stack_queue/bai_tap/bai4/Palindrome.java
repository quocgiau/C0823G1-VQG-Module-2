package ss11_stack_queue.bai_tap.bai4;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String srt = "Able was I ere I saw Elba";
        String newSrt = srt.toLowerCase();
        String[] arr = newSrt.split("");
        Queue<String> queue = new ArrayDeque<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            queue.add(arr[i]);
        }
        String[] arrNew = new String[queue.size()];
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i] = queue.poll();
        }
        if (Arrays.equals(arrNew, arr)) {
            System.out.println("Đây là chuỗi Palindrome");
        } else {
            System.out.println("Đây không phải là chuỗi Palindrome");
        }
    }
}
