package homework.homework3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите марку телика: ");
        String n = sc.nextLine();
        System.out.print("Введите модель телика: ");
        String m = sc.nextLine();
        TV tv = new TV(n, m);
        System.out.println("Наш" + tv);
        String brand = tv.getBrand();
        String model = tv.getModel();
        System.out.println("Брэнд - " + brand + "  модель - " + model);
        tv.setBrand("samsung");
        tv.setModel("844");
        System.out.println("Лучше купить" + tv);
        String b = tv.getBrand();
        String mo = tv.getModel();
        System.out.println("Брэнд - " + b + "  модель - " + mo);
    }
}
