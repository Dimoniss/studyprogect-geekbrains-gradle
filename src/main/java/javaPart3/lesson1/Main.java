package javaPart3.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Stats<Integer> intStats = new Stats<>(1, 3, 5);
//        Stats<Double> doubleStats = new Stats<>(1.0, 3.0, 5.0);
//        Stats<Byte> byteStats = new Stats<>((byte) 1, (byte) 3, (byte) 5);
//        System.out.println(doubleStats.sameAverage(intStats) ? "Yes" : "No");
//        System.out.println(doubleStats.sameAverage(byteStats) ? "Yes" : "No");
//
//        System.out.println(ObjectWithGenericMethod.someMethod(5));
        //--------------------------------------------------------------------------

        ObjectWithGenericMethod.swapsTwoElementsOfAnArray(1, 2, 1,2,3,4,5);

        String[] array = new String[]{"0","1","2","3","4"};

        System.out.println("converted in ArrayList : ");
        ArrayList newArray1 = ObjectWithGenericMethod.convertsArrayToArrayList(array);
        System.out.println(newArray1.toString());

        System.out.println("converted in ArrayList : ");
        ArrayList newArray2 = ObjectWithGenericMethod.convertsArrayToArrayList("sdf", 1, 23, "");
        System.out.println(newArray2.toString());

        System.out.print("swapped array: ");
        System.out.println(Arrays.toString(ObjectWithGenericMethod.swapsTwoElementsOfAnArray(2, 4, array)));

        System.out.print("swapped array: ");
        System.out.println(Arrays.toString(ObjectWithGenericMethod.swapsTwoElementsOfAnArray(2, 9, array)));


        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();

        Object o = new Object();

        Box<Fruit> box1 = new Box<Fruit>();
        Box<Fruit> box2 = new Box<Fruit>();

        box1.putFruitOnTheBox(apple1);
        box1.putFruitOnTheBox(apple2);
        System.out.println("box 1 : " + box1.getWeight());
        box1.putFruitOnTheBox(orange1); // error, other type of fruit !
        box1.putFruitOnTheBox(apple5);

        box2.putFruitOnTheBox(orange1);
        box2.putFruitOnTheBox(orange2);
        box2.putFruitOnTheBox(orange3);
        box2.putFruitOnTheBox(orange4);
        box2.putFruitOnTheBox(orange5);
        box2.putFruitOnTheBox(apple3);
        System.out.println("box 2 : " + box2.getWeight());

        System.out.println("box 1 : " + box1.getWeight());

        box1.compare(box2);
        //appleBox.boxToScreen();
    }
}
