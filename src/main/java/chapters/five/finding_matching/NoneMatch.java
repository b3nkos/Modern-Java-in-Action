package chapters.five.finding_matching;

import static chapters.five.Menu.menu;

public class NoneMatch {
    public static void main(String[] args) {
        System.out.println("Using the noneMatch operation");

        boolean isHealthy = menu()
                .stream()
                .noneMatch(dish -> dish.calories() >= 1000);
        System.out.println("\nThe menu is healthy? " + isHealthy);
    }
}
