package homeworks.homework04.zadacha2;

import java.util.Random;
import java.util.Scanner;

public class Arrows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество символов в строке состоящей из '<', '>' и '-': ");
        int n = sc.nextInt();
        Random rand = new Random();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int x = rand.nextInt(3);
            if (x == 0) {
                str.append('-');
            } else if (x == 1) {
                str.append('<');
            } else if (x == 2) {
                str.append('>');
            }
        }
        int q = 0;
        int r = -1;
        System.out.print("Ваша строка: ");
        System.out.println(str);
        while (r < str.length()) {
            int c = str.indexOf(">>-->", r + 1);
            if (c >= 0) {
                r = c;
                q++;
            } else r = str.length();
        }
        int z = -1;
        while (z < str.length()) {
            int t = str.indexOf("<--<<", z + 1);
            if (t >= 0) {
                z = t;
                q++;
            } else z = str.length();
        }
        System.out.println("Стрел '<--<<' или '>>-->' нашлось: " + q);
    }
}
