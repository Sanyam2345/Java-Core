package Multithreading;

class MyClass {
    int value;
    boolean flag = true;
    synchronized public void set (int value) {
        while (!flag)
            try {wait();} catch (InterruptedException _) {}
        this.value = value;
        flag = false;
        notify();
    }
    synchronized public int get () {
        int x = 0;
        while (flag)
            try {wait();} catch (InterruptedException _) {}
        x = value;
        flag = true;
        notify();
        return x;
    }

}

class Producer extends Thread {
    MyClass data;
    public Producer(MyClass data) {
        this.data = data;
    }
    public void run() {
        int count = 1;
        while (true) {
            data.set (count);
            System.out.println("Producer " + count);
            count++;
        }
    }
}

class Consumer extends Thread {
    MyClass data;
    public Consumer(MyClass data) {
        this.data = data;
    }
    public void run() {
        int value;
        while (true) {
            value = data.get ();
            System.out.println("Consumer " + value);
        }
    }
}

public class InterThread {
    public static void main(String[] args) {
        MyClass data = new MyClass();
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);
        producer.start();
        consumer.start();
    }
}
