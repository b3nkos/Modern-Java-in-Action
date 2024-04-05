package chapters.five;

import java.util.Arrays;
import java.util.List;

import static chapters.five.Menu.menu;
import static java.util.stream.Collectors.toList;

public class StreamFiltering {
  public static void main(String[] args) {

    // Filtering with a predicate
    List<Dish> vegetarianMenu = menu().stream()
            .filter(Dish::vegetarian)
            .collect(toList());

    System.out.println(vegetarianMenu);

    // Filtering unique elements
    List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
    numbers.stream()
            .filter(i -> i % 2 == 0)
            .distinct()
            .forEach(System.out::println);
  }
}
