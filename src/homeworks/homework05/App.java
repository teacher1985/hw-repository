package homeworks.homework05;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class App {
    public static void main(String[] args) {
        Program program1 = new Program("News", 10, 3);
        Program program2 = new Program();
        program2.setName("Serial");
        program2.setRating(6);
        program2.setViewer(9);

        Channel channel1 = new Channel("First", 1, program1);
        Channel channel2 = new Channel();
        channel2.setName("Relax");
        channel2.setNumber(2);
        channel2.setProgram(program2);

        TV tv1 = new TV(channel1, 13, true);
        tv1.addChannels(channel1);
        tv1.addChannels(channel2);
        TV tv2 = new TV();
        tv2.setChannel(channel2);
        tv2.setVolume(7);
        tv2.setPower(true);
        tv2.addChannels(channel1);
        tv2.addChannels(channel2);

        System.out.println(tv1.toString());
        tv1.upChannel();
        System.out.println(tv1.toString());
        tv1.downChannel();
        System.out.println(tv1.toString());

    }
}
