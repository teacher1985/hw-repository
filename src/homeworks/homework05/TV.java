package homeworks.homework05;

import java.util.Objects;

public class TV {

    /*
    1. В класс Телевизор добавить поля (если не были добавлены ранее):
    1) Номер включенного канала — integer;
    2) Громкость звука — integer (от 0 до 100);
    3) Признак включенного телевизора — boolean.
    */

    private int channel;
    private int volume;
    private boolean power;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    /*
    Добавить в класс Телевизор методы equals и hashcode.
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return channel == tv.channel && volume == tv.volume && power == tv.power;
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, volume, power);
    }

    /*
    Переопределить метод toString класса Телевизор таким образом, чтобы
    распечатывались: название класса, все поля класса и их значения.
    */

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", power=" + power +
                '}';
    }
}
