public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("The result of first condition is: " + firstCondition());
        System.out.println("Below is the result of second condition");
        secondCondition();
    }

    /**
     * Created a method for first condition that uses a class variable from Function class
     * according to the condition the value will be incremented 5000 times and decremented 1000 times
     * @return
     */
    public static int firstCondition(){
        Function value = new Function();
        value.setA(0);
        for (int i = 0; i < 5000; i++){
            value.increment();
        }
        for (int i = 0; i < 1000; i++){
            value.decrement();
        }
        return value.getA();
    }

    /**
     * Created a method for second condition where I create a class variable and just print the result
     * Check the class for explanation
     * @throws InterruptedException
     */
    public static void secondCondition() throws InterruptedException {
        ThreadClass t = new ThreadClass();
        t.output();
    }
}