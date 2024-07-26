package homeworks.homework07;

public class Product {
    private String productName;
    protected int productPrice;

    public Product(String productName, int productPrice) {
        setProductName(productName);
        setProductPrice(productPrice);
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
        if (productPrice < 0) {
            throw new IllegalArgumentException
                    ("Деньги не могут быть отрицательными");
        }
        this.productPrice = productPrice;
    }
}
