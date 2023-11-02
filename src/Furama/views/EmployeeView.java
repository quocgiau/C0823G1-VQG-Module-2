package Furama.views;

import Furama.controllers.EmployeeController;
import Furama.models.Employee;
import ss17_binary_file_serialization.bai_tap.bai1.models.Product;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    Scanner scanner = new Scanner(System.in);
    private EmployeeController employeeController = new EmployeeController();
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
                        display();
                        break;
                    case 2:
                        employeeController.add(addEmployee());
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
    public Employee addEmployee() {
        int idEmployee = Integer.parseInt(scanner.nextLine());
        System.out.println("ID của bạn là: " + idEmployee);
        System.out.println("Nhập mã");
        String code = scanner.nextLine();
        System.out.println("Nhập họ và tên Employee");
        String nameEmployee = scanner.nextLine();
        System.out.println("Nhập birthday Employee");
        String birthdayEmployee = scanner.nextLine();
        System.out.println("Chọn giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập CCCD");
        int idNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập SDT ví dụ 0345323724");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Chọn trình độ học vấn");
        String level = scanner.nextLine();
        System.out.println("Chọn vị trí làm việc");
        String location = scanner.nextLine();
        int wage = Integer.parseInt(scanner.nextLine());
        System.out.println("Mức lương của bạn khi làm " + location + " sẽ là: " + wage);
        return new Employee(idEmployee, code, nameEmployee, birthdayEmployee, gender, idNumber, phone, email, level, location, wage);
    }
    public void display() {
        List<Employee> lists = employeeController.getList();
        if (lists.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (Employee employee : lists) {
                System.out.println(employee);
            }
        }
    }
}
