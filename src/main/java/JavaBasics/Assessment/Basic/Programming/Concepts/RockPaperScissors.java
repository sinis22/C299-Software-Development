package JavaBasics.Assessment.Basic.Programming.Concepts;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static int PlayerScore = 0;
    static int Ties = 0;
    static int ComputerScore = 0;

    public static void main(String[] args) {
        Rounds();
    }
    private static void Rounds() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rounds would you like to play (1-10)? ");
        int numberOfRounds = Integer.parseInt(scanner.nextLine());
        if (numberOfRounds <= 10) {
            for (int i = 0; i < numberOfRounds; i++) {
                //printing out the accumulative score with round number
                System.out.println("                      ");
                System.out.println("-------------------------");
                System.out.println("Round number " + (i + 1));
                System.out.println("Player Score: " + PlayerScore);
                System.out.println("Computers Score: " + ComputerScore);
                System.out.println("Games Drawn: " + Ties);
                System.out.println("-------------------------");
                playGame(scanner);
            }
            OverallWinner();
            playAgain();

        } else {
            System.out.println("Invalid input, enter a value between 1 and 10 inclusive");
            Rounds();
        }
    }

    static void playGame(Scanner scanner) {

        System.out.println("Your turn (rock, paper or scissors)");
        String playerMove = scanner.nextLine();
        //validating the player input
        if ("paper".equals(playerMove) || "scissors".equals(playerMove) || "rock".equals(playerMove)) {

            Random random = new Random();
            int randomMove = random.nextInt(3); // generating a random number for the computer to play their move

            // the number to play equivalent
            String computerMove;
            if (randomMove == 0) {
                computerMove = "rock";
            } else if (randomMove == 1) {
                computerMove = "paper";
            } else {
                computerMove = "scissors";
            }
            System.out.println("Computer chose " + computerMove + "!");

            // outcome of who won the round
            if (playerMove.equals(computerMove)) {
                System.out.println("It's a tie!");
                Ties = Ties + 1;
            } else if (playerWins(playerMove, computerMove)) {
                System.out.println("Player wins!");
                PlayerScore = PlayerScore + 1; // implementing score
            } else {
                System.out.println("Computer wins!");
                ComputerScore = ComputerScore + 1;
            }

        } else {
            System.out.println("Enter only rock, paper or scissors");
            Rounds();
        }
    }
    //Method to say which combinations can the player win the round
    static boolean playerWins(String playerMove, String computerMove) {
        if (playerMove.equals("rock")) {
            return computerMove.equals("scissors");
        } else if (playerMove.equals("paper")) {
            return computerMove.equals("rock");
        } else {
            return computerMove.equals("paper");
        }
    }

    //Method to print out who won overall after all the rounds are played
    static void OverallWinner() {
        if (PlayerScore > ComputerScore && PlayerScore >= Ties) {
            System.out.println("                      ");
            System.out.println("--------------------------------------------------------");
            System.out.println("Player Score: " + PlayerScore);
            System.out.println("Computers Score: " + ComputerScore);
            System.out.println("Games Drawn: " + Ties);
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("You are the overall winner with a score of " + PlayerScore + "!");
            System.out.println("--------------------------------------------------------");
        } else if (ComputerScore > PlayerScore && ComputerScore >= Ties) {
            System.out.println("                      ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Player Score: " + PlayerScore);
            System.out.println("Computers Score: " + ComputerScore);
            System.out.println("Games Drawn: " + Ties);
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("The computer is the overall winner with a score of " + ComputerScore + "!");
            System.out.println("-----------------------------------------------------------------------");
        } else {
            System.out.println("                      ");
            System.out.println("-------------------------");
            System.out.println("Player Score: " + PlayerScore);
            System.out.println("Computers Score: " + ComputerScore);
            System.out.println("Games Drawn: " + Ties);
            System.out.println("-------------------------");
            System.out.println("You both tied!");
            System.out.println("-------------------------");
        }
    }

    // Method for if the player wants to play again
    static void playAgain() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("                      ");
        System.out.println("Do you want to play again");
        String playAgain = scanner.nextLine();

        if ("Y".equals(playAgain) || "YES".equals(playAgain) || "yes".equals(playAgain) || "y".equals(playAgain)) {
            PlayerScore = 0;
            Ties = 0;
            ComputerScore = 0;
            Rounds();
        } else {
            System.out.println("Thanks for Playing!");
            System.exit(0);
        }
    }


}

