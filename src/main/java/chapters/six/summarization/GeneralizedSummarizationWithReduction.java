package chapters.six.summarization;

import chapters.six.Dish;

import java.util.Optional;

import static chapters.six.Menu.menu;
import static java.util.stream.Collectors.reducing;

public class GeneralizedSummarizationWithReduction {
  public static void main(String[] args) {
    Integer totalCalories = menu()
      .stream()
      .collect(reducing(0, Dish::calories, (i, j) -> i + j));

    System.out.println("\nTotal Calories: " + totalCalories);

    Integer totalCalories2 = menu()
      .stream()
      .collect(reducing(0, Dish::calories, Integer::sum));

    System.out.println("\nTotal Calories: " + totalCalories2);

    Optional<Dish> mostCalorieDish = menu()
      .stream()
      .collect(reducing((dish1, dish2) -> dish1.calories() > dish2.calories() ? dish1 : dish2));

    mostCalorieDish.ifPresent((dish) -> System.out.println("The most calorie dish: " + dish.name()));
  }
}
