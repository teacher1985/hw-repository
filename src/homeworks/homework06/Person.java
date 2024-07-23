package homeworks.homework06;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int money;
    private List<Product> paket;

    public Person(String name, int money) {
        setName(name);
        setMoney(money);
        this.paket = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException
                    ("Имя не может быть пустым");
        }
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money < 0) {
            throw new IllegalArgumentException
                    ("Деньги не могут быть отрицательными");
        }
        this.money = money;
    }

    public void corzina() {
        if (!paket.isEmpty()) {
            for (Product p : paket) {
                System.out.print(p.getProductName());
            }
        } else {
            System.out.println("Ничего не куплено");
        }
    }

    public void addProducts(Product product) {
        paket.add(product);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
