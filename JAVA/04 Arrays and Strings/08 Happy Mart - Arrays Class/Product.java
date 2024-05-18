import java.util.*;

public class Product {
    public int productId;
    public String productName;
    public double price;

    // Include three argument constructor to initialize values
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    // This method should return the productId, productName and price seperated by
    // whitespace
    public String toString() {
        // return null;
        return productId + " " + productName + " " + price;
    }
}