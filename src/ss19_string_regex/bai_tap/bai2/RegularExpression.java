package ss19_string_regex.bai_tap.bai2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression {
    private static final String PHONE = "^\\(84\\)-\\(0[1-9]\\d{8}\\)$";

    public static boolean validate(String phoneNumber) {
        return Pattern.matches(PHONE, phoneNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại");
            phoneNumber = scanner.nextLine();
            if (validate(phoneNumber)) {
                System.out.println("Số điện thoại " + phoneNumber + " hợp lệ.");
                break;
            } else {
                System.out.println("Số điện thoại " + phoneNumber + " không hợp lệ.");
            }
        } while (true);
    }
}
