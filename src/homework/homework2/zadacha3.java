package homework.homework2;

import java.util.Scanner;

public class zadacha3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите вашу строку: ");
        String str = sc.nextLine();
        System.out.print("Сколько раз вы хотите ее объединить: ");
        int i = sc.nextInt();
        StringBuilder stri = new StringBuilder(str);
        for (int j = 0; j < i - 1; j++) {
            stri = stri.append(str);
        }
        System.out.println("Ваша строка " + str + " объединенная " + i + " раз: " + stri);
    }
}
