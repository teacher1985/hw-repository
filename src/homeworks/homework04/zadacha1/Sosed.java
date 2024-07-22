package homeworks.homework04.zadacha1;

import java.util.Scanner;

public class Sosed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите букву английской раскладки: ");
        char s = sc.next().charAt(0);
        System.out.println("Предыдущей буквой на раскладке qwerty будет: ");
        Find r = new Find(s);
    }
}
