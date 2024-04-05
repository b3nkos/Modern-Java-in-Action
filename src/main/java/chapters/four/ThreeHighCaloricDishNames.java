package chapters.four;

import java.util.List;

import static chapters.four.Menu.menu;
import static java.util.stream.Collectors.toList;

public class ThreeHighCaloricDishNames {

    public static void main(String[] args) {
        List<String> threeHighCaloricDishNames = menu().stream()
                .filter(dish -> dish.calories() > 300)
                .map(Dish::name)
                .limit(3)
                .collect(toList());

        System.out.println(threeHighCaloricDishNames);
    }
}
