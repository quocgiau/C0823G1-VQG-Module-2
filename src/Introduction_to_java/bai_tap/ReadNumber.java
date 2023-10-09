package Introduction_to_java.bai_tap;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc: ");
        int number = Integer.parseInt(scanner.nextLine());
        String word = "";
        if (number < 0 || number > 999) {
            word = "out of ability";
        } else if (number == 0) {
            word = "Zero";
        } else {
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int ones = number % 10;
            switch (hundreds) {
                case 1:
                    word += "One hundred ";
                    break;
                case 2:
                    word += "Two hundred ";
                    break;
                case 3:
                    word += "Three hundred ";
                    break;
                case 4:
                    word += "Four hundred ";
                    break;
                case 5:
                    word += "Five hundred ";
                    break;
                case 6:
                    word += "Six hundred ";
                    break;
                case 7:
                    word += "Seven hundred ";
                    break;
                case 8:
                    word += "Eight hundred ";
                    break;
                case 9:
                    word += "Nine hundred ";
                    break;
            }
            if (tens == 1) {
                switch (ones) {
                    case 0:
                        word += "ten";
                        break;
                    case 1:
                        word += "eleven";
                        break;
                    case 2:
                        word += "twelve";
                        break;
                    case 3:
                        word += "thirteen";
                        break;
                    case 4:
                        word += "fourteen";
                        break;
                    case 5:
                        word += "fifteen";
                        break;
                    case 6:
                        word += "sixteen";
                        break;
                    case 7:
                        word += "seventeen";
                        break;
                    case 8:
                        word += "eighteen";
                        break;
                    case 9:
                        word += "nineteen";
                        break;
                }
            } else {
                switch (tens) {
                    case 2:
                        word += "twenty ";
                        break;
                    case 3:
                        word += "thirty ";
                        break;
                    case 4:
                        word += "forty ";
                        break;
                    case 5:
                        word += "fifty ";
                        break;
                    case 6:
                        word += "sixty ";
                        break;
                    case 7:
                        word += "seventy ";
                        break;
                    case 8:
                        word += "eighty ";
                        break;
                    case 9:
                        word += "ninety ";
                        break;
                }
                switch (ones) {
                    case 1:
                        word += "one";
                        break;
                    case 2:
                        word += "two";
                        break;
                    case 3:
                        word += "three";
                        break;
                    case 4:
                        word += "four";
                        break;
                    case 5:
                        word += "five";
                        break;
                    case 6:
                        word += "six";
                        break;
                    case 7:
                        word += "seven";
                        break;
                    case 8:
                        word += "eight";
                        break;
                    case 9:
                        word += "nine";
                        break;
                }
            }
        }
        System.out.println("Số " + number + " sau khi đọc thành chữ là: " + word);
    }
}