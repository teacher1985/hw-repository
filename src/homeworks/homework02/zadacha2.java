package homeworks.homework02;

import java.util.Scanner;

public class zadacha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Сумма: " + (num1 + num2));
        System.out.println("Разница: " + Math.abs(num1 - num2));
        System.out.println("Произведение: " + (num1*num2));
        System.out.println("Среднее значение: " + (num1+num2)/2);
        System.out.println("Максимальное значение: " + Math.max(num1, num2));
        System.out.println("Минимальное значение: " + Math.min(num1, num2));
    }
}
