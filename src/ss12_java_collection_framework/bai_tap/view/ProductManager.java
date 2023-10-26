package ss12_java_collection_framework.bai_tap.view;

import ss12_java_collection_framework.bai_tap.controller.IProductController;
import ss12_java_collection_framework.bai_tap.controller.ProductController;
import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.List;
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
                "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
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
                    displayProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
//                    runSort();
                    break;
                case 7:
                    System.out.println("Hẹn gặp lại");
                    System.exit(7);
                default:
                    System.out.println("Vui lòng nhập trong danh sách");
            }
        } while (true);
    }

    public Product addProduct() {
        int id = checkIdAddProduct();
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá tiền");
        double money = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, money);
        return product;
    }

    public void displayProduct() {
        List<Product> productList = iProductController.getAll();
        if (productList.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    public void editProduct() {
        int id = checkIdProduct("muốn sửa");
        System.out.println("Nhập tên sản phẩm cần sửa");
        String name = scanner.nextLine();
        System.out.println("Nhập giá tiền cần sửa");
        double money = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, money);
        iProductController.edit(id, product);
    }

    public int deleteProduct() {
        int id = checkIdProduct("muốn xóa");
        System.out.println("Bạn có muốn xóa k ? y/n");
        if (confirm()) {
            return id;
        } else {
            System.out.println("Bạn không xóa");
        }
        return id;
    }

    public int checkIdAddProduct() {
        List<Product> productList = iProductController.getAll();
        int id;
        int count;
        System.out.println("Nhập Id muốn thêm");
        do {
            count = 0;
            id = Integer.parseInt(scanner.nextLine());
            for (Product product : productList) {
                if (product.getId() == id) {
                    count++;
                }
            }
            if (count == 0) {
                return id;
            } else {
                System.out.println("ID đã tồn tại");
            }
        } while (true);
    }

    public int checkIdProduct(String text) {
        List<Product> productList = iProductController.getAll();
        int id;
        int count;
        System.out.println("Nhập Id " + text);
        do {
            count = 0;
            id = Integer.parseInt(scanner.nextLine());
            for (Product product : productList) {
                if (product.getId() == id) {
                    count++;
                }
            }
            if (count == 1) {
                return id;
            } else {
                System.out.println("ID không tồn tại");
            }
        } while (true);
    }

    public boolean confirm() {
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public void searchProduct() {
        List<Product> productList = iProductController.getAll();
        System.out.println("Nhập tên muốn tìm");
        String name = scanner.nextLine();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                System.out.println("Thông tin sản phẩm bạn cần tìm là: ");
                System.out.println(product);
            }
        }
    }
}
