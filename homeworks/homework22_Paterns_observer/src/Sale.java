public class Sale implements MyObserver{
    /**
     * the product that its watched
     */
    private MyObservable product;

    public Sale(MyObservable obj){
        product = obj;
        obj.addObserver(this);
    }

    /**
     * Throws the notification that passes condition
     * @param p
     */
    @Override
    public void update(double p) {
        if(p < 300){
            System.out.println("Whole stock was bought with price: " + p);
            product.removeObserver(this);
        }
    }
}
