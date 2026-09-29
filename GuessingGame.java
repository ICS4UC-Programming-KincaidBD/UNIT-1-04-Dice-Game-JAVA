/**
* Guessing Game in between 6 numbers, it gives hints to the user as they get more answers wrong.
*
* @author  KincaidBD
* @version 1.0
* @since   2026-09-29
*/
import java.util.Random;
import java.util.Scanner;

final class GuessingGame {
    /*** 
     * @exception IllegalStateException
     * @see IllegalStateException
     */
    private GuessingGame() {
        throw new IllegalStateException("Utility class");
    }
    
   
    public static void main(String[] args) {
        // Generate a random number between 1 and 6
        final int NUM = new Random().nextInt(6) + 1;
        // initialize scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 6: ");
        // initialize guess variable
        int guess = 0;
        // loop until the user guesses the right number
        while (guess != NUM) { 
            try {
                guess = input.nextInt();
                if (guess < 1 || guess > 6) {
                    System.out.println("Number out of range. Try again.");
                    continue;
                    // if the guess is lower than the number it prompts the user to try again but also tells the user that the guess is too low
                } else if (guess < NUM) { 
                    System.out.println("Too low. Try again.");
                    // if the guess is higher than the number it prompts the user to try again but also tells the user that the guess is too high
                } else if (guess > NUM) {
                    System.out.println("Too high. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                // clear the invalid input
                input.next();
                //  goes to next iterations
                continue; 
            }
        }
        System.out.println("Congratulations! You guessed the number.");
        input.close();
    }
}
