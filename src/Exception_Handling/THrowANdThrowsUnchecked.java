package Exception_Handling;

class MinimumBalance extends Exception {
    public String toString () {
        return "Minimum balance";
    }
}

public class THrowANdThrowsUnchecked {
    public static void main(String[] args) throws MinimumBalance {
        throw new MinimumBalance();
    }
}
