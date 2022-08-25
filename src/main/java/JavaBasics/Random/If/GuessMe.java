package JavaBasics.Random.If;

import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 8;
        int guess;

        System.out.println("I've chosen a number. Betcha can't guess it!");

        System.out.println("Your guess: ");
        guess = Integer.parseInt(scanner.nextLine());

        if (guess == number){
            System.out.println("Wow, nice guess! That was it!");
        } else if (guess < number) {
            System.out.println("Ha, nice try - too low! I chose " + number);
        }else {
            System.out.println("Too bad, way too high. I chose " + number);
        }
    }
}



