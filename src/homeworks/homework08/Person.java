package homeworks.homework08;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String personName;
    private int amountMoney;
    List<String> shoppingCart;

    public Person() {
        this.shoppingCart = new ArrayList<>();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        if (personName.isEmpty()) {
            throw new IllegalArgumentException
                    ("Имя не может быть пустым");
        }
        this.personName = personName;
    }

    public int getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(int amountMoney) {
        if (amountMoney < 0) {
            throw new IllegalArgumentException
                    ("Деньги не могут быть отрицательными");
        }
        this.amountMoney = amountMoney;
    }

    public void addShoppingCart(Product product) {
        String str;
        if (getAmountMoney() > product.getProductPrice()) {
            setAmountMoney(getAmountMoney() - product.getProductPrice());
            str = getPersonName() + " купил " + product.getProductName();
            shoppingCart.add(product.getProductName());
        } else {
            str = getPersonName() + " не может позволить себе " + product.getProductName();
        }
        try (Writer writer = new FileWriter("C:\\Users\\teach\\IdeaProjects\\Homework\\HomeworkProject\\src\\homeworks\\homework08\\Result.txt", true)) {
            writer.write(str + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getShoppingCart() {
        try (Writer writer = new FileWriter("C:\\Users\\teach\\IdeaProjects\\Homework\\HomeworkProject\\src\\homeworks\\homework08\\Result.txt", true)) {
            writer.write(getPersonName()+ ": " + shoppingCart + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return amountMoney == person.amountMoney && Objects.equals(personName, person.personName) && Objects.equals(shoppingCart, person.shoppingCart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personName, amountMoney, shoppingCart);
    }
}
