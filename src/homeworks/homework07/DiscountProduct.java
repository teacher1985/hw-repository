package homeworks.homework07;

import java.time.LocalDate;

public class DiscountProduct extends Product {
    private int discount;
    private LocalDate discountPeriod;

    public DiscountProduct(String productName, int productPrice, boolean childAvailable, int discount) {
        super(productName, productPrice - productPrice * discount / 100, childAvailable);
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "DiscountProduct{" +
                "discount=" + discount +
                ", discountPeriod=" + discountPeriod +
                ", productPrice=" + productPrice +
                ", productName='" + productName + '\'' +
                ", childAvailable=" + childAvailable +
                '}';
    }
}
