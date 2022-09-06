package JavaBasics.Assessment.Basic.Programming.Concepts;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        // Setting the variable names
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String dogName;
        // List of dogbreeds
        String[] dogBreed = { "Irish Wolfhound","English Cocker Spaniel", "Alaskan Malamute", "Australian Kelpie", "Whippet"};

        // Producing a random percentage values for  adding up to 100%
        int percentage1 = random.nextInt(101);
        int percentage2 = random.nextInt(101-percentage1);
        int percentage3 = random.nextInt(101-percentage1-percentage2);
        int percentage4 = random.nextInt(101-percentage1-percentage2-percentage3);
        int percentage5 = 100-percentage1-percentage2-percentage3-percentage4;

        int[] randomPercentages = {percentage1, percentage2, percentage3, percentage4, percentage5};

        // Printing sentences and requesting name of the dog
        System.out.println("What is your dog name?");
        dogName = scanner.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println("         ");
        System.out.println(dogName + " is:");
        System.out.println("         ");

        //Printing the percentage created to the dogbreed
        for (int i=0; i<5;i++){
            System.out.println(randomPercentages[i] + "% " + dogBreed[i]);

        }

        System.out.println("         ");
        System.out.println("Wow, that's QUITE the dog!");
    }
}
