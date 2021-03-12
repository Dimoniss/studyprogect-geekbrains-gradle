package sixthLesson;

public class Dog extends Animal {
    static int countDog;
    String name;
    String color;
    int age;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        countDog++;
    }

    @Override
    public String swim(int distance) {
        String result;
        if (distance > 0 && distance <= 10) result = name + " swam " + distance + " meters.";
        else result = "Wrong distance!!! min - 1 max - 10";
        return result;
    }

    @Override
    public String run(int distance) {
        String result;
        if (distance > 0 && distance <= 500) result = name + " ran " + distance + " meters.";
        else result = "Wrong distance!!! min - 1 max - 500";
        return result;
    }
}
