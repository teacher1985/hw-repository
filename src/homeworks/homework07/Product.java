package homeworks.homework07;

public class Product {
    protected Integer productPrice;
    protected String productName;
    protected boolean childAvailable;

    public Product(String productName, int productPrice, boolean childAvailable) {
        setProductName(productName);
        setProductPrice(productPrice);
        setChildAvailable(childAvailable);
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

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public boolean isChildAvailable() {
        return childAvailable;
    }

    public void setChildAvailable(boolean childAvailable) {
        this.childAvailable = childAvailable;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productPrice=" + productPrice +
                ", productName='" + productName + '\'' +
                ", childAvailable=" + childAvailable +
                '}';
    }
}
