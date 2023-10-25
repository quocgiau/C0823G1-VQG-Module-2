package ss13_thuat_toan_tim_kiem.thuc_hanh;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        int[] frequentChar = new int[255];                         //{1}
        int ascii;
        for (int i = 0; i < inputString.length(); i++) {           //{2}
            /* Tìm ví trí tương ứng của ký tự trong bảng ASCII */
            ascii = inputString.charAt(i);                         //{3}
            /* Tăng giá trị tần suất */
            frequentChar[ascii] += 1;                              //{4}
        }
        int max = 0;                                               //{5}
        char character = (char) 255; /* empty character */         //{6}
        for (int j = 0; j < 255; j++) {                            //{7}
            if (frequentChar[j] > max) {                           //{8}
                max = frequentChar[j];                             //{9}
                character = (char) j;                              //{10}
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
    /* Độ phức tạp của thuật toán trên là O(255) */
}
