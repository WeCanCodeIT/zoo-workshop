public class Robin extends Bird implements Flying{




    @Override
    public void breathe(){
        System.out.println("I breathe with lungs and air!");
    }
    @Override
    public void makeNest(){
        System.out.println("I make nests with straw.");
    }

    @Override
    public void fly() {
        System.out.println("I flap my wings to fly!");
    }
}
