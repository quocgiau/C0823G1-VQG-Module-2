package ss12_java_collection_framework.bai_tap.repository;

import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Giàu", 5));
        productList.add(new Product(2, "Abc", 2));
        productList.add(new Product(3, "Abcd", 3));
        productList.add(new Product(4, "Abbb", 4));
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                break;
            }
        }
    }

    @Override
    public void edit(int id, Product product) {
        for (Product product1 : productList) {
            if (product1.getId() == id) {
                product1.setName(product.getName());
                product1.setMoney(product.getMoney());
                break;
            }
        }
    }

    @Override
    public void search(String name) {
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                System.out.println(product);
            }
        }
    }

//    @Override
//    public void sortUp() {
////        Collections.sort(productList);
//    }
//
//    @Override
//    public void sortDown() {
//        productList.sort((product, t1) -> (int) product.getMoney());
//    }
}
