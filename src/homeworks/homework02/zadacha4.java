package homeworks.homework02;

import java.util.Scanner;

public class zadacha4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива\nВведите количество столбцов: ");
        int k = sc.nextInt();
        System.out.print("Введите количество строк: ");
        int m = sc.nextInt();
        System.out.print("Введите символ которым заполнится массив: ");
        char ch = sc.next().charAt(0);
        char[][] array = new char[k][m];
        System.out.println("Ваш массив: ");
        for (int i = 0;  i < k; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = ch;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
