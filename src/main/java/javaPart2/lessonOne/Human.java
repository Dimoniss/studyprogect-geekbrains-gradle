package javaPart2.lessonOne;

public class Human implements Jumping, Runable {
    int maxJumpHeight;
    int maxRunLength;

    public Human(int maxJumpHeight, int maxRunLength) {
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public boolean jump(int height) {
        boolean result;
        if (this.maxJumpHeight >= height) {
            System.out.println("The human successfully jumped an obstacle in height "+ height);
            result = true;
        } else {
            System.out.println("The human could not jump over an obstacle with a height of " + height + " , his maximum height " + this.maxJumpHeight);
            result = false;
        }
        return result;
    }

    @Override
    public boolean run(int isLong) {
        boolean result;
        if (this.maxRunLength >= isLong) {
            System.out.println("The human ran successfully "+ isLong);
            result = true;
        } else {
            System.out.println("The human could not run " + isLong + " , his maximum " + this.maxRunLength);
            result = false;
        }
        return result;
    }
}
