package homeworks.homework08;

import java.util.Objects;

public class Product {
    private String productName;
    private int productPrice;

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        String[] name = new String[10];
        name[0] = productName.replaceAll("0", "");
        for (int i = 1; i < name.length; i++) {
            String k = Integer.toString(i);
            name[i] = name[i - 1].replaceAll(k, "");
        }
        if (name[9].isEmpty()) {
            throw new IllegalArgumentException
                    ("Название продукта не должно содержать только цифры");
        }
        if (productName.length() < 3) {
            throw new IllegalArgumentException
                    ("Название недействительно");
        }
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productPrice == product.productPrice && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice);
    }
}
