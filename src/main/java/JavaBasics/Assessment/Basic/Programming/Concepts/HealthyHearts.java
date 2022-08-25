package JavaBasics.Assessment.Basic.Programming.Concepts;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        int age;

        System.out.println("What is your age? ");
        age = Integer.parseInt(inputReader.nextLine());

        float MaxHeartRate = (220-age);
        float lower = ((50/100f)*MaxHeartRate);
        float higher = ((85/100f)*MaxHeartRate);
        System.out.println("Your maximum heart rate should be " + MaxHeartRate + " beats per minute.");
        System.out.println("Your target HR Zone is " + Math.round(lower) + " - " + Math.round(higher) + " beats per minute.");
    }
}