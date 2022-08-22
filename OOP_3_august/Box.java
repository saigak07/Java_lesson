package OOP_3_august;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public  class Box <T extends Fruit> {
    //private T obj;
    private ArrayList<T> box = new ArrayList<>();

    public void addFruit(T fruit, int amount){
        for(int i = 0;i < amount; i++){
            box.add(fruit);
        }
    }

    public float getWeight(){
        float weight = 0.0f;
        for(T o : box){
            weight = weight + o.getWeight();
        }
        return weight;
    }

    public boolean compareBoxes(Box anotherBox){
        if(getWeight() == anotherBox.getWeight()) {
            return true;
        }
        else return false;
    }

    public void moveTo(Box <T> anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }

}
