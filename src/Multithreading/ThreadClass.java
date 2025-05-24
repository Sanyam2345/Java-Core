package Multithreading;
class MyThread extends Thread {
    public void run() {
        int i = 0;
        while (i <= 5) {
            System.out.print(" Hello ");
            i++;
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ThreadClass {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        t1.start();
//        t1.sleep(1000);
        int j = 0;
        while (j <= 5) {
            System.out.println(" World");
            j++;
        }
    }
}
