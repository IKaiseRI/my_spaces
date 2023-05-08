public class Function {

    private int a;
    public synchronized void increment(){
        a++;
    }

    public synchronized void decrement(){
        a--;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
