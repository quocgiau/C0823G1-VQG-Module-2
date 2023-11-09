package Furama.views;

import Furama.controllers.FacilityController;
import Furama.models.Employee;
import Furama.models.Facility;
import Furama.models.Villa;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilitiesView {
    Scanner scanner = new Scanner(System.in);
    private CheckingInput v = new CheckingInput();
    private FacilityController facilityController = new FacilityController();
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
                        display();
                        break;
                    case 2:
                        addFacility();
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
    public void showMenuFacility(){
        System.out.println("1. Thêm Villa mới");
        System.out.println("2. Thêm House mới");
        System.out.println("3. Thêm Room mới");
        System.out.println("4. Quay lại menu");
    }
    public void addFacility(){
        int choice;
        do {
            try {
                showMenuFacility();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        addVilla();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Vui lòng nhập các số từ 1 đến 4");
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng chỉ nhập số");
            }
        }while (true);
    }
    public void display(){
        Map<Facility, Integer> map = facilityController.getList();
        if (map.isEmpty()){
            System.out.println("Danh sách cơ sở trống");
        }else {
            for (Map.Entry<Facility,Integer> integerEntry: map.entrySet()){
                System.out.println(integerEntry.getKey()+ ": " + integerEntry.getValue());
            }
        }
    }
    public void addVilla() {
        int id = inputId();
        System.out.println("Villa sẽ có ID là:  " + id);
        String code = scanner.nextLine();
        String name = v.inputName("Vila");
        int area = v.inputArea("sử dụng Vila");
        int price = v.inputPrice();
        int people = v.inputPeople();
        String type = v.choiceType();
        System.out.println("Chọn tiêu chuẩn phòng");
        String standard = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi");
        int areaPool = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số tầng");
        int floor = Integer.parseInt(scanner.nextLine());
        Villa vila = new Villa(id,code, name, area, price, people, type, standard, areaPool, floor);
        facilityController.add(vila);
    }
    public int inputId() {
        int count = 0;
        Map<Facility, Integer> facilityIntegerMap = facilityController.getList();
        for (Map.Entry<Facility, Integer> map : facilityIntegerMap.entrySet()) {
            count = map.getKey().getId();
        }
        return count + 1;
    }
}
