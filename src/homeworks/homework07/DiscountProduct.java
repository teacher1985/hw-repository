package homeworks.homework07;

import java.time.LocalDate;

public class DiscountProduct extends Product {
    private int discount;
    private final LocalDate date;

    public DiscountProduct(String productName, int productPrice, int discount, LocalDate date) {
        super(productName, productPrice);
        this.discount = discount;
        this.date = date;
    }
}
