package ss17_binary_file_serialization.bai_tap.bai1.repositories.impl;


import ss17_binary_file_serialization.bai_tap.bai1.models.Product;
import ss17_binary_file_serialization.bai_tap.bai1.repositories.IProductRepository;
import ss17_binary_file_serialization.bai_tap.bai1.utils.ReadWriteProduct;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final String FILE = "src/ss17_binary_file_serialization/bai_tap/bai1/utils/data";

    @Override
    public List<Product> getAll() {
        List<Product> productList = ReadWriteProduct.readFile(FILE);
        return productList;
    }

    @Override
    public void add(Product product) {
        List<Product> productList = this.getAll();
        productList.add(product);
        ReadWriteProduct.writeFile(FILE, productList);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> products = new ArrayList<>();
        for (Product product : this.getAll()) {
            if (product.getName().contains(name)) {
                products.add(product);
            }
        }
        return products;
    }
}
