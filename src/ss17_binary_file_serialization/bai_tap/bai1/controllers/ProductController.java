package ss17_binary_file_serialization.bai_tap.bai1.controllers;

import ss17_binary_file_serialization.bai_tap.bai1.models.Product;
import ss17_binary_file_serialization.bai_tap.bai1.services.IProductService;
import ss17_binary_file_serialization.bai_tap.bai1.services.impl.ProductService;

import java.util.List;

public class ProductController {
    private IProductService iProductService = new ProductService();
    public List<Product> getAll() {
        return iProductService.getAll();
    }

    public void add(Product product) {
        iProductService.add(product);
    }

    public List<Product> search(String name) {
        return iProductService.search(name);
    }
}
