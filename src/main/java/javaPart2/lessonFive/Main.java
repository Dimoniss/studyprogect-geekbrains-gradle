package javaPart2.lessonFive;

import java.util.Arrays;

public class Main {

    static final int size = 1_000_000;
    static final int halfSize = size / 2;
    static float[] array1 = new float[size];
    static float[] array2 = new float[size];
    static float[] a1 = new float[halfSize];
    static float[] a2 = new float[halfSize];
    static long aTime, bTime;

    public static void main(String[] args) throws InterruptedException {
        Arrays.fill(array1, 1);
        Arrays.fill(array2, 1);

        methodOne();

        methodTwo();

        System.out.println("arrays equals: " + Arrays.equals(array1, array2));

    }

    private synchronized static void methodOne() {
        System.out.println("first method init");

        aTime = System.currentTimeMillis();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (float)(array1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        bTime = System.currentTimeMillis();
        System.out.println("first method: " + (bTime - aTime));
        System.out.println("first method finish");
        //System.out.println(Arrays.toString(array1));
    }

    private synchronized static void methodTwo() throws InterruptedException {
        System.out.println("second method init");
        aTime = System.currentTimeMillis();

        System.arraycopy(array2, 0, a1, 0, halfSize);
        System.arraycopy(array2, halfSize, a2, 0, halfSize);


        Thread thread1 = new Thread(new MyRunnableClass(a1, true));
        Thread thread2 = new Thread(new MyRunnableClass(a2, false));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


        System.arraycopy(a1, 0, array2, 0, halfSize);
        System.arraycopy(a2, 0, array2, halfSize, halfSize);



        bTime = System.currentTimeMillis();
        System.out.println("second method: " + (bTime - aTime));
        System.out.println("second method finish");
        //System.out.println(Arrays.toString(array2));
    }

    static class MyRunnableClass implements Runnable {

        float[] arr;
        boolean firstPartOfArray;

        public MyRunnableClass(float[] arr, boolean partOfArray) {
            this.arr = arr;
            this.firstPartOfArray = partOfArray;
        }

        @Override
        public void run() {

            if (firstPartOfArray) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            } else {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (float) (arr[i] * Math.sin(0.2f + (i + halfSize) / 5) * Math.cos(0.2f + (i + halfSize) / 5) * Math.cos(0.4f + (i + halfSize) / 2));
                }
            }

        }
    }
}
