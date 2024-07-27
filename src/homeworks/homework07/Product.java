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
