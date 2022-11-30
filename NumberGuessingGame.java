

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        while(true) {

            System.out.println("enter your guess (1-100):");
            Scanner scanner = new Scanner(System.in);
            int playerGuess = scanner.nextInt();
            if (playerGuess == randomNumber) {
                System.out.println("Correct you win");
                break;
            }
             else if (randomNumber > playerGuess) {
                System.out.println("the number is higher : guess again");
            }
             else {
                System.out.println("the number is lower : guess again");
            }
        }
    }
}
