package homeworks.homework07;

public class Child extends Person {
    public Child(String personName, int age, int amountMoney) {
        super(personName, age, amountMoney);
    }

    @Override
    public void buyProduct(Product product) {
        if ((getAge() > 6) && (product.isChildAvailable())) {
            super.buyProduct(product);
        } else {
            System.out.println(this.getPersonName() + " либо слишком молокосос, либо пытается купить запрещенку. В продаже отказать.");
        }
    }
}
