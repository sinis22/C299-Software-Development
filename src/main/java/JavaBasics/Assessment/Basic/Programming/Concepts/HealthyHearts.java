package JavaBasics.Assessment.Basic.Programming.Concepts;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int age;

        // asking for age of the user and storing in age
        System.out.println("What is your age? ");
        age = Integer.parseInt(inputReader.nextLine());

        float MaxHeartRate = (220-age); // creating the max heart rate
        float lower = ((50/100f)*MaxHeartRate); // creating the lower end of target heart rate
        float higher = ((85/100f)*MaxHeartRate);// creating the higher end of target heart rate
        System.out.println("Your maximum heart rate should be " + MaxHeartRate + " beats per minute.");
        System.out.println("Your target HR Zone is " + Math.round(lower) + " - " + Math.round(higher) + " beats per minute.");
    }
}