package javaPart3.lesson1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;
    private float weight;

    public Box() {
        this.fruits = new ArrayList<>();
        this.weight = 0;
    }

    public void putFruitOnTheBox(T fruit){
        if (fruits.size() != 0) {
            T firstElement = fruits.get(0);
            if (fruit.getClass() == firstElement.getClass()) {
                fruits.add(fruit);
                this.weight = this.weight + fruit.getWeight();
                System.out.println(fruit.getClass().getSimpleName() + " in box");
            } else {
                System.out.println("error, other type of fruit !");
            }
        } else {
            fruits.add(fruit);
            this.weight = this.weight + fruit.getWeight();
            System.out.println(fruit.getClass().getSimpleName() + " in box");
        }

    }

    public void compare(Box<T> anotherBox) {
        if (this.fruits.size() != 0 && anotherBox.fruits.size() != 0) {
            System.out.println(this.fruits.get(0).getClass().getSimpleName() + " = " + anotherBox.fruits.get(0).getClass().getSimpleName());
            System.out.println(this.fruits.size() + " pc. = " + anotherBox.fruits.size() + " pc.");
            System.out.println(this.weight + "kg. = " + anotherBox.getWeight() + " kg.");
        } else {
            System.out.println("one of the boxes is empty !!!");
        }

    }

    public float getWeight() {
        return weight;
    }

    public void boxToScreen(){
        for (T fruit:this.fruits) {
            System.out.println(fruit.getClass().getSimpleName());
        }
    }

}
