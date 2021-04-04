package javaPart1;

import java.util.Random;
import java.util.Scanner;

public class ThirdLesson {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber;
        int attempt = 3;
        boolean newGame = true;

        while (newGame) {
            System.out.println("Want to start a new game ? y-1 / n-2");
            int newGameRis = scanner.nextInt();

            switch (newGameRis) {
                case 1:
                    randomNumber = new Random().nextInt(10);
                    attempt = 3;
                    while (attempt > 0) {
                        System.out.println("A number from 0 to 9 is guessed, you have " + attempt + " attempts to guess it !");
                        int numb = scanner.nextInt();

                        if (numb == randomNumber) {
                            System.out.println("You win !!! number " + numb + " is correct !!!");
                            attempt = 0;
                        }
                        else if (numb > randomNumber) {
                            System.out.println("You guessed wrong, the hidden number is less than " + numb);
                            attempt--;
                        }
                        else if (numb < randomNumber) {
                            System.out.println("You guessed wrong, the hidden number is greater then " + numb);
                            attempt--;
                        }
                    }
                    break;
                case 0 :
                    newGame = false;
                    break;
            }
        }
        scanner.close();
    }
}
