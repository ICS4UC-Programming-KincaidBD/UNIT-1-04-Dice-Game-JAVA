// random module
import java.util.Random;
// user input module
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        final int NUM = new Random().nextInt(6) + 1; // Generate a random number between 1 and 6
        Scanner input = new Scanner(System.in); // initialize scanner object
        System.out.print("Guess a number between 1 and 6: ");
        int guess = 0;  // initialize guess variable
        while (guess != NUM) { // loop until the user guesses the right number
            try {
                guess = input.nextInt();
                if (guess < 1 || guess > 6) {
                    System.out.println("Number out of range. Try again.");
                    continue;
                } else if (guess < NUM) { // if the guess is lower than the number it prompts the user to try again but also tells the user that the guess is too low
                    System.out.println("Too low. Try again.");
                } else if (guess > NUM) { // if the guess is higher than the number it prompts the user to try again but also tells the user that the guess is too high
                    System.out.println("Too high. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                input.next(); // clear the invalid input
                continue; //  goes to next iterations
            }
        }
        System.out.println("Congratulations! You guessed the number.");
        input.close();
    }
}
