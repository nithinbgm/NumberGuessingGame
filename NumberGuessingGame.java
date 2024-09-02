import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        int numberOfTries = 0;
        int userGuess = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while(userGuess != numberToGuess){
            System.out.println("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess > numberToGuess){
                System.out.println("Too high! Try again.");
            } else if (userGuess < numberToGuess){
                System.out.println("Too low! Try again.");
            }else {
                System.out.println("Correct! you guessed the number in " + numberOfTries +" Attempts.");
            }
        }
    }
}
