package ss12_java_collection_framework.bai_tap.service;

import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    void add(Product product);

    void delete(int id);

    void edit(int id, Product product);

    List<Product> search(String name);
//    void sortUp();
//    void sortDown();
}
