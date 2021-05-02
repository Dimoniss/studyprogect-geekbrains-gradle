package javaPart3.lesson1;

public class SimpleBox<T, K> {
    private T testObject;
    private K secondObject;

    public SimpleBox(T testObject, K secondObject) {
        this.testObject = testObject;
        this.secondObject = secondObject;
    }

    public K getSecondObject() {
        return secondObject;
    }

    public T getTestObject() {
        return testObject;
    }

    public void setTestObject(T testObject) {
        this.testObject = testObject;
    }
}
