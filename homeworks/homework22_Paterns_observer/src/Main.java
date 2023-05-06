public class Main {
    public static void main(String[] args) {

        /**
         * Observer is a behavioral design pattern that lets you define
         * a subscription mechanism to notify multiple objects about any
         * events that happen to the object they’re observing.
         */


        /**
         * We create a new product with initial price
         */
        Product product = new Product(400);

        /**
         * We create a sale class that will notify us about the event that will happen only if the condition is true
         */
        Sale sale = new Sale(product);

        /**
         * We create a buyer class that will notify us about the event that will happen only if the condition is true
         */
        Buyer buyer = new Buyer(product);


        product.changePrice(320);
        product.changePrice(280);


    }
}