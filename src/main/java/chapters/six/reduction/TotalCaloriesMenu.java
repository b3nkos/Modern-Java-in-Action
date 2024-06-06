package chapters.six.reduction;

import chapters.six.Dish;

import static chapters.six.Menu.menu;
import static java.util.stream.Collectors.reducing;

public class TotalCaloriesMenu {
  public static void main(String[] args) {
    Integer totalCalories = menu()
      .stream()
      .collect(reducing(0, Dish::calories, (i, j) -> i + j));

    System.out.println("\nMenu total calories are: " + totalCalories);

    Integer totalCalories2 = menu()
      .stream()
      .collect(reducing(0, Dish::calories, Integer::sum));
    System.out.println("Menu total calories are: " + totalCalories2);

    Integer totalCalories3 = menu()
      .stream()
      .map(Dish::calories)
      .reduce(Integer::sum)
      .get();
    System.out.println("Menu total calories are: " + totalCalories3);

    int totalCalories4 = menu()
      .stream()
      .mapToInt(Dish::calories)
      .sum();
    System.out.println("Menu total calories are: " + totalCalories4);
  }
}
