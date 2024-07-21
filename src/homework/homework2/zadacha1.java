package homework.homework2;

import java.util.Scanner;

public class zadacha1 {
    public static void main(String[] args) {
        System.out.print("Введите показания температуры в Фаренгейтах F: ");
        Scanner sc = new Scanner(System.in);
        double F = sc.nextDouble();
        double C =  (F - 32) * 5 / 9;
        System.out.print(F + " градусов по Фаренгейту равны " + C + " градусам по Цельсию.");
    }
}
