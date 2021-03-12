package sixthLesson;

public class Cat extends Animal {
    static int countCat;
    String name;
    String color;
    int age;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        countCat++;
    }

    @Override
    public String swim(int distance) {
        return "Cat can't swim";
    }

    @Override
    public String run(int distance) {
        String result;
        if (distance > 0 && distance <= 200) result = name + " ran " + distance + " meters.";
        else result = "Wrong distance!!! min - 1 max - 200";
        return result;
    }
}
