package chapters.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferences {
  public static void main(String[] args) {
    Supplier<Apple> supplier1 = Apple::new;
    Apple apple1 = supplier1.get();

    // Which is equivalent to
    Supplier<Apple> supplier2 = () -> new Apple();
    Apple apple2 = supplier2.get();

    Function<Integer, Apple> function1 = Apple::new;
    Apple apple3 = function1.apply(130);

    // Which is equivalent to
    Function<Integer, Apple> function2 = (weight) -> new Apple(weight);
    Apple apple4 = function2.apply(110);

    List<Integer> weights = Arrays.asList(7, 3, 4, 10);
    List<Apple> apples = map(weights, Apple::new);

    // If you have two argument constructor Apple (Color color, Integer weight)
    BiFunction<Color, Integer, Apple> biFunction1 = Apple::new;
    Apple apple5 = biFunction1.apply(Color.GREEN, 110);

    // Which is equivalent to
    BiFunction<Color, Integer, Apple> biFunction2 = (color, weight) -> new Apple(color, weight);
    Apple apple6 = biFunction2.apply(Color.GREEN, 110);
  }

  public static List<Apple> map(List<Integer> list, Function<Integer, Apple> function) {
    List<Apple> result = new ArrayList<>();

    for(Integer i : list) {
      result.add(function.apply(i));
    }

    return result;
  }

}
