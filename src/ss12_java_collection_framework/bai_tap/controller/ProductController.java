package ss12_java_collection_framework.bai_tap.controller;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.service.IProductService;
import ss12_java_collection_framework.bai_tap.service.ProductService;

import java.util.List;

public class ProductController implements IProductController {
    private final IProductService iProductService = new ProductService();

    @Override
    public List<Product> getAll() {
        return iProductService.getAll();
    }

    @Override
    public void add(Product product) {
        iProductService.add(product);
    }

    @Override
    public void delete(int id) {
        iProductService.delete(id);
    }

    @Override
    public void edit(int id, Product product) {
        iProductService.edit(id, product);
    }

    @Override
    public List<Product> search(String name) {
        return iProductService.search(name);
    }

//    @Override
//    public void sortUp() {
//        iProductService.sortUp();
//    }
//
//    @Override
//    public void sortDown() {
//iProductService.sortDown();
//    }
}
