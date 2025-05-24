package Static_AND_Final;

class CoffeeMachine {
    private float waterqty;
    private float coffeqty;
    private float milkqty;
    private float sugarqty;

    private static CoffeeMachine my = null;

    private CoffeeMachine() {
        coffeqty = 1;
        waterqty = 1;
        milkqty = 1;
        sugarqty = 1;
    }

    public void fillWater (float qty) {
        waterqty = qty;
    }
    public void fillSugar (float qty) {
        sugarqty = qty;
    }
    public float fillCoffee () {
        return 0.15f;
    }

    static CoffeeMachine getInstance() {
        if (my == null) {
            my = new CoffeeMachine();
        }
        return my;
    }
}

public class SingletonClass {
    public static void main(String[] args) {
        CoffeeMachine m1 = CoffeeMachine.getInstance();
        CoffeeMachine m2 = CoffeeMachine.getInstance();
        CoffeeMachine m3 = CoffeeMachine.getInstance();
        System.out.println("m1: " + m1);
        System.out.println("m2: " + m2);
        System.out.println("m3: " + m3);
        if (m1 == m2 && m1 == m3) {
            System.out.println("Same");
        }
    }
}
