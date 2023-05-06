public class Moon {
    private static Moon firstInstance = null;

    private Moon(){}

    public static Moon getInstance(){
        if (firstInstance == null){
            firstInstance = new Moon();
            System.out.println("Moon was created");
        }
        return firstInstance;
    }

    public String whoIsFirstManOnMe(){
        return "Neil Armstrong";
    }

    public void checkTemperature(String string){
        if(string.equalsIgnoreCase("day")){
            System.out.println("It's more than 100 Celsius, go in the shadow");
        } else if (string.equalsIgnoreCase("night")) {
            System.out.println("Ig u're already frozen because it's -232");
        }
        else System.out.println("A small step for a man a giant leap for mankind");
    }
}
