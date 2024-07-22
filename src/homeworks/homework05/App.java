package homeworks.homework05;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        /*
        На вход программы в классе App, методе main подается информация о
        телевизорах в количестве 10 телевизоров. Считать данные в массив объектов
        (можно выполнить считывание данных в цикле).
         */

        TV[] tv = new TV[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tv.length; i++) {
            System.out.println(i + 1 + "-й телевизор: ");
            System.out.print("Enter channel: ");
            int chan = sc.nextInt();
            System.out.print("Enter volume: ");
            int vol = sc.nextInt();
            System.out.print("Enter status power: ");
            boolean pwr = sc.nextBoolean();
            tv[i] = new TV(chan, vol, pwr);
        }
        System.out.println("Ваши телевизоры: ");
        for (int i = 0; i < tv.length; i++) {
            System.out.println((i + 1) + ". " + tv[i].toString());
        }

        // Считать с клавиатуры число допустимого значения громкости звука maxVolume (рекомендуется ввести с клавиатуры целое число от 50 до 70).

        System.out.print("Enter maxVolume: ");
        int maxVolume = sc.nextInt();

        // Далее необходимо в цикле вывести только включенные телевизоры, у которых звук является допустимым (меньшим или равным maxVolume).

        System.out.println("Включенные телевизоры с допустимой громкостью: ");
        for (int i = 0; i < tv.length; i++) {
            if ((tv[i].getVolume() <= maxVolume) && (tv[i].isPower() == true)) {
                System.out.println((i + 1) + ". " + tv[i].toString());
            }
        }

        // Добавить в массив Телевизоров сортировку по номеру канала (по возрастанию).

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
