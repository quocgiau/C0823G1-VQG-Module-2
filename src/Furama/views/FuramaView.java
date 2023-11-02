package Furama.views;

import java.util.Scanner;

public class FuramaView {
    Scanner scanner = new Scanner(System.in);
    EmployeeView employeeView = new EmployeeView();
    CustomerView customerView = new CustomerView();
    FacilitiesView facilitiesView = new FacilitiesView();

    public void showMenu() {
        System.out.println("---------Furama---------");
        System.out.println("1. Quản lý nhân viên");
        System.out.println("2. Quản lý khách hàng");
        System.out.println("3. Quản lý cơ sở vật chất");
        System.out.println("4. Quản lý đặt chỗ");
        System.out.println("5. Quản lý khuyến mại");
        System.out.println("6. Thoát chương trình");
    }

    public void displayMainMenu() {
        int choice;
        do {
            try {
                showMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        employeeView.menuEmployee();
                        break;
                    case 2:
                        customerView.menuCustomer();
                        break;
                    case 3:
                        facilitiesView.menuFacilities();
                        break;
                    case 4:
                        System.out.println("Khu nghỉ dưỡng hiện đang bảo trì");
                        break;
                    case 5:
                        System.out.println("Hiện chưa có khuyến mãi nào");
                        break;
                    case 6:
                        System.out.println("Hẹn gặp lại");
                        System.exit(6);
                    default:
                        System.out.println("Vui lòng nhập các số từ 1 đến 6");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng chỉ nhập số");
            }
        } while (true);
    }

}
