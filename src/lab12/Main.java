package lab12;
import java.util.InputMismatchException;
import java.util.Scanner;

class ScoreInputException extends Exception {
    public ScoreInputException(String message) {
        super(message);
    }
}

class ScoreOutOfRange extends Exception {
    public ScoreOutOfRange(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        int score = 0;
        try {
            score = getScoreFromInput();
        } catch (ScoreInputException | ScoreOutOfRange e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Score entered: " + score);
    }

    private static int getScoreFromInput() throws ScoreInputException, ScoreOutOfRange {
        int score = 0;
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter score (0-100): ");
            score = scan.nextInt();
            if (score < 0) {
                throw new ScoreInputException("Score cannot be negative.");
            } else if (score > 100) {
                throw new ScoreOutOfRange("Score must be between 0 and 100.");
            }
        } catch (NumberFormatException e) {
            throw new ScoreInputException("Invalid input. Score must be an integer.");
        }

        return score;
    }
}
