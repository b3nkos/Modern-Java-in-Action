package chapters.five.finding_matching;

import chapters.five.Dish;

import static chapters.five.Menu.menu;

public class AnyMatch {
    public static void main(String[] args) {
        System.out.println("\nChecking to see if a predicate matches at least one element");
        System.out.println("Using the anyMatch operation\n");

        if (menu().stream().anyMatch(Dish::vegetarian)) {
            System.out.println("The menu is (somewhat) vegetarian friendly!!");
        }
    }
}
