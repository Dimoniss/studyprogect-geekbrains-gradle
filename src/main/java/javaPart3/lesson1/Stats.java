package javaPart3.lesson1;

public class Stats<T extends Number> {
    private T[] nums;

    public Stats(T... nums) {
        this.nums = nums;
    }

    public void testMethod(T... array) {

    }

    public double average(){
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i].doubleValue();
        }
        return sum/ nums.length;
    }

    public boolean sameAverage(Stats<?> another) {
        return Math.abs(this.average() - another.average()) < 0.0001;
    }
}
