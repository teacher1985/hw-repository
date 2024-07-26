package homeworks.homework07;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<Product>();
        List<DiscountProduct> discountproducts = new ArrayList<DiscountProduct>();
        System.out.print("Введите срок действия скидки в формате ДД.ММ.ГГГГ: ");
        String expirationDate = sc.nextLine();
        String[] words = expirationDate.split("\\.");
        int[] dt = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            dt[i] = Integer.parseInt(words[i]);
        }
        LocalDate date = LocalDate.of(dt[2], dt[1], dt[0]);
        LocalDate today = LocalDate.now();
        while (true) {
            System.out.print("Enter product name: ");
            String name = sc.next();
            if (name.equals("END")) {
                break;
            } else {
                System.out.print("Enter product price: ");
                int price = sc.nextInt();
                System.out.print("Enter product discount: ");
                int discount = sc.nextInt();
                if ((discount > 0) && (today.isBefore(date))) {
                    int cena = price - price * discount / 100;
                    DiscountProduct p = new DiscountProduct(name, cena, discount, date);
                    discountproducts.add(p);
                } else {
                    Product p = new Product(name, price);
                    products.add(p);
                }
            }
        }

        System.out.println("Обычные продукты:");
        for (Product p : products) {
            System.out.print(p.getProductName());
        }
        System.out.println();
        System.out.println("Продукты со скидкой:");
        for (DiscountProduct p : discountproducts) {
            System.out.print(p.getProductName());
        }
    }
}
