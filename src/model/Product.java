package model;

public class Product {

    private String productName;
    private String productNumber;
    private Double price;
    private Integer count;

    public static class Builder {
        private String productName;
        private String productNumber;
        private Double price;
        private Integer count;

        public Builder withProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder withProductNumber(String productNumber) {
            this.productNumber = productNumber;
            return this;
        }

        public Builder withPrice(Double price) {
            this.price = price;
            return this;
        }

        public Builder withCount(Integer count) {
            this.count = count;
            return this;
        }

        public Product build() {
            Product product = new Product();
            product.setProductName(this.productName);
            product.setProductNumber(this.productNumber);
            product.setPrice(this.price);
            product.setCount(this.count);

            return product;
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName = '" + productName + '\'' +
                ", productNumber = '" + productNumber + '\'' +
                ", price = '" + price + '\'' +
                ", count = '" + count + '\'' +
                '}';
    }
}
