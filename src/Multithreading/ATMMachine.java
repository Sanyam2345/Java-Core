package Multithreading;

class ATM {
    synchronized public void checkBalance(String name) {
        System.out.print(name + " Checking Balance ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException _) {}
        System.out.println("balance");
    }
    synchronized public void withdraw(String name, int amount) {
        System.out.print(name + " Withdrawing " + amount);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException _) {}
        System.out.println(" withdrawed");
    }
}

class Customer extends Thread {
    String name;
    ATM atm;
    int amount;
    public Customer(String name, ATM atm, int amount) {
        this.name = name;
        this.atm = atm;
        this.amount = amount;
    }
    public void useATM () {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run() {
        useATM();
    }
}

public class ATMMachine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer customer1 = new Customer("Sanyam", atm, 1000);
        Customer customer2 = new Customer("Santa", atm, 5000);
        customer1.start();
        customer2.start();
    }
}
