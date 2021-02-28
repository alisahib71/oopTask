package service.impl;

import dao.ProductDaoImpl;
import dao.impl.ProductDao;
import exception.ProductNotFoundException;
import exception.ValidateException;
import model.Product;
import service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductDaoImpl productDao = new ProductDaoImpl();

    private void validateProduct(Product product) {
        if (product == null) {
            throw new ValidateException("Product is null.");
        }
        if (product.getCount() <0){
            throw new ValidateException("Count should not be negative number.");
        }
    }

    @Override
    public void addProduct(Product product) {
        validateProduct(product);
        productDao.addProduct(product);
    }

    @Override
    public Product getProductById(Integer id) {
        Product product = productDao.getProductById(id);
        if (product == null) {
            throw new ProductNotFoundException("Product not found.");
        }
        return product;
    }

    @Override
    public void deleteProductById(Integer id) {

    }

    @Override
    public void updateProductById(Product product, Integer id) {

    }

    @Override
    public List<Product> getProductList() {
        return null;
    }
}
