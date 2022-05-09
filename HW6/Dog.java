package HW6;

public class Dog extends Animal{
    public static int countDogs = 0;

    public int maxRunDistance = 500;
    public int maxSwimDistance = 10;

    public Dog(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
        countDogs++;

    }


    public void run() {
        if (this.runDistance > maxRunDistance) {
           System.out.println(name + " tired and can't run more than 200 meters");
        } else {
            System.out.println(name + " has run " + runDistance + " meters");
        }
    }

    public void swim() {
        if (swimDistance > maxSwimDistance) {
            System.out.println(name + " got tired of swimming and got out on the shore");
        } else {
            System.out.println(name + " has swum " + swimDistance + " meters");
        }

    }
}
