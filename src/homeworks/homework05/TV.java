package homeworks.homework05;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TV {
    private Channel channel;
    private int volume;
    private boolean power;
    private List<Channel> channels;

    public TV() {
        this.channels = new ArrayList<>();
    }

    public TV(Channel chan, int vlm, boolean pwr) {
        this.channel = chan;
        this.volume = vlm;
        this.power = pwr;
        this.channels = new ArrayList<>();
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void upChannel() {
        int num = channel.getNumber() + 1;
        for (Channel chan : channels) {
            if (num == chan.getNumber()) this.channel = chan;
        }
    }

    public void downChannel() {
        int num = channel.getNumber() - 1;
        for (Channel chan : channels) {
            if (num == chan.getNumber()) this.channel = chan;
        }
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

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    public void addChannels(Channel ch) {
        channels.add(ch);
    }

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return volume == tv.volume && power == tv.power && Objects.equals(channel, tv.channel) && Objects.equals(channels, tv.channels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, volume, power, channels);
    }
}
