package javaPart1.sixthLesson;

public abstract class Animal {

    public String swim(int distance) {
        String result;
        if (distance > 0) result = "Animal swam " + distance + " meters.";
        else result = "Wrong distance!!! min - 1 ";
        return result;
    }
    public String run(int distance) {
        String result;
        if (distance > 0) result = "Animal ran " + distance + " meters.";
        else result = "Wrong distance!!! min - 1 ";
        return result;
    }
}
