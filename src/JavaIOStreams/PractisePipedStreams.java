package JavaIOStreams;
import java.io.*;

class Producer extends Thread {
    OutputStream os;
    Producer(OutputStream os) {
        this.os = os;
    }
    public void run() {
        int count = 1;
        while (true) {
            try {
                os.write(count);
                os.flush();
                System.out.println("Producer " + count + " written");
                System.out.flush();
                Thread.sleep(10);
                count++;
            } catch (Exception _) {}
        }
    }
}

class Consumer extends Thread {
    InputStream is;
    Consumer(InputStream is) {
        this.is = is;
    }
    public void run() {
        int x;
        while (true) {
            try {
                x=is.read();
                System.out.println("Consumer " + x + " read");
                System.out.flush();
                Thread.sleep(10);
            }catch (Exception _) {}
        }
    }
}

public class PractisePipedStreams {
    public static void main(String[] args) throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pos.connect(pis);
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);
        c.start();
        p.start();
    }
}
