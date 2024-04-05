package chapters.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilteringApples {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red")
        );

        // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
        List<Apple> greenApples = filterApples(inventory, FilteringApples::isGreenApple);
        System.out.println(greenApples);

        // [Apple{color='green', weight=155}]
        List<Apple> heavyApples = filterApples(inventory, FilteringApples::isHeavyApple);
        System.out.println(heavyApples);

        // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
        List<Apple> greenApples2 = filterApples(inventory, (Apple apple) -> "green".equals(apple.color()));
        System.out.println(greenApples2);

        // [Apple{color='green', weight=155}]
        List<Apple> heavyApples2 = filterApples(inventory, (Apple apple) -> apple.weight() > 150);
        System.out.println(heavyApples2);

        // []
        List<Apple> weirdApples = filterApples(inventory, (Apple apple) -> apple.weight() < 80 || "brown".equals(apple.color()));
        System.out.println(weirdApples);

        List<Apple> heavyApplesStream = inventory.stream().filter(FilteringApples::isHeavyApple)
                .toList();

        System.out.println(heavyApplesStream);

        List<Apple> heavyApplesParallelStream = inventory.parallelStream().filter(FilteringApples::isHeavyApple)
                .toList();

        System.out.println(heavyApplesParallelStream);
    }

    static List<Apple> filterGreenApples(List<Apple> inventory) {
        ArrayList<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if ("green".equals(apple.color())) {
                result.add(apple);
            }
        }

        return result;
    }

    static List<Apple> filterHeavyApples(List<Apple> inventory) {
        ArrayList<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (apple.weight() > 150) {
                result.add(apple);
            }
        }

        return result;
    }

    private static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.color());
    }

    private static boolean isHeavyApple(Apple apple) {
        return apple.weight() > 150;
    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
        ArrayList<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }


    record Apple(int weight, String color) {
    }
}
