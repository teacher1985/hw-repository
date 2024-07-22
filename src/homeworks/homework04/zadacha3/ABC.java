package homeworks.homework04.zadacha3;

import java.util.Arrays;
import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите неотсортированную строку: ");
        String s = sc.nextLine();
        int c = s.indexOf(" ", 0);
        String s1 = s.substring(0, c);
        String s2 = s.substring(c + 1, s.length());
        char[] sorts1 = s1.toCharArray();
        char[] sorts2 = s2.toCharArray();
        Arrays.sort(sorts1);
        Arrays.sort(sorts2);
        String str1 = new String(sorts1);
        String str2 = new String(sorts2);
        StringBuilder str = new StringBuilder();
        str.append(str1);
        str.append(" ");
        str.append(str2);
        System.out.println("Ваша отсортированная строка: " + str);
    }
}
