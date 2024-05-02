package chapters.six.reducing_and_sumarrizing;

import static chapters.six.Menu.menu;
import static java.util.stream.Collectors.counting;

public class CollectorsCounting {
  public static void main(String[] args) {
    Long howManyDishes = menu()
      .stream()
      .collect(counting());

    System.out.println("How many dishes: " + howManyDishes);
  }
}
