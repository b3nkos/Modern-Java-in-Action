package chapters.five.numeric_streams;

import chapters.five.Dish;

import static chapters.five.Menu.menu;

public class OptionalInt {
    public static void main(String[] args) {
        java.util.OptionalInt maxCalories = menu()
                .stream()
                .mapToInt(Dish::calories)
                .max();

        int max = maxCalories.orElse(1);
    }
}
