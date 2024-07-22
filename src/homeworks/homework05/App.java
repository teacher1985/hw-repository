package homeworks.homework05;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TV[] tv = new TV[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tv.length; i++) {
            System.out.println(i + 1 + "-й телевизор: ");
            tv[i] = new TV();
            System.out.print("Enter channel: ");
            int chan = sc.nextInt();
            tv[i].setChannel(chan);
            System.out.print("Enter volume: ");
            int vol = sc.nextInt();
            tv[i].setVolume(vol);
            System.out.print("Enter status power: ");
            boolean pwr = sc.nextBoolean();
            tv[i].setPower(pwr);
        }
        for (int i = 0; i < tv.length; i++) {

            System.out.println((i + 1) + ". " + tv[i].toString());
        }
        System.out.print("Enter maxVolume: ");
        int maxVolume = sc.nextInt();
        System.out.println("Включенные телевизоры с допустимой громкостью: ");
        for (int i = 0; i < tv.length; i++) {
            if ((tv[i].getVolume() <= maxVolume) && (tv[i].isPower() == true)) {
                System.out.println((i + 1) + ". " + tv[i].toString());
            }
        }
        int z = 0;
        TV exp = new TV();
        for (int j = 0; j < tv.length - 1; j++) {
            for (int i = j + 1; i < tv.length; i++) {
                if (tv[i].getChannel() < tv[j].getChannel()) {
                    exp = tv[j];
                    tv[j] = tv[i];
                    tv[i] = exp;
                }
            }
        }
        System.out.println("Телевизоры по порядку возрастания канала: ");
        for (int i = 0; i < tv.length; i++) {
            System.out.println((i + 1) + ". " + tv[i].toString());
        }
    }
}
