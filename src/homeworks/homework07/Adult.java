package homeworks.homework07;

public class Adult  extends Person {
    private boolean availableCredit;

    public Adult(String personName, int age, int amountMoney, boolean availableCredit) {
        super(personName, age, amountMoney);
        this.availableCredit = availableCredit;
    }

    @Override
    public void buyProduct(Product product) {
        if ((product.getProductPrice() > getAmountMoney()) && availableCredit) {
            setAmountMoney(getAmountMoney() + 5000);
            System.out.println(getAmountMoney());
            super.buyProduct(product);
        } else {
            super.buyProduct(product);
        }
    }
}
