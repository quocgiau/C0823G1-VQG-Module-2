package ss17_binary_file_serialization.bai_tap.bai1.services;

import ss17_binary_file_serialization.bai_tap.bai1.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    void add(Product product);

    List<Product> search(String name);
}
