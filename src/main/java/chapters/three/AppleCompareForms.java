package chapters.three;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleCompareForms {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(120, Color.RED),
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN)
        );

        // Step 1: Pass Code
        inventory.sort(new AppleComparator());

        // Step 2: Use an anonymous class
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return a1.weight().compareTo(a2.weight());
            }
        });

        // Step 3: Use lambda expressions
        inventory.sort((Apple a1, Apple a2) -> a1.weight().compareTo(a2.weight()));

        // Step 4: Use lambda expressions infer types
        inventory.sort((a1, a2) -> a1.weight().compareTo(a2.weight()));

        // Step 5: Making the code more readable using java.util.Comparator.comparing helper
        Comparator<Apple> comparator = comparing((Apple apple) -> apple.weight());

        // Step 6: Rewrite the solution is a slight more compact form
        inventory.sort(comparing(apple -> apple.weight()));

        // Step 7: Use method references
        inventory.sort(comparing(Apple::weight));
    }
}
