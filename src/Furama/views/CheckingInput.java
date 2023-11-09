package Furama.views;

import java.text.ParseException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckingInput {
    Scanner scanner = new Scanner(System.in);
    private static final String NAME = "^(?:\\b\\p{Lu}\\p{Ll}*\\b\\s*)+$";
    private static final String ID_CARD = "^\\d{9}|\\d{12}$";
    private static final String PHONE = "^0\\d{9,10}$";
    private static final String EMAIL = "^[A-Za-z0-9]+([._%+-][A-Za-z0-9]+)*@[A-Za-z0-9]+([.-][A-Za-z0-9]+)*\\.[A-Za-z]{2,}$";
    private static final String CODE = "^\\d{4}$";

    public static boolean validate(String name) {
        return Pattern.matches(NAME, name);
    }

    public String inputName(String srt) {
        String name;
        do {
            System.out.println("Nhập tên " + srt);
            name = checkSpace();
            if (validate(name)) {
                return name;
            } else {
                System.out.println("Vui lòng nhập tên phù hợp");
            }
        } while (true);
    }

    public static boolean isOver18(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dob = LocalDate.parse(date, formatter);
        LocalDate today = LocalDate.now();
        Period age = Period.between(dob, today);
        return age.getYears() >= 18;
    }

    public String inputBirthday(String srt) {
        String birthday;
        do {
            try {
                System.out.println("Nhập Ngày/Tháng/Năm sinh " + srt);
                birthday = scanner.nextLine();
                if (isOver18(birthday)) {
                    return birthday;
                } else {
                    System.out.println(srt + " cần lớn hơn 18 tuổi. Vui lòng nhập lại!");
                }
            } catch (DateTimeException e) {
                System.out.println("Vui lòng nhập đúng định dạng DD/MM/YYYY");
            }
        } while (true);
    }

    public String chooseGender() {
        System.out.println("Lựa chọn giới tính: ");
        int choice;
        do {
            try {
                System.out.println("1. Nam");
                System.out.println("2. Nữ");
                System.out.println("3. Giới tính khác");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        return "Nam";
                    case 2:
                        return "Nữ";
                    case 3:
                        return "Giới tính khác";
                    default:
                        System.out.println("Vui lòng nhập từ 1 đến 3");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            }
        } while (true);
    }

    public static boolean isValidIDCardFormat(String idCardNumber) {
        return Pattern.matches(ID_CARD, idCardNumber);
    }

    public int inputIdCard(String srt) {
        int idCard;
        do {
            System.out.println("Nhập CCCD " + srt);
            idCard = Integer.parseInt(scanner.nextLine());
            if (isValidIDCardFormat(String.valueOf(idCard))) {
                return idCard;
            } else {
                System.out.println("Vui lòng nhập CCCD có 9 hoặc 12 chữ số");
            }
        } while (true);
    }

    public static boolean isValidPhoneNumberFormat(String phoneNumber) {
        return Pattern.matches(PHONE, phoneNumber);
    }

    public int inputPhone(String srt) {
        String phone;
        do {
            System.out.println("Nhập số điện thoại " + srt);
            phone = scanner.nextLine();
            if (isValidPhoneNumberFormat(phone)) {
                return Integer.parseInt(phone);
            } else {
                System.out.println("Vui lòng nhập SĐT phải bắt đầu từ 0 và đủ 10 số");
            }
        } while (true);
    }

    public static boolean isValidEmailFormat(String email) {
        return Pattern.matches(EMAIL, email);
    }

    public String inputEmail(String str) {
        String email;
        do {
            System.out.println("Nhập email " + str);
            email = scanner.nextLine();
            if (isValidEmailFormat(email)) {
                return email;
            } else {
                System.out.println("Vui lòng nhập đúng định dạng email!");
            }
        } while (true);
    }

    public String checkSpace() {
        String text;
        do {
            text = scanner.nextLine();
            if ((text.isEmpty())) {
                System.out.println("Vui lòng không để trống");
            } else {
                return text;
            }
        } while (true);
    }

    public boolean decision() {
        String text = scanner.nextLine();
        if (text.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean fourCode(String number) {
        return Pattern.matches(CODE, number);
    }

    public String inputCode(String str, String permanent) {
        String code;
        do {
            System.out.println("Nhập mã " + str);
            code = scanner.nextLine();
            if (fourCode(code)){
                return permanent + code;
            }else {
                System.out.println("Vui lòng nhập đúng định dạng 4 chữ số");
            }
        }while (true);
    }
    public int inputArea(String str){
        System.out.println("Nhập diện tích " + str);
        int area;
        do {
            try {
                area = Integer.parseInt(scanner.nextLine());
                if (area >= 30) {
                    return area;
                } else {
                    System.out.println("Vui lòng nhập diện tích lớn hơn 30m2");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            } catch (Exception e) {
                System.out.println("Lỗi không xác định");
            }
        } while (true);
    }
    public int inputPrice(){
        System.out.println("Nhập chi phí thuê");
        int price;
        do {
            try {
                price = Integer.parseInt(scanner.nextLine());
                if (price > 1) {
                    return price;
                } else {
                    System.out.println("Vui lòng nhập số dương");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            } catch (Exception e) {
                System.out.println("Lỗi không xác định");
            }
        } while (true);
    }
    public int inputPeople(){
        System.out.println("Nhập số lượng người lưu trú (Dưới 20 người)");
        int people;
        do {
            try {
                people = Integer.parseInt(scanner.nextLine());
                if (people > 1 && people <= 20) {
                    return people;
                } else {
                    System.out.println("Vui lòng nhập lớn hơn 0 và bé hơn 20");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            } catch (Exception e) {
                System.out.println("Lỗi không xác định");
            }
        } while (true);
    }
    public String choiceType(){
        System.out.println("Chọn kiểu thuê");
        int choice;
        do {
            try {
                System.out.println("1. Thuê theo năm");
                System.out.println("2. Thuê theo tháng");
                System.out.println("3. Thuê theo ngày");
                System.out.println("4. Thuê theo giờ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        return "thuê theo năm";
                    case 2:
                        return "thuê theo tháng";
                    case 3:
                        return "thuê theo ngày";
                    case 4:
                        return "thuê theo giờ";
                    default:
                        System.out.println("Nhập từ 1 - 4");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            } catch (Exception e) {
                System.out.println("Lỗi không xác định");
            }
        } while (true);
    }
}
