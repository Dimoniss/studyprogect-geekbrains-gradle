package javaPart1.fourthLesson;

import java.util.Random;
import java.util.Scanner;

public class TikTacToe {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (checkWin(DOT_X)) {
                System.out.println("YOU WIN!!!");
                break;
            }
            if (isMapFull()) {
                System.out.println("DRAW");
                break;
            }

            aiTurn();
            printMap();

            if (checkWin(DOT_O)) {
                System.out.println("YOU LOSS!!!");
                break;
            }
            if (isMapFull()) {
                System.out.println("DRAW");
                break;
            }
        }

        System.out.println("GAME OVER");
    }

    public static boolean isMapFull(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean checkWin(char symb) {
        int leftDiagonalCount = 0;
        int rightDiagonalCount = 0;

        for (int i = 0; i < SIZE; i++) {
            int horizontalCount = 0;
            int verticalCount = 0;

            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb){
                    if (++horizontalCount == DOTS_TO_WIN) return true;
                } else {
                    horizontalCount = 0;
                }

                if (map[j][i] == symb) {
                    if (++verticalCount == DOTS_TO_WIN)
                        return true;
                } else {
                    verticalCount = 0;
                }
            }

            if (map[i][i] == symb){
                leftDiagonalCount++;
            } else {
                leftDiagonalCount = 0;
            }
            if (map[i][SIZE-2] == symb){
                rightDiagonalCount++;
            } else {
                rightDiagonalCount = 0;
            }
            if (leftDiagonalCount == SIZE || rightDiagonalCount == SIZE) return true;

        }

        return false;
    }

    public static void aiTurn() {
        int x, y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("The computer was like a point " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;

        do {
            System.out.println("Enter coordinates in the format X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));


        map[y][x] = DOT_X;

    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
