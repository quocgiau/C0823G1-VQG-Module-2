package ss12_java_collection_framework.bai_tap.service;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.repository.IProductRepository;
import ss12_java_collection_framework.bai_tap.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private final IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void delete(int id) {
        productRepository.delete(id);
    }

    @Override
    public void edit(int id, Product product) {
        productRepository.edit(id, product);
    }

    @Override
    public List<Product> search(String name) {
        return productRepository.search(name);
    }

//    @Override
//    public void sortUp() {
//        productRepository.sortUp();
//    }
//
//    @Override
//    public void sortDown() {
//        productRepository.sortDown();
//    }
}
