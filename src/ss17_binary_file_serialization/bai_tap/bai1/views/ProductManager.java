package ss17_binary_file_serialization.bai_tap.bai1.views;

import ss17_binary_file_serialization.bai_tap.bai1.controllers.ProductController;
import ss17_binary_file_serialization.bai_tap.bai1.models.Product;

import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private final Scanner scanner = new Scanner(System.in);
    private ProductController controller = new ProductController();

    public Product addProduct() {
        int id = inputId();
        System.out.println("Id của bạn là: " + id);
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất");
        String brand = scanner.nextLine();
        System.out.println("Mô tả sản phẩm");
        String des = scanner.nextLine();
        Product product = new Product(id, name, price, brand, des);
        return product;
    }

    public int inputId() {
        int count = 0;
        List<Product> productList = controller.getAll();
        for (Product product : productList) {
            count = product.getId();
        }
        return count + 1;
    }

    public void outputNameSearch() {
        List<Product> productList = controller.search(inputNameSearch());
        if (productList.isEmpty()) {
            System.out.println("Không tìm thấy tên sản phẩm bạn cần tìm");
        } else {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    public String inputNameSearch() {
        System.out.println("Nhập tên cần tìm");
        String name = scanner.nextLine();
        return name;
    }

    public void display() {
        List<Product> lists = controller.getAll();
        if (lists.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (Product product : lists) {
                System.out.println(product);
            }
        }
    }

    public void showMenu() {
        System.out.println("-------------Menu-------------");
        System.out.println("1. Hiển thị danh sách sản phẩm");
        System.out.println("2. Thêm sản phẩm");
        System.out.println("3. Tìm kiếm sản phẩm");
        System.out.println("4. Thoát chương trình");
    }

    public void runMenu() {
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
                        controller.add(addProduct());
                        break;
                    case 3:
                        outputNameSearch();
                        break;
                    case 4:
                        System.out.println("Hẹn gặp lại");
                        System.exit(4);
                    default:
                        System.out.println("Vui lòng nhập từ 1 đến 4");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
            }
        } while (true);

    }
}
