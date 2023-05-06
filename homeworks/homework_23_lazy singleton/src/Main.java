public class Main {
    public static void main(String[] args) {

        Moon.getInstance();
        System.out.println(Moon.getInstance().whoIsFirstManOnMe());
        Moon.getInstance().checkTemperature("someday");
    }
}