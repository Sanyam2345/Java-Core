package Multithreading;

class ThreadTest implements Runnable {
    public void run() {
        for (int i = 0; i < 99; i++) {
            System.out.println("Hello ");
        }
    }
}

public class UsingRunnable {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        Thread t2 = new Thread(t1);
        t2.start();
        for (int i = 0; i < 99; i++) {
            System.out.println("World ");
        }
    }
}
