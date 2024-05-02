package chapters.six.summarization;

import chapters.six.Dish;

import static chapters.six.Menu.menu;
import static java.util.stream.Collectors.joining;

public class JoiningStrings {
  public static void main(String[] args) {
    String shortMenu = menu()
      .stream()
      .map(Dish::name)
      .collect(joining());

    System.out.println("\n" + shortMenu);

    String shortMenuCommaDelimiter = menu()
      .stream()
      .map(Dish::name)
      .collect(joining(", "));

    System.out.println(shortMenuCommaDelimiter);
  }
}
