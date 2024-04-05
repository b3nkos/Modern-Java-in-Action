package chapters.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Function {

  public static void main(String[] args) {
    List<Integer> l = map(Arrays.asList("lambdas", "in", "action"), (String s) -> s.length());
    System.out.println(l);

    List<Integer> multiplyByTwo = map(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), (Integer i) -> i * 2);
    System.out.println(multiplyByTwo);
  }

  public static <T, R> List<R> map(List<T> list, java.util.function.Function<T, R> function) {
    List<R> result = new ArrayList<>();

    for (T t : list) {
      result.add(function.apply(t));
    }

    return result;
  }
}
