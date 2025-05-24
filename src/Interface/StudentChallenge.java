package Interface;

interface Member {
    void callBack();
}

class Customer implements Member {
    String name;
    public Customer(String name) {
        this.name = name;
    }
    public void callBack() {
        System.out.println("Ok, I will visit " + name);
    }
}

class Store {
    Member[] members = new Member[10];
    int count = 0;

    void register (Member member) {
        members[count++] = member;
    }

    void inviteSale () {
        for (int i = 0; i < count; i++) {
            members[i].callBack();
        }
    }
}

public class StudentChallenge {
    public static void main(String[] args) {
        Store store = new Store();
        Customer customer = new Customer("John");
        Customer customer2 = new Customer("Jane");
        store.register(customer);
        store.register(customer2);
        store.inviteSale();
    }
}
