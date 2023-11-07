package Furama.views;

import Furama.controllers.EmployeeController;
import Furama.models.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    Scanner scanner = new Scanner(System.in);
    private CheckingInput c = new CheckingInput();
    private static final String E = "nhân viên";
    private static final String NEW_NAME = "nhân viên mới";
    private EmployeeController employeeController = new EmployeeController();

    public void showMenu() {
        System.out.println("--------Quản lý nhân viên--------");
        System.out.println("1. Hiển thị danh sách nhân viên");
        System.out.println("2. Thêm nhân viên mới");
        System.out.println("3. Chỉnh sửa nhân viên");
        System.out.println("4. Xóa nhân viên");
        System.out.println("5. Tìm kiếm theo tên nhân viên");
        System.out.println("6. Trở về menu chính");
    }

    public void menuEmployee() {
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
                        addEmployee();
                        break;
                    case 3:
                        editEmployee();
                        break;
                    case 4:
                        employeeController.delete(idDeleteEmployee());
                        break;
                    case 5:
                        outputNameSearch();
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Vui lòng nhập các số từ 1 đến 6");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng chỉ nhập số");
            }
        } while (true);
    }

    public void addEmployee() {
        int idEmployee = inputId();
        System.out.println("ID của bạn là: " + idEmployee);
        String code = c.inputCode(E,"NV-");
        String nameEmployee = c.inputName(E);
        String birthdayEmployee = c.inputBirthday(E);
        String gender = c.chooseGender();
        int idNumber = c.inputIdCard(E);
        int phone = c.inputPhone(E);
        String email = c.inputEmail(E);
        String level = chooseLevel();
        String location = selectLocation();
        int wage = inputWage(location);
        System.out.println("Bạn đã thêm mới nhân viên thành công");
        Employee employee = new Employee(idEmployee, code, nameEmployee, birthdayEmployee, gender, idNumber, phone, email, level, location, wage);
        employeeController.add(employee);
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

    public int inputId() {
        int count = 0;
        List<Employee> employeeList = employeeController.getList();
        for (Employee employee : employeeList) {
            count = employee.getId();
        }
        return count + 1;
    }

    public String chooseLevel() {
        System.out.println("Vui lòng lựa chọn trình độ học vấn");
        int choice;
        do {
            try {
                System.out.println("1. Trung cấp");
                System.out.println("2. Cao đẳng");
                System.out.println("3. Đại học");
                System.out.println("4. Sau đại học");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        return "Trung cấp";
                    case 2:
                        return "Cao đẳng";
                    case 3:
                        return "Đại học";
                    case 4:
                        return "Sau đại học";
                    default:
                        System.out.println("Vui lòng nhập từ 1 đến 4");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            }
        } while (true);
    }

    public String selectLocation() {
        System.out.println("Lựa chọn vị trí làm việc");
        int choice;
        do {
            try {
                System.out.println("1. Lễ tân");
                System.out.println("2. Phục vụ");
                System.out.println("3. Chuyên viên");
                System.out.println("4. Giám sát");
                System.out.println("5. Quản lý");
                System.out.println("6. Giám đốc");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        return "Lễ tân";
                    case 2:
                        return "Phục vụ";
                    case 3:
                        return "Chuyên viên";
                    case 4:
                        return "Giám sát";
                    case 5:
                        return "Quản lý";
                    case 6:
                        return "Giám đốc";
                    default:
                        System.out.println("Vui lòng nhập từ 1 đến 6");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            }
        } while (true);
    }

    public int inputWage(String str) {
        System.out.println("Nhập lương " + str);
        int wage;
        do {
            wage = Integer.parseInt(scanner.nextLine());
            if (wage > 0) {
                return wage;
            } else {
                System.out.println("Vui lòng nhập lương lớn hơn 0");
            }
        } while (true);
    }

    public void outputNameSearch() {
        System.out.println("Nhập tên nhân viên bạn cần tìm");
        String name = c.checkSpace();
        List<Employee> employeeList = employeeController.search(name);
        if (employeeList.isEmpty()) {
            System.out.println("Không tìm thấy tên nhân viên bạn cần tìm");
        } else {
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        }
    }

    public int idDeleteEmployee() {
        List<Employee> employeeList = employeeController.getList();
        System.out.println("Nhập Id nhân viên muốn xóa");
        int id;
        do {
            id = Integer.parseInt(c.checkSpace());
            for (Employee employee : employeeList) {
                if (employee.getId() == id) {
                    System.out.println("Bạn có chắc muốn xóa nhân viên này không? ( y / n )");
                    if (c.decision()) {
                        System.out.println("Bạn đã xóa nhân viên " + employee.getName() + " thành công");
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

    public int idEditEmployee() {
        List<Employee> employeeList = employeeController.getList();
        System.out.println("Nhập Id nhân viên muốn sửa");
        int id;
        int count;
        do {
            count = 0;
            id = Integer.parseInt(c.checkSpace());
            for (Employee employee : employeeList) {
                if (employee.getId() == id) {
                    System.out.println("Có phải bạn đang muốn sửa nhân viên " + employee.getName() + " không? ( y / n )");
                    if (c.decision()) {
                        return id;
                    } else {
                        System.out.println("Vui lòng nhập lại Id nhân viên bạn cần sửa");
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.println("Id không tồn tại. Vui lòng nhập lại!");
            }
        } while (true);
    }
    public void editEmployee(){
        int id = idEditEmployee();
        System.out.println("Bắt đầu nhập thông tin mới cho nhân viên");
        String code = "Em không biết viết gì để giữ nguyên mã";
        String name = c.inputName(NEW_NAME);
        String birthday = c.inputBirthday(NEW_NAME);
        String gender = c.chooseGender();
        int idCard = c.inputIdCard(NEW_NAME);
        int phone = c.inputPhone(NEW_NAME);
        String email = c.inputEmail(NEW_NAME);
        String level = chooseLevel();
        String location = selectLocation();
        int wage = inputWage(location);

        System.out.println("Bạn có muốn thay đổi thông tin nhân viên này không? (y / n)");
        if (c.decision()){
            Employee employee = new Employee(id, code, name, birthday, gender, idCard, phone, email, level, location, wage);
            employeeController.edit(id,employee);
            System.out.println("Bạn đã sửa thông tin nhân viên thành công");
        }else {
            System.out.println("Bạn không sửa thông tin");
        }
    }
}
