package chapters.five;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamSlicing {
  public static void main(String[] args) {

    List<Dish> specialMenu = Arrays.asList(
            new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER)
    );

    // Slicing using a predicate

    // Using takeWhile
    System.out.println("\nUsing the filter operation\n");
    List<Dish> filteredMenu = specialMenu.stream()
            .filter(dish -> dish.calories() < 320)
            .collect(toList());

    System.out.println(filteredMenu);

    System.out.println("\nUsing the takeWhile operation\n");
    List<Dish> slicedMenu1 = specialMenu.stream()
            .takeWhile(dish -> dish.calories() < 320)
            .collect(toList());

    System.out.println(slicedMenu1);

    // Using droWhile
    System.out.println("\nUsing the dropWhile operation\n");
    List<Dish> slicedMenu2 = specialMenu.stream()
            .dropWhile(dish -> dish.calories() < 320)
            .collect(toList());

    System.out.println(slicedMenu2);
  }
}
