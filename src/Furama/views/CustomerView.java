package Furama.views;

import Furama.controllers.CustomerController;
import Furama.models.Customer;
import Furama.models.Employee;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private CheckingInput c = new CheckingInput();
    private static final String C = "khách hàng";
    private CustomerController controller = new CustomerController();
    Scanner scanner = new Scanner(System.in);
    public void showMenu(){
        System.out.println("-------Quản lý khách hàng-----");
        System.out.println("1. Hiển thị danh sách khách hàng");
        System.out.println("2. Thêm khách hàng mới");
        System.out.println("3. Chỉnh sửa khách hàng");
        System.out.println("4. Xóa khách hàng");
        System.out.println("5. Tìm kiếm theo tên khách hàng");
        System.out.println("6. Quay lại menu chính");
    }
    public void menuCustomer(){
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
                        controller.add(addCustomer());
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
    public Customer addCustomer() {
        int idEmployee = inputId();
        System.out.println("ID của bạn là: " + idEmployee);
        System.out.println("Nhập ");
        String code = scanner.nextLine();
        String nameEmployee = c.inputName(C);
        String birthdayEmployee = c.inputBirthday(C);
        String gender = c.chooseGender();
        int idNumber = c.inputIdCard(C);
        int phone = c.inputPhone(C);
        String email = c.inputEmail(C);
        System.out.println("Chọn loại khách");
        String type = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        return new Customer(idEmployee, code, nameEmployee, birthdayEmployee, gender, idNumber, phone, email, type, address);
    }
    public void display() {
        List<Customer> lists = controller.getList();
        if (lists.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (Customer customer : lists) {
                System.out.println(customer);
            }
        }
    }
    public int inputId() {
        int count = 0;
        List<Customer> customerList = controller.getList();
        for (Customer customer : customerList) {
            count = customer.getId();
        }
        return count + 1;
    }
}
