package homeworks.homework07;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private String personName;
    private int age;
    private int amountMoney;
    List<String> shoppingCart;

    public Person(String personName, int age, int amountMoney) {
        setPersonName(personName);
        setAge(age);
        setAmountMoney(amountMoney);
        shoppingCart = new ArrayList<>();
    }

    public String getPersonName() {
        return this.personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAmountMoney() {
        return this.amountMoney;
    }

    public void setAmountMoney(int amountMoney) {
        this.amountMoney = amountMoney;
    }

    public void buyProduct(Product product) {
        if (product.getProductPrice() < getAmountMoney()) {
            setAmountMoney(getAmountMoney() - product.getProductPrice());
            shoppingCart.add(product.getProductName());
            System.out.println(getPersonName() + " купил " + product.getProductName());
        } else {
            System.out.println(getPersonName() + " не может позволить себе " + product.getProductName());
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", age=" + age +
                ", amountMoney=" + amountMoney +
                '}';
    }
}
