package JavaBasics.Assessment.Basic.Programming.Concepts;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rounds would you like to play (1-10)? ");
         int numberOfRounds = Integer.parseInt(scanner.nextLine());
        if (numberOfRounds <= 10) {
            for (int i = 0; i < numberOfRounds; i++) {
                System.out.println("                      ");
                System.out.println("-------------------------");
                System.out.println("Round number " + (i+1));
                System.out.println("-------------------------");
                playGame(scanner);
            }
            playAgain();

        } else {
            System.out.println("Invalid input, enter a value between 1 and 10 inclusive");
            System.exit(0);
        }

    }

    static void playGame (Scanner scanner) {

        System.out.println("Your turn (rock, paper or scissors)");
        String playerMove = scanner.nextLine();
        if ("paper".equals(playerMove) || "scissors".equals(playerMove) || "rock".equals(playerMove)) {

            Random random = new Random();
            int randomMove = random.nextInt(3);

            String computerMove;
            if (randomMove == 0) {
                computerMove = "rock";
            } else if (randomMove == 1) {
                computerMove = "paper";
            } else {
                computerMove = "scissors";
            }
            System.out.println("Computer chose " + computerMove + "!");

            if (playerMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if (playerWins(playerMove, computerMove)) {
                System.out.println("Player wins!");
            } else {
                System.out.println("Computer wins!");
            }


        }else{
            System.out.println("Enter only rock, paper or scissors");
            System.exit(0);
        }


        }

    static boolean playerWins(String playerMove, String computerMove) {
        if (playerMove.equals("rock")) {
            return computerMove.equals("scissors");
        } else if (playerMove.equals("paper")) {
            return computerMove.equals("rock");
        } else {
            return computerMove.equals("paper");
        }
    }

    static void playAgain(){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Do you want to play again");
        String playAgain = scanner.nextLine();

        if ("Y".equals(playAgain) || "YES".equals(playAgain)|| "yes".equals(playAgain) || "y".equals(playAgain)){
            System.out.println("How many rounds would you like to play (1-10)? ");
            int numberOfRounds = Integer.parseInt(scanner.nextLine());
            if (numberOfRounds <= 10) {
                for (int i = 0; i < numberOfRounds; i++) {
                    System.out.println("                      ");
                    System.out.println("-------------------------");
                    System.out.println("Round number " + (i+1));
                    System.out.println("-------------------------");
                    playGame(scanner);
                }

            } else {
                System.out.println("Invalid input, enter a value between 1 and 10 inclusive");
                System.exit(0);
            }
        } else{
            System.out.println(" ");
            System.out.println("Thanks for Playing!");
            System.exit(0);
        }




    }



}

