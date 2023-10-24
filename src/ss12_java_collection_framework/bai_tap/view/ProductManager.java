package ss12_java_collection_framework.bai_tap.view;

import ss12_java_collection_framework.bai_tap.controller.IProductController;
import ss12_java_collection_framework.bai_tap.controller.ProductController;
import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.Scanner;

public class ProductManager {
    private final Scanner scanner = new Scanner(System.in);
    private final IProductController iProductController = new ProductController();

    public void showMenu() {
        System.out.println("1. Thêm sản phẩm\n" +
                "2. Sửa thông tin sản phẩm theo id\n" +
                "3. Xoá sản phẩm theo id\n" +
                "4. Hiển thị danh sách sản phẩm\n" +
                "5. Tìm kiếm sản phẩm theo tên\n" +
                "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá" +
                "7. Thoát chương trình");
    }
//public void sort(){
//    System.out.println("1. Sắp xếp tăng dần");
//    System.out.println("2. Sắp xếp giảm dần");
//    System.out.println("3. Thoát");
//}
//public void runSort(){
//    int choice;
//    do {
//        sort();
//        choice = Integer.parseInt(scanner.nextLine());
//        switch (choice) {
//            case 1:
//                iProductController.sortUp();
//                break;
//            case 2:
//                iProductController.sortDown();
//                break;
//            case 3:
//                return;
//            default:
//                System.out.println("Nhập lại từ 1 đến 3");
//        }
//    }while (true);
//}
    public void runMenu() {
        int choice;
        do {
            showMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductController.add(addProduct());
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    iProductController.delete(deleteProduct());
                    break;
                case 4:
                    iProductController.showProduct();
                    break;
                case 5:
                    iProductController.search(searchProduct());
                    break;
                case 6:
//                    runSort();
                    break;
                case 7:
                    System.exit(7);
                default:
                    System.out.println("Vui lòng nhập trong danh sách");
            }
        } while (true);
    }

    public Product addProduct() {
        System.out.println("Nhập Id sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá tiền");
        double money = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, money);
        return product;
    }

    public void editProduct() {
        System.out.println("Nhập Id sản phẩm cần sửa");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm cần sửa");
        String name = scanner.nextLine();
        System.out.println("Nhập giá tiền cần sửa");
        double money = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, money);
        iProductController.edit(id, product);
    }

    public int deleteProduct() {
        System.out.println("Nhập Id muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public String searchProduct() {
        System.out.println("Nhập tên muốn tìm");
        String name = scanner.nextLine();
        return name;
    }
}
