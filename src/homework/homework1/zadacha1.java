package homework.homework1;

import java.util.Random;

public class zadacha1 {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            long s = nextInt();
            System.out.print(s + " " + " " + " ");
        }
        long s = nextInt();
        System.out.println(s);
    }
    public static int nextInt() {
        Random x = new Random();
        int f = x.nextInt();
        return f;
    }
}
