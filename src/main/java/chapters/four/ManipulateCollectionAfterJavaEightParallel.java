package chapters.four;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class ManipulateCollectionAfterJavaEightParallel {
  public static void main(String[] args) {
    List<String> lowCaloricDishesName = Menu.menu().parallelStream()
            .filter(dish -> dish.calories() < 400)
            .sorted(comparing(Dish::calories))
            .map(Dish::name)
            .collect(toList());

    System.out.println(lowCaloricDishesName);
  }
}
