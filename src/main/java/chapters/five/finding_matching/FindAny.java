package chapters.five.finding_matching;

import chapters.five.Dish;

import java.util.Optional;

import static chapters.five.Menu.menu;

public class FindAny {
    public static void main(String[] args) {
        Optional<Dish> dish = menu()
                .stream()
                .filter(Dish::vegetarian)
                .findAny();
    }
}
