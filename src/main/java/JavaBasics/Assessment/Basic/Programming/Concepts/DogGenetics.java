package JavaBasics.Assessment.Basic.Programming.Concepts;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String dogName;
        String[] dogBreed = { "Irish Wolfhound","English Cocker Spaniel", "Alaskan Malamute", "Australian Kelpie", "Whippet"};

        int percentage1 = random.nextInt(101);
        int percentage2 = random.nextInt(101-percentage1);
        int percentage3 = random.nextInt(101-percentage1-percentage2);
        int percentage4 = random.nextInt(101-percentage1-percentage2-percentage3);
        int percentage5 = 100-percentage1-percentage2-percentage3-percentage4;

        int[] randomPercentages = {percentage1, percentage2, percentage3, percentage4, percentage5};

        System.out.println("What is your dog name?");
        dogName = scanner.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println("         ");
        System.out.println(dogName + " is:");
        System.out.println("         ");

        for (int i=0; i<5;i++){
            System.out.println(randomPercentages[i] + "% " + dogBreed[i]);

        }

        System.out.println("         ");
        System.out.println("Wow, that's QUITE the dog!");
    }
}
