package Furama.views;

import Furama.controllers.CustomerController;
import Furama.models.Customer;
import Furama.models.Employee;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private CheckingInput c = new CheckingInput();
    private static final String C = "khách hàng";
    private static final String NEW_NAME = "khách hàng mới";
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
                        addCustomer();
                        break;
                    case 3:
                        editCustomer();
                        break;
                    case 4:
                        controller.delete(idDeleteCustomer());
                        break;
                    case 5:
                        outputNameSearch();
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
    public void addCustomer() {
        int idEmployee = inputId();
        System.out.println("ID của bạn là: " + idEmployee);
        String code = c.inputCode(C,"KH-");
        String nameEmployee = c.inputName(C);
        String birthdayEmployee = c.inputBirthday(C);
        String gender = c.chooseGender();
        int idNumber = c.inputIdCard(C);
        int phone = c.inputPhone(C);
        String email = c.inputEmail(C);
        String type = customerType();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        Customer customer = new Customer(idEmployee, code, nameEmployee, birthdayEmployee, gender, idNumber, phone, email, type, address);
        controller.add(customer);
        System.out.println("Thêm mới khách hàng thành công");
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
    public String customerType(){
        System.out.println("Chọn loại khách hàng");
        int choice;
        do {
            try {
                System.out.println("1. Diamond");
                System.out.println("2. Platinum");
                System.out.println("3. Gold");
                System.out.println("4. Silver");
                System.out.println("5. Member");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        return "Diamond";
                    case 2:
                        return "Platinum";
                    case 3:
                        return "Gold";
                    case 4:
                        return "Silver";
                    case 5:
                        return "Member";
                    default:
                        System.out.println("Vui lòng nhập từ 1 đến 5");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            }
        } while (true);
    }
    public void outputNameSearch(){
        System.out.println("Nhập tên khách hàng bạn cần tìm");
        String name = c.checkSpace();
        List<Customer> employeeList = controller.search(name);
        if (employeeList.isEmpty()) {
            System.out.println("Không tìm thấy tên khách hàng bạn cần tìm");
        } else {
            for (Customer customer : employeeList) {
                System.out.println(customer);
            }
        }
    }
    public int idDeleteCustomer() {
        List<Customer> customerList = controller.getList();
        System.out.println("Nhập Id khách hàng muốn xóa");
        do {
            int id = Integer.parseInt(c.checkSpace());
            for (Customer customer : customerList) {
                if (customer.getId() == id) {
                    System.out.println("Bạn có chắc muốn xóa khách hàng này không? ( y / n )");
                    if (c.decision()) {
                        System.out.println("Bạn đã xóa khách hàng " + customer.getName() + " thành công");
                        return id;
                    } else {
                        System.out.println("Bạn chưa xóa ai");
                        return -1;
                    }
                }
            }
            System.out.println("Id không tồn tại. Vui lòng nhập lại!");
        } while (true);
    }
    public int idEditCustomer() {
        List<Customer> customerList = controller.getList();
        System.out.println("Nhập Id khách hàng muốn sửa");
        int id;
        int count;
        do {
            count = 0;
            id = Integer.parseInt(c.checkSpace());
            for (Customer customer : customerList) {
                if (customer.getId() == id) {
                    System.out.println("Có phải bạn đang muốn sửa khách hàng " + customer.getName() + " không? ( y / n )");
                    if (c.decision()) {
                        return id;
                    } else {
                        System.out.println("Vui lòng nhập lại Id khách hàng bạn cần sửa");
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.println("Id không tồn tại. Vui lòng nhập lại!");
            }
        } while (true);
    }
    public void editCustomer(){
        int id = idEditCustomer();
        System.out.println("Bắt đầu nhập thông tin mới cho khách hàng");
        String code = "Em không biết viết gì để giữ nguyên mã";
        String name = c.inputName(NEW_NAME);
        String birthday = c.inputBirthday(NEW_NAME);
        String gender = c.chooseGender();
        int idCard = c.inputIdCard(NEW_NAME);
        int phone = c.inputPhone(NEW_NAME);
        String email = c.inputEmail(NEW_NAME);
        String type = customerType();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Bạn có muốn thay đổi thông tin khách hàng này không? (y / n)");
        if (c.decision()){
            Customer customer = new Customer(id, code, name, birthday, gender, idCard, phone, email, type, address);
            controller.edit(id,customer);
            System.out.println("Bạn đã sửa thông tin khách hàng thành công");
        }else {
            System.out.println("Bạn không sửa thông tin");
        }
    }

}
