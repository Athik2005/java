import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rounds = 0;
        int totalScore = 0;
        int maxAttempts = 5;
        String playAgain;

        do {
            System.out.println("\n***********New Round***********");
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            rounds++;
            int roundScore = maxAttempts;

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (1-100): ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    break;
                } else if (guess > targetNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }

                roundScore--;
            }

            if (attempts == maxAttempts && roundScore == 0) {
                System.out.println("Sorry! You've used all your attempts. The correct number was: " + targetNumber);
            }

            totalScore += roundScore;
            System.out.println("Round " + rounds + " Score: " + roundScore);
            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\nGame Over! You played " + rounds + " rounds.");
        System.out.println("Your Total Score: " + totalScore);
    }
}
