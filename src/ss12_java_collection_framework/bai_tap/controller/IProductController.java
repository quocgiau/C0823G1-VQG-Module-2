package ss12_java_collection_framework.bai_tap.controller;

import ss12_java_collection_framework.bai_tap.model.Product;

public interface IProductController {
    void showProduct();

    void add(Product product);

    void delete(int id);

    void edit(int id, Product product);

    void search(String name);
//    void sortUp();
//    void sortDown();
}
