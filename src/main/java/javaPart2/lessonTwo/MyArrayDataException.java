package javaPart2.lessonTwo;

public class MyArrayDataException extends Throwable {
    int incorrectElementX;
    int incorrectElementY;

    public MyArrayDataException(int x, int y) {
        this.incorrectElementX = x;
        this.incorrectElementY = y;
    }

    public String toString() {
        return "Error, incorrect matrix element";
    }
}
