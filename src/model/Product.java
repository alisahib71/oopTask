package model;

public class Product {
    private String  productName;
    private String  productCode;
    private String  productType;
    private Double  productPrice;
    private Integer count;

    public Product() {
    }

    public Product(String productName, String productCode ,String productType, Double productPrice, Integer count) {
        this.productName = productName;
        this.productCode = productCode;
        this.productType = productType;
        this.productPrice = productPrice;
        this.count = count;
    }



    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productPrice=" + productPrice +
                ", count=" + count +
                '}';
    }
}
