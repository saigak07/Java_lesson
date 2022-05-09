package HW6;

public class Cat extends Animal {
    public static int countCats = 0;

    public int maxRunDistance = 200;

    public Cat(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
        countCats++;
    }


    public void run() {
        if (this.runDistance > maxRunDistance) {
            System.out.println(name + " tired and can't run more than 200 meters");
        } else {
            System.out.println(name + " has run " + runDistance + " meters");
        }
    }

    public void swim() {
        if (this.swimDistance != 0) {
            System.out.println(name + " scared of the water and ran away");
        }
    }

}

