package Furama.views;

import java.util.Scanner;

public class FacilitiesView {
    Scanner scanner = new Scanner(System.in);
    public void showMenu(){
        System.out.println("-----Quản lý cơ sở vật chất-----");
        System.out.println("1. Hiển thi danh sách cơ sở");
        System.out.println("2. Thêm cơ sở mới");
        System.out.println("3. Danh sách cơ sở đang bảo trì");
        System.out.println("4. Xóa cơ sở");
        System.out.println("5. Quay lại menu chính");
    }
    public void menuFacilities(){
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
                        System.out.println("Tính năng đang được bảo trì");
                        break;
                    case 4:
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Vui lòng nhập các số từ 1 đến 5");
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng chỉ nhập số");
            }
        }while (true);
    }
}
