package chapters.four;

import java.util.List;
import java.util.Map;

import static chapters.four.Menu.menu;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class ManipulateCollectionAfterJavaEight {
    public static void main(String[] args) {
        List<String> lowCaloricDishesName = menu().stream()
                .filter(dish -> dish.calories() < 400)
                .sorted(comparing(Dish::calories))
                .map(Dish::name)
                .collect(toList());

        System.out.println(lowCaloricDishesName);

        Map<Dish.Type, List<Dish>> dishesByType = menu().stream()
                .collect(groupingBy(Dish::type));

        System.out.println(dishesByType);
    }
}
