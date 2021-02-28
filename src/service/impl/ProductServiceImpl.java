package service.impl;


import dao.impl.ProductDaoImpl;
import exception.ValidateException;
import model.Product;
import service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductDaoImpl productDaoImpl = new ProductDaoImpl();

    private void validateProduct(Product product){
        if (product==null){
            throw new ValidateException("Product is null");
        }else if (product.getCount()<0){
            throw new ValidateException("Count shouldn't be negative number");
        }
    }

    @Override
    public void addProduct(Product product) {
        validateProduct(product);
        productDaoImpl.addProduct(product);
    }

    @Override
    public Product getProductById(Integer id) {
     Product product = productDaoImpl.getProductById(id);
     if (product == null){
         throw new ValidateException("Product is not found.");
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

