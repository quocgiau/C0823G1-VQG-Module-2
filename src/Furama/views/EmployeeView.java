package Furama.views;

import java.util.Scanner;

public class EmployeeView {
    Scanner scanner = new Scanner(System.in);
    public void showMenu(){
        System.out.println("--------Quản lý nhân viên--------");
        System.out.println("1. Hiển thị danh sách nhân viên");
        System.out.println("2. Thêm nhân viên mới");
        System.out.println("3. Chỉnh sửa nhân viên");
        System.out.println("4. Xóa nhân viên");
        System.out.println("5. Tìm kiếm theo tên nhân viên");
        System.out.println("6. Trở về menu chính");
    }
    public void menuEmployee(){
        int choice;
        do {
            try {
                showMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Vui lòng nhập các số từ 1 đến 6");
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng chỉ nhập số");
            }
        }while (true);
    }
}
