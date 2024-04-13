package chapters.five;

import java.util.Arrays;
import java.util.List;

import static chapters.five.Menu.menu;
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
        System.out.println("\nUsing the filter operation\n");
        List<Dish> filteredMenu = specialMenu.stream()
                .filter(dish -> dish.calories() < 320)
                .collect(toList());

        System.out.println(filteredMenu);

        // Using takeWhile
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

        // Truncating a stream
        System.out.println("\nUsing the limit operation\n");
        List<Dish> dishesLimit = specialMenu
                .stream()
                .filter(dish -> dish.calories() > 300)
                .limit(3)
                .collect(toList());

        System.out.println(dishesLimit);

        // Skipping elements
        System.out.println("\nUsing the skip operation\n");
        List<Dish> dishesSkip = menu().stream()
                .filter(dish -> dish.calories() > 300)
                .skip(2)
                .collect(toList());

        System.out.println(dishesSkip);

        // Quiz filtering
        // How would you use streams to filter the first two meat dishes?
        System.out.println("\nQuiz filtering\n");
        List<Dish> dishesLimitMeat = menu().stream()
                .filter(dish -> dish.type() == Dish.Type.MEAT)
                .limit(2)
                .collect(toList());

        System.out.println(dishesLimitMeat);
    }
}
