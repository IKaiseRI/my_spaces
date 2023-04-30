package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Will need a scanner to insert the bank account
        Scanner scanner = new Scanner(System.in);
        //This will keep the amount of the bank
        int bankAccount;

        bankAccount = scanner.nextInt();
        //Cash consumer check the class
        CashConsumer cashConsumer = new CashConsumer();
        cashConsumer.setCash(bankAccount);

        //Creating threads giving them the class object and the number of the thread
        MyThread thread1 = new MyThread(cashConsumer,1);
        MyThread thread2 = new MyThread(cashConsumer,2);
        MyThread thread3 = new MyThread(cashConsumer,3);
        MyThread thread4 = new MyThread(cashConsumer,4);


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        //Print the final results
        while(true){
            if(!thread1.isAlive() && !thread2.isAlive() && !thread3.isAlive() && !thread4.isAlive()){
                System.out.println("Final amount of thread 1: " + thread1.getFinalConsumedAmount());
                System.out.println("Final amount of thread 2: " + thread2.getFinalConsumedAmount());
                System.out.println("Final amount of thread 3: " + thread3.getFinalConsumedAmount());
                System.out.println("Final amount of thread 4: " + thread4.getFinalConsumedAmount());
                System.out.println("To be sure everything is ok, here is the total amount " +
                        (thread1.getFinalConsumedAmount() +
                        thread2.getFinalConsumedAmount() +
                        thread3.getFinalConsumedAmount() +
                        thread4.getFinalConsumedAmount()));
                break;
            }
        }

    }
}
