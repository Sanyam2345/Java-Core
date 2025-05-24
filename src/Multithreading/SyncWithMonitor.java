package Multithreading;

class MyData {
    synchronized public void display(String msg) {
        for (int i = 0; i < msg.length(); i++) {
            System.out.print(msg.charAt(i));
        }
    }
}

class MyThread1 extends Thread {
    MyData data;
    public MyThread1(MyData data) {
        this.data = data;
    }
    public void run() {
        data.display("Hello Coders");
    }
}

class MyThread2 extends Thread {
    MyData data;
    public MyThread2(MyData data) {
        this.data = data;
    }
    public void run() {
        data.display("Welcome to Multithreading");
    }
}

public class SyncWithMonitor {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1(new MyData());
        MyThread2 thread2 = new MyThread2(new MyData());
        thread1.start();
        thread2.start();
    }
}
