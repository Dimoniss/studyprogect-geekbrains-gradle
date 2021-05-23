package javaPart3.lesson4;

public class Main {

    public char currentLetter = 'C';

    public static void main(String[] args) {
        Main printMain = new Main();
        int count = 5;

        new Thread(() -> {
            printMain.printA(count);
        }).start();

        new Thread(() -> {
            printMain.printB(count);
        }).start();

        new Thread(() -> {
            printMain.printC(count);
        }).start();

    }

    public synchronized void printA(int count) {
        for (int i = 0; i < count; i++) {
            while (currentLetter != 'C') {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("A");
            currentLetter = 'A';
            notifyAll();
        }
    }

    public synchronized void printB(int count) {
        for (int i = 0; i < count; i++) {
            while (currentLetter != 'A') {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("B");
            currentLetter = 'B';
            notifyAll();
        }
    }

    public synchronized void printC(int count) {
        for (int i = 0; i < count; i++) {
            while (currentLetter != 'B') {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("C");
            currentLetter = 'C';
            notifyAll();
        }
    }


}
