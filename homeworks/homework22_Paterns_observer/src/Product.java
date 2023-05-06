import java.util.ArrayList;
import java.util.List;

public class Product implements MyObservable{
    /**
     * class product that implements MyObservable interface represents the product
     * upon whose price updates will be observer;
     */

    /**
     * the list opf observers
     */
    private List<MyObserver> observers;
    private double price;

    /**
     * Constructor that will accept the price and create a list of observers
     * @param p
     */
    public Product(double p) {
        observers = new ArrayList<>();
        price = p;
    }

    /**
     * method that updates the price and will server as a trigger for updates
     * @param p
     */
    public void changePrice(double p){
        price = p;
        notifyUpdates();
    }

    /**
     * Implemented method that adds observer
     * @param o
     */
    @Override
    public void addObserver(MyObserver o) {
        observers.add(o);
    }
    /**
     * Implemented method that removes observer
     * @param o
     */
    @Override
    public void removeObserver(MyObserver o) {
        observers.remove(o);
    }

    /**
     * Implemented method that notifies the observers according to the price change
     */
    @Override
    public void notifyUpdates() {
        for (Object o : observers.toArray()){
            ((MyObserver)o).update(price);
        }
    }
}
