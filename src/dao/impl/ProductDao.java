package dao.impl;

import model.Product;

import java.util.List;

public interface ProductDao {
    void addProduct(Product product);

    Product getProductById(Integer id);

    void deleteProductById(Integer id);

    void updateProductById(Product product, Integer id);

    List<Product> getProductList();

}
