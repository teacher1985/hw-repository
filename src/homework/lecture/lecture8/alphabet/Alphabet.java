package homework.lecture.lecture8.alphabet;

/*
Проверяем содержит ли введенная строка все буквы анлийского алфавита
 */

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str0 = sc.nextLine();
        StringBuilder str1 = new StringBuilder(str0);
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                if ((str1.charAt(i) == str1.charAt(j)) && (i != j)) {
                    str1.deleteCharAt(j);
                }
            }
        }
        System.out.println(str1.length() >= 26);
    }
}