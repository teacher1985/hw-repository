package homeworks.homework01;

import java.util.Random;

public class zadacha2 {
    public static void main(String[] args) {
        Random r = new Random();
        int Vasya = r.nextInt(3);
        int Petya = r.nextInt(3);
        if (Vasya == Petya) {
            if (Petya == 2) {
                System.out.println("Оба выбросили Бумага");
            } else if (Petya == 1) {
                System.out.println("Оба выбросили Ножницы");
            } else System.out.println("Оба выбросили Камень");
            System.out.println("Ничья");
        } else {
            if (Petya == 0) {
                System.out.println("Петя выбросил Камень");
                if (Vasya == 1) {
                    System.out.println("Вася выбросил Ножницы");
                    System.out.println("Выиграл Петя");
                } else if (Vasya == 2) {
                    System.out.println("Вася выбросил Бумага");
                    System.out.println("Выиграл Вася");
                }
            } else if (Petya == 1) {
                System.out.println("Петя выбросил Ножницы");
                if (Vasya == 0) {
                    System.out.println("Вася выбросил Камень");
                    System.out.println("Выиграл Вася");
                } else if (Vasya == 2) {
                    System.out.println("Вася выбросил Бумага");
                    System.out.println("Выиграл Петя");
                }
            } else if (Petya == 2) {
                System.out.println("Петя выбросил Бумага");
                if (Vasya == 0) {
                    System.out.println("Вася выбросил Камень");
                    System.out.println("Выиграл Петя");
                } else if (Vasya == 1) {
                    System.out.println("Вася выбросил Ножницы");
                    System.out.println("Выиграл Вася");
                }
            }
        }
    }
}
