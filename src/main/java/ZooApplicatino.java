public class ZooApplicatino {
    public static void main(String[] args) {
        Goldfish bubbles = new Goldfish();
        System.out.println("This fish is alive? " + bubbles.isAlive());
        bubbles.breathe();
        System.out.println("Bubbles did not get fed this week...");
        bubbles.die();
        System.out.println("This fish is alive? " + bubbles.isAlive());

        Robin red = new Robin();
        System.out.println("This  robin is alive? " + red.isAlive());
        red.breathe();
        System.out.println("Red did not get fed this week...");
        red.die();
        System.out.println("This robin is alive? " + red.isAlive());

        Squirrel rocky = new Squirrel();
        System.out.println("This squirrel is alive? " +rocky.isAlive());
        rocky.breathe();
        System.out.println("Rocky did not get fed this week...");
        rocky.die();
        System.out.println("This squirrel is alive? " + rocky.isAlive());
    }
}
