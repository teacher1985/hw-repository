package homeworks.homework06;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество покупателей: ");
        int n = sc.nextInt();
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите имя " + (i + 1) + "-го покупателя: ");
            String namePerson = sc.next();
            System.out.print("Введите колчисетво денег " + (i + 1) + "-го покупателя: ");
            int moneyPerson = sc.nextInt();
            persons[i] = new Person(namePerson, moneyPerson);
        }
        System.out.println("Покупатели: ");
        for (int i = 0; i < n; i++) {
            System.out.println(persons[i].toString());
        }

        System.out.print("Введите количество продуктов: ");
        int m = sc.nextInt();
        Product[] products = new Product[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Введите название " + (i + 1) + "-го продукта: ");
            String nameProduct = sc.next();
            System.out.print("Введите цену " + (i + 1) + "-го продукта: ");
            int priceProduct = sc.nextInt();
            products[i] = new Product(nameProduct, priceProduct);
        }
        System.out.println("Продукты: ");
        for (int i = 0; i < m; i++) {
            System.out.println(products[i].toString());
        }

        while (true) {
            System.out.print("Кто покупатель? ");
            String namePers = sc.next();
            if (namePers.equals("END")) {
                break;
            }
            for (int i = 0; i < n; i++) {
                if (namePers.equals(persons[i].getName())) {
                    System.out.print("Какой продукт? ");
                    String nameProd = sc.next();
                    for (int j = 0; j < m; j++) {
                        if (nameProd.equals(products[j].getProductName())) {
                            if (persons[i].getMoney() > products[j].getProductPrice()) {
                                System.out.println(persons[i].getName() + " купил " + products[j].getProductName());
                                persons[i].addProducts(products[j]);
                                persons[i].setMoney(persons[i].getMoney() - products[j].getProductPrice());
                            } else {
                                System.out.println(persons[i].getName() + " не может позволить себе " + products[j].getProductName());
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(persons[i].getName() + " - ");
            persons[i].corzina();
            System.out.println();
        }
    }
}
