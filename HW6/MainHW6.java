package HW6;

import Lesson06.Warrior;

public class MainHW6 {

    public static void main (String[] args) {


        Cat cat = new Cat ("Murzik", 150, 0);
        Dog dog = new Dog ("Sharik", 300, 3);
        Dog dog1 = new Dog ("Bobik", 600, 11);
        Cat cat1 = new Cat ("Barsik", 300, 4);

        cat.run();
        cat.swim();
        cat1.run();
        cat1.swim();

        dog.run();
        dog.swim();

        dog1.run();
        dog1.swim();

        System.out.println("Cats total > " + Cat.countCats + " |  Dogs total > " +  Dog.countDogs + " | Animals total >" +  Animal.countAnimals);
    }


}


