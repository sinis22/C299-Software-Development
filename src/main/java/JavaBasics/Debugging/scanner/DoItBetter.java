package JavaBasics.Debugging.scanner;

import java.util.Scanner;

public class DoItBetter {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        int miles;
        int eat;
        int languages;

        // We can use the Scanner's readLine to assign value to our strings
        // because its return type is string
        System.out.println("How many miles can you run? ");
        miles = Integer.parseInt(inputReader.nextLine());
        System.out.println("I can do more! I can run " + ((miles * 2) + 1) + " miles!");

        System.out.println("How many hot dogs can you eat?");
        eat = Integer.parseInt(inputReader.nextLine());
        System.out.println("I can do more! I can eat " + ((eat * 2) + 1) + " hot dogs!");

        System.out.println("How many languages do you know? ");
        languages = Integer.parseInt(inputReader.nextLine());
        System.out.println("I can do more! I can speak " + ((languages * 2) + 1) + " languages!");
    }
}
