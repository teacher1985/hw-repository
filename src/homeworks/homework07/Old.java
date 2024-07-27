package homeworks.homework07;

public class Old extends Person {
    public Old(String personName, int age, int amountMoney) {
        super(personName, age, amountMoney);
    }

    @Override
    public void buyProduct(Product product) {
        product.setProductPrice((int) (product.getProductPrice() * 0.95));
        super.buyProduct(product);
        product.setProductPrice((int) (product.getProductPrice() * 1.05));
    }
}
