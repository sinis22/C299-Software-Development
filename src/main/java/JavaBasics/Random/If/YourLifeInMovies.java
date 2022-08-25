package JavaBasics.Random.If;

import java.util.Scanner;

public class YourLifeInMovies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int year;

        System.out.println("What is your name? ");
        name = scanner.nextLine();

        System.out.println("Ok, " + name + ", when were you born?");
        year = Integer.parseInt(scanner.nextLine());

        System.out.println("Well" + name + "...");

        if (year <  2005){
            System.out.println("Pixar's 'Up' came out over a decade ago");

        }
        if (year < 1995){
            System.out.println("the first Harry Potter came out over 15 years ago");

        }
        if (year < 1985){
            System.out.println("Space Jam came out not last decade, but the one before THAT");

        }
        if (year < 1975){
            System.out.println("the original Jurassic Park release is closer to the first lunar landing than it is to today");

        }
        if (year < 1965){
            System.out.println("the MASH TV series has been around for almost half a century!");

        }



    }
}
