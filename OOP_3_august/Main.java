package OOP_3_august;

public class Main {

    public static void main(String args[]){

        Box<Apple> appleBox1 = new Box();
        Box<Apple> appleBox2 = new Box();

        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();


        appleBox1.addFruit(new Apple(), 15);
        System.out.println("Weight of appleBox1: " + appleBox1.getWeight());

        appleBox2.addFruit(new Apple(), 20);
        System.out.println("Weight of appleBox2: " + appleBox2.getWeight());

        orangeBox1.addFruit(new Orange(), 10);
        System.out.println("Weight of orangeBox1: " + orangeBox1.getWeight());

        orangeBox2.addFruit(new Orange(), 20);
        System.out.println("Weight of orangeBox2: " + orangeBox2.getWeight());

        System.out.println("Compare appleBox1 & appleBox2 " + appleBox1.compareBoxes(appleBox2));
        System.out.println("Compare appleBox1 & orangeBox1 " + appleBox1.compareBoxes(orangeBox1));

        appleBox1.moveTo(appleBox2);
        System.out.println("New Weight of appleBox2: " + appleBox2.getWeight());

    }
}
