package OOPS;

class Television {
    public int channel;
    public int volume;
    public void changeChannel(int newChannel) {
        channel = newChannel;
    }
    public void changeVolume(int newVolume) {
        volume = newVolume;
    }
}

public class IntroductionToClass {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.changeChannel(3);
        tv.changeVolume(4);
        System.out.println("Channel: " + tv.channel);
        System.out.println("Volume: " + tv.volume);
    }
}
