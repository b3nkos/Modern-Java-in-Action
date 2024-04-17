package chapters.five.finding_matching;

import static chapters.five.Menu.menu;

public class AllMatch {
    public static void main(String[] args) {
        System.out.println("\nChecking to see if a predicate matches all elements");
        System.out.println("Using the allMatch operation");

        boolean isHealthy = menu()
                .stream()
                .allMatch(dish -> dish.calories() < 1000);
        System.out.println("\nThe menu is healthy? " + isHealthy);
    }
}
