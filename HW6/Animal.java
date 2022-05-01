package HW6;

public class Animal {
    public static int countAnimals = 0;

    protected  String name;
    protected  int runDistance;
    protected int swimDistance;


    public Animal(String name, int runDistance, int swimDistance) {
        countAnimals++;
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }
}
