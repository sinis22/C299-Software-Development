package JavaBasics.Debugging.scanner;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        int age;


        // We can use the Scanner's readLine to assign value to our strings
        // because its return type is string
        System.out.println("What is your age? ");
        age = Integer.parseInt(inputReader.nextLine());

        float MaxHeartRate = (220-age);
        //double lower = (.5 * MaxHeartRate);
        //double higher = (.85 * MaxHeartRate);

        float lower = ((50/100f)*MaxHeartRate);
        float higher = ((85/100f)*MaxHeartRate);
        System.out.println("Your maximum heart rate should be " + MaxHeartRate + " beats per minute.");
        System.out.println("Your target HR Zone is " + Math.round(lower) + " - " + Math.round(higher) + " beats per minute.");
    }
}