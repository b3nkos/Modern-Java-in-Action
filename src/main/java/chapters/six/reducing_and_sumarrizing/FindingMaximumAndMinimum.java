package chapters.six.reducing_and_sumarrizing;

import chapters.six.Dish;

import java.util.Comparator;
import java.util.Optional;

import static chapters.six.Menu.menu;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.maxBy;

public class FindingMaximumAndMinimum {
  public static void main(String[] args) {
    Comparator<Dish> dishCaloriesComparator = comparingInt(Dish::calories);

    Optional<Dish> mostCalorieDish = menu()
      .stream()
      .collect(maxBy(dishCaloriesComparator));

    mostCalorieDish.ifPresent((dish) -> System.out.println(
      "The most calorie dish is: " + dish.name() + " with calories: " + dish.calories()));
  }
}
