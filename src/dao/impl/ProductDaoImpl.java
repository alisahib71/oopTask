package dao.impl;

import dao.ProductDao;
import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDaoImpl implements ProductDao {

    private Map<Integer,Product> products = new HashMap<>();
    private Integer count =0;


    @Override
    public void addProduct(Product product) {
        products.put(count++,product);
    }

    @Override
    public Product getProductById(Integer id) {
        return products.get(id);
    }

    @Override
    public void deleteProductById(Integer id) {
        products.remove(id);
    }

    @Override
    public void updateProductById(Product product, Integer id) {

        Product p = products.get(id);
        p.setProductName(product.getProductName());
        p.setProductNumber(product.getProductNumber());
        p.setPrice(product.getPrice());
        p.setCount(product.getCount());
        products.replace(id,p);

    }

    @Override
    public List<Product> getProductList() {
        return new ArrayList<>(products.values());  //        return products.values().stream().collect(Collectors.toList());
    }
}
