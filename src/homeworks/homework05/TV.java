package homeworks.homework05;

import java.util.Objects;

public class TV {
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

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", power=" + power +
                '}';
    }
}
