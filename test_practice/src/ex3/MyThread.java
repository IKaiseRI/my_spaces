package ex3;

import java.util.Random;

public class MyThread extends Thread{
    Random rand = new Random();
    volatile CashConsumer cashConsumer;
    int amount;

    int threadNumber;

    int finalConsumedAmount = 0;

    //The constructor of my thread class
    public MyThread(CashConsumer cashConsumer, int thread) {
        this.cashConsumer = cashConsumer;
        this.threadNumber = thread;
    }

    //Override run
    @Override
    public void run() {
        //The amount of the thread is randomised
        amount = rand.nextInt(100 - 1) + 1;
        //Here you can see what are the initial withdrawn amounts per thread
        System.out.println("Thread " + threadNumber + " cash withdrawn amount is: " + amount);
        //Threads will be running till the bank account amount will be positive
        while(cashConsumer.getCash() > 0){
            //if the amount is too big to be withdrawn it will decrease and try another time
            if(cashConsumer.getCash() - amount < 0){
                amount--;
                System.out.println("Thread " + threadNumber + " cash withdrawn amount is now changed to: " + amount);
                continue;
            }
            cashConsumer.consume(amount);
            System.out.println("Thread " + threadNumber + " consumed | remaining: " + cashConsumer.getCash());
            finalConsumedAmount += amount;
        }
    }
    public int getFinalConsumedAmount() {
        return finalConsumedAmount;
    }
}
