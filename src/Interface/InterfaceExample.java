package Interface;

class Phone {
    void call() {
        System.out.println("Calling");
    }
    void sms() {
        System.out.println("Sending SMS");
    }
}

interface Camera {
    void click();
    void record();
}

interface MusicPlayer {
    void play();
    void pause();
    void stop();
}

class Smartphone extends Phone implements Camera, MusicPlayer {
    @Override
    public void click() {
        System.out.println("Clicking Pictures");
    }

    @Override
    public void record() {
        System.out.println("Recording Video");
    }

    @Override
    public void play() {
        System.out.println("Playing Music");
    }

    @Override
    public void pause() {
        System.out.println("Music paused");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Music");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Phone p = smartphone;
        p.call();
        p.sms();
        Camera c = smartphone;
        c.record();
        c.click();
        MusicPlayer mp = smartphone;
        mp.play();
        mp.pause();
        mp.stop();
    }
}
