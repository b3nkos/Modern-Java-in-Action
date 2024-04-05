package chapters.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Predicate {

  public static void main(String[] args) {

    List<String> listOfStrings = Arrays.asList("hello", "", "world", "print");

    java.util.function.Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isBlank();
    List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);

    System.out.println(nonEmpty);
  }

  public static  <T> List<T> filter(List<T> list, java.util.function.Predicate<T> predicate) {
    List<T> results = new ArrayList<>();

    for (T t : list) {
      if (predicate.test(t)) {
        results.add(t);
      }
    }

    return results;
  }
}
