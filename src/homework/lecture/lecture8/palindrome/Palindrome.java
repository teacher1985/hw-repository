package homework.lecture.lecture8.palindrome;

/*
Написать программу которая проверяет является ли введенная строка палиндромом.
*/

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s0 = sc.nextLine();
        s0 = s0.replaceAll("\\s", "").intern();
        StringBuilder s1 = new StringBuilder(s0);
        System.out.println(s1.reverse().toString().intern().equalsIgnoreCase(s0));
    }
}
