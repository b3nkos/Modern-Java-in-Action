package chapters.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class MethodReferences {
  public static void main(String[] args) {

    List<Apple> inventory = Arrays.asList(
            new Apple(120, Color.RED),
            new Apple(80, Color.GREEN),
            new Apple(155, Color.GREEN)
    );

    // Before
    inventory.sort((Apple apple1, Apple apple2) -> apple1.weight().compareTo(apple2.weight()));

    // After, using a method reference and java.util.Comparator.comparing
    inventory.sort(comparing(Apple::weight));

    List<String> strings = Arrays.asList("a", "b", "A", "B");

    // Before
    strings.sort((string1, string2) -> string1.compareToIgnoreCase(string2));

    // After
    strings.sort(String::compareToIgnoreCase);

    TriFunction<Integer, Integer, Integer, RGB> colorFactory = RGB::new;

    RGB rgb = colorFactory.apply(23, 44, 55);
    System.out.println(rgb.toString());

  }

  public void callNameValidation() {
    List<String> words = Arrays.asList("Hello", "world", "java");
    List<String> filter = filter(words, this::isValidName);
    System.out.println(filter);
  }

  private boolean isValidName(String string) {
    return Character.isUpperCase(string.charAt(0));
  }

  private static <T> List<T> filter(List<T> list, java.util.function.Predicate<T> predicate) {
    List<T> result = new ArrayList<>();
    for (T e : list) {
      if (predicate.test(e)) {
        result.add(e);
      }
    }

    return result;
  }
}

