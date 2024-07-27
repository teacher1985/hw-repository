package homeworks.homework07;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, Month.DECEMBER, 22);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите общее количество покупателей: ");
        int n = sc.nextInt();
        String[] namePerson = new String[n];
        List<Person> peoples = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Заполните данные " + i + "-го покупателя!");
            System.out.print("Введите имя: ");
            namePerson[i] = sc.next();
            if (namePerson[i].equals("END")) {
                break;
            }
            System.out.print("Введите количество денег: ");
            int amountMoney = sc.nextInt();
            System.out.print("Введите возраст: ");
            int age = sc.nextInt();
            if (age < 18) {
                Person child = new Child(namePerson[i], age, amountMoney);
                peoples.add(child);
            } else if (age > 65) {
                Person old = new Old(namePerson[i], age, amountMoney);
                peoples.add(old);
            } else {
                System.out.print("Может ли взрослый покупать в кредит?  ");
                boolean availableCredit = sc.nextBoolean();
                Person adult = new Adult(namePerson[i], age, amountMoney, availableCredit);
                peoples.add(adult);
            }
        }
        for (Person person : peoples) {
            System.out.println(person.toString());
        }

        System.out.println("Введите общее количество продуктов: ");
        int k = sc.nextInt();
        String[] nameProduct = new String[k];
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            System.out.println("Заполните данные " + i + "-го продукта!");
            System.out.print("Введите название: ");
            nameProduct[i] = sc.next();
            if (nameProduct[i].equals("END")) {
                break;
            }
            System.out.print("Введите цену: ");
            int productPrice = sc.nextInt();
            System.out.print("Доступен ли товар детям?  ");
            boolean childAvailable = sc.nextBoolean();
            System.out.print("Введите размер скидки: ");
            int discount = sc.nextInt();
            if ((discount > 0) && (LocalDate.now().isBefore(date))) {
                Product product = new DiscountProduct(nameProduct[i], productPrice, childAvailable, discount);
                products.add(product);
            } else {
                Product product = new Product(nameProduct[i], productPrice, childAvailable);
                products.add(product);
            }
        }
        for (Product product : products) {
            System.out.println(product.toString());
        }

        while(true) {
            System.out.print("Кто покупатель? ");
            String namepers = sc.next();
            if (namepers.equals("END")) {
                break;
            }
            for (Person person : peoples) {
                if (person.getPersonName().equals(namepers)) {
                    System.out.print("Что покупает? ");
                    String nameprod = sc.next();
                    for (Product product : products) {
                        if (product.getProductName().equals(nameprod)) {
                            person.buyProduct(product);
                        }
                    }
                }
            }
        }
    }
}
