package ss17_binary_file_serialization.bai_tap.bai1.repositories;

import ss17_binary_file_serialization.bai_tap.bai1.models.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    void add(Product product);

    List<Product> search(String name);
}
