public class ThreadClass {

    /**
     * The method that accepts the parameter and returns it squared
     * @param i
     * @return
     */
    public double powFunction(int i){
        return Math.pow(i,2);
    }

    /**
     * First thread that prints the squares of values in a cycle
     */
    Thread thread1 = new Thread(() -> {
        for(int i = 1; i <= 10; i++){
            System.out.println("Thread 1 is working: " +powFunction(i));
        }
    }
    );
    /**
     * Second thread does same thing
     */
    Thread thread2 = new Thread(() -> {
        for(int i = 1; i <= 10; i++){
            System.out.println("Thread 2 is working: " +powFunction(i));
        }
    }
    );

    /**
     * The method that starts threads but thread 2 will start only after thread 1 is finished
     */
    public void output() throws InterruptedException {
        thread1.start();
        thread1.join();
        thread2.start();
    }

}
