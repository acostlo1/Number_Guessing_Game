import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //Number Guessing Game

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;

        /*Notice how we tend to call for a random number within the parentheses.
        first number is inconclusive(meaning 1 does generate), second number is exclusive
        (meaning the second number is always -1).
         */

        int randomNumber = random.nextInt(min, max);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("TOO LOW! Try again...");
            } else if(guess > randomNumber) {
                System.out.println("TOO HIGH! Try again");
            } else {
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }

        } while(guess != randomNumber);

        scanner.close();

    }
}