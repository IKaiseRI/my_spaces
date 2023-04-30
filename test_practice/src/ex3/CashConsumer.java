package ex3;

public class CashConsumer {

    //the variable that will keep the bank account amount inside the class
    private int cash;

    //Consuming function, this is generally a decrement
    public void consume(int amount){ cash = cash - amount; }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}
