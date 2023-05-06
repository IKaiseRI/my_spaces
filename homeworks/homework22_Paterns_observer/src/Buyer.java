public class Buyer implements MyObserver{
    /**
     * the product that its watched
     */
    public MyObservable product;
    public Buyer(MyObservable obj){
        product = obj;
        obj.addObserver(this);
    }

    /**
     * Throws the notification that passes condition
     * @param p
     */
    @Override
    public void update(double p) {
        if(p < 350){
            System.out.println("Buyer purchased with price: " + p);
            product.removeObserver(this);
        }
    }
}
