package chapters.six.reduction;

import chapters.six.Dish;

import java.util.Optional;

import static chapters.six.Menu.menu;
import static java.util.stream.Collectors.reducing;

public class MostCalorieDish {
  public static void main(String[] args) {
    Optional<Dish> mostCalorieDish = menu()
      .stream()
      .collect(reducing((dish1, dish2) -> dish1.calories() > dish2.calories() ? dish1 : dish2));

    mostCalorieDish.ifPresent(dish -> System.out.println("\nThe most calorie dish is: " + dish.name()));
  }
}
