package chapters.five.numeric_streams;

import chapters.five.Dish;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static chapters.five.Menu.menu;

public class MapToInt {
    public static void main(String[] args) {
        int calories = menu()
                .stream()
                .mapToInt(Dish::calories)
                .sum();

        System.out.println("\nThe total calories is: " + calories);

        // Converting back to a stream of objects
        IntStream intStream = menu()
                .stream()
                .mapToInt(Dish::calories);

        Stream<Integer> stream = intStream.boxed();
    }
}
