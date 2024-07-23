package homeworks.homework06;

public class Product {
    private String productName;
    private int productPrice;

    public Product(String productName, int productPrice) {
        setProductName(productName);
        setProductPrice(productPrice);
    }

    public void setProductName(String productName) {
        if (productName.isEmpty()) {
            throw new IllegalArgumentException
                    ("Имя не может быть пустым");
        }
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        if (productPrice < 0) {
            throw new IllegalArgumentException
                    ("Деньги не могут быть отрицательными");
        }
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
