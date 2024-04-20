package chapters.five.building_streams;

import java.util.Arrays;

public class StreamFromArrays {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, 11, 13};
        int sum = Arrays
                .stream(numbers)
                .sum();
        System.out.println("\nThe sum is: " + sum);
    }
}
