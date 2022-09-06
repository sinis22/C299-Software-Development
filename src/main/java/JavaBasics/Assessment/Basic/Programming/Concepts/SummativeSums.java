package JavaBasics.Assessment.Basic.Programming.Concepts;

import java.util.stream.IntStream;

public class SummativeSums {
    public static void main(String[] args) {

        int[] list1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 }; // a list of numbers
        int[] list2 = { 999, -60, -77, 14, 160, 301 };
        int[] list3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
        int sum1 = IntStream.of(list1).sum(); // adding all the numbers in the list together
        int sum2 = IntStream.of(list2).sum();
        int sum3 = IntStream.of(list3).sum();

        System.out.println("#1 Array Sum: " + sum1); //printing the result
        System.out.println("#2 Array Sum: " + sum2);
        System.out.println("#3 Array Sum: " + sum3);
    }
}