package chapters.six.summarization;

import chapters.six.Dish;

import java.util.IntSummaryStatistics;

import static chapters.six.Menu.menu;
import static java.util.stream.Collectors.*;

public class FindTotalNumberOfCalories {
  public static void main(String[] args) {
    int totalCalories = menu()
      .stream()
      .collect(summingInt(Dish::calories));

    System.out.println("\nTotal number calories: " + totalCalories);

    Double averageCalories = menu()
      .stream()
      .collect(averagingInt(Dish::calories));

    System.out.println("The calories average: " + averageCalories);

    IntSummaryStatistics menuStatistics = menu()
      .stream()
      .collect(summarizingInt(Dish::calories));

    System.out.println(menuStatistics);
  }
}
