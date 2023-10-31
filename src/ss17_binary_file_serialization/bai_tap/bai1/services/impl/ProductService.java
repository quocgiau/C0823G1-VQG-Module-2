package ss17_binary_file_serialization.bai_tap.bai1.services.impl;

import ss17_binary_file_serialization.bai_tap.bai1.models.Product;
import ss17_binary_file_serialization.bai_tap.bai1.repositories.IProductRepository;
import ss17_binary_file_serialization.bai_tap.bai1.repositories.impl.ProductRepository;
import ss17_binary_file_serialization.bai_tap.bai1.services.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository iProductRepository = new ProductRepository();

    @Override
    public List<Product> getAll() {
        return iProductRepository.getAll();
    }

    @Override
    public void add(Product product) {
        iProductRepository.add(product);
    }

    @Override
    public List<Product> search(String name) {
        return iProductRepository.search(name);
    }
}
