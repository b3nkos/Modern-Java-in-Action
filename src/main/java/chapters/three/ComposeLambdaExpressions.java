package chapters.three;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Comparator.comparing;

public class ComposeLambdaExpressions {
  public static void main(String[] args) {
    List<Apple> inventory = Arrays.asList(
            new Apple(120, Color.RED, "Canada"),
            new Apple(80, Color.GREEN, "Rumania"),
            new Apple(155, Color.GREEN, "Iceland")
    );

    Predicate<Apple> redApple = (Apple apple) -> apple.color() == Color.RED;
    Predicate<Apple> greenApple = (Apple apple) -> apple.color() == Color.GREEN;
    Predicate<Apple> heavyApple = (Apple apple) -> apple.weight() > 150;

    // Reversed order
    inventory.sort(comparing(Apple::weight).reversed());

    // Chaining Comparators
    inventory.sort(comparing(Apple::weight)
            .reversed()
            .thenComparing(Apple::country));

    // Composing Predicates
    Predicate<Apple> nonRedApples = redApple.negate();
    Predicate<Apple> redAndHeavyApple = redApple.and(heavyApple); // (a && b)
    Predicate<Apple> redAndHeavyAppleOrGreen = redApple.and(heavyApple).or(greenApple); // (a && b) || c

  }
}
