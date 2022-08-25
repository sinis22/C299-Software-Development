package JavaBasics.Debugging.scanner;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        String noun1;
        String adjective1;
        String noun2;
        int number;
        String adjective2;
        String pluralNoun1;
        String pluralNoun2;
        String pluralNoun3;
        String verbPresentTense;
        String sameVerbButPastTense;

        System.out.println("Let's play MAD LIBS!");

        System.out.println("I need a noun: ");
        noun1 = inputReader.nextLine();

        System.out.println("Now an adjective: ");
        adjective1 = inputReader.nextLine();

        System.out.println("Another noun: ");
        noun2 = inputReader.nextLine();

        System.out.println("And a number: ");
        number = Integer.parseInt(inputReader.nextLine());

        System.out.println("Another adjective: ");
        adjective2 = inputReader.nextLine();

        System.out.println("A plural noun: ");
        pluralNoun1 = inputReader.nextLine();

        System.out.println("Another one ");
        pluralNoun2 = inputReader.nextLine();

        System.out.println("One more: ");
        pluralNoun3 = inputReader.nextLine();

        System.out.println("A verb (infinitive form): ");
        verbPresentTense = inputReader.nextLine();

        System.out.println("Same verb (past participle): ");
        sameVerbButPastTense = inputReader.nextLine();

        System.out.println("                                                ");
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println(noun1 + " the " + adjective1 + " frontier. These are the voyages of the starship " + noun2 +
                ". Its " + number +"-year mission: to explore strange " + adjective2 + " " + pluralNoun1 +
                ", to seek out " + adjective2 + " " + pluralNoun2 + " and " + adjective2 + " " + pluralNoun3 +
                ", to boldly" + verbPresentTense + " where no one has" + sameVerbButPastTense  + " before. ");



    }
}
