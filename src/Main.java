import model.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product.Builder()
                .withProductName("HP")
                .withProductNumber("12xy3z")
                .withPrice(4000.0)
                .withCount(3)
                .build();

        System.out.println(product);
    }
}
