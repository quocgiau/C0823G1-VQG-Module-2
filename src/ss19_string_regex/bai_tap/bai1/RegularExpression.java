package ss19_string_regex.bai_tap.bai1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression {
    private static final String NAME_CLASS = "^([CAP])[0-9]{4}([GHIK])$";

    public static boolean validate(String name) {
        return Pattern.matches(NAME_CLASS, name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameClass;
        do {
            System.out.println("Nhập tên lớp bạn cần kiểm tra");
            nameClass = scanner.nextLine();
            if (validate(nameClass)) {
                System.out.println("Tên lớp " + nameClass + " hợp lệ");
                break;
            } else {
                System.out.println("Tên lớp " + nameClass + " không hợp lệ.");
            }
        } while (true);
    }
}
