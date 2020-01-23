public class Animal {
    private String name;
    private int weight;
    private int hunger;
    private int thirst;
    private boolean isAlive =true;

    public void breathe(){
        System.out.println("Take in oxygen!");
    }
    public void eat(){

    }
    public void drink(){

    }
    public void die(){
        isAlive = false;
    };
    public boolean isAlive(){
        return isAlive;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }
}
