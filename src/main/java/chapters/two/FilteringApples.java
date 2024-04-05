package chapters.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringApples {
  public static void main(String... args) {
    List<Apple> inventory = Arrays.asList(
            new Apple(80, Color.GREEN),
            new Apple(155, Color.GREEN),
            new Apple(120, Color.RED)
    );

    // [Apple{color=GREEN, weight=80}, Apple{color=GREEN, weight=155}]
    List<Apple> greenApples = filterApplesByColor(inventory, Color.GREEN);
    System.out.println(greenApples);

    // [Apple{color=RED, weight=120}]
    List<Apple> redApples = filterApplesByColor(inventory, Color.RED);
    System.out.println(redApples);

    // [Apple{color=GREEN, weight=80}, Apple{color=GREEN, weight=155}]
    List<Apple> greenApples2 = filter(inventory, new AppleColorPredicate());
    System.out.println(greenApples2);

    // [Apple{color=GREEN, weight=155}]
    List<Apple> heavyApples = filter(inventory, new AppleWeightPredicate());
    System.out.println(heavyApples);

    // []
    List<Apple> redAndHeavyApples = filter(inventory, new AppleRedAndHeavyPredicate());
    System.out.println(redAndHeavyApples);

    // [Apple{color=RED, weight=120}]
    List<Apple> redApples2 = filter(inventory, new ApplePredicate() {
      @Override
      public boolean test(Apple apple) {
        return apple.color() == Color.RED;
      }
    });
    System.out.println(redApples2);

    List<Apple> redApples3 = filter(inventory, (Apple apple) -> Color.RED.equals(apple.color()));

    List<Integer> numbers = Arrays.asList(2,3,4,5);
    List<Integer> eventNumbers = filter(numbers, (Integer i) -> i % 2 == 0);
    System.out.println(eventNumbers);
  }

  private static List<Apple> filter(List<Apple> inventory, ApplePredicate applePredicate) {
    List<Apple> result = new ArrayList<>();

    for (Apple apple : inventory) {
      if (applePredicate.test(apple)) {
        result.add(apple);
      }
    }

    return result;
  }

  private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
    List<T> result = new ArrayList<>();
    for (T e : list) {
      if (predicate.test(e)) {
        result.add(e);
      }
    }

    return result;
  }

  private static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
    List<Apple> result = new ArrayList<>();

    for (Apple apple : inventory) {
      if (apple.color() == color) {
        result.add(apple);
      }
    }

    return result;
  }

  private static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
    List<Apple> result = new ArrayList<>();

    for (Apple apple : inventory) {
      if (apple.weight() > weight) {
        result.add(apple);
      }
    }

    return result;
  }
}
