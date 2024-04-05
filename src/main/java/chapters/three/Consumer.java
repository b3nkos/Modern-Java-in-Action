package chapters.three;

import java.util.Arrays;
import java.util.List;

public class Consumer {

  public static void main(String[] args) {
    forEach(Arrays.asList(1, 2, 3, 4, 5), (Integer i) -> System.out.println(i));
  }

  public static <T> void forEach(List<T> list, java.util.function.Consumer<T> consumer) {
    for (T t : list) {
      consumer.accept(t);
    }
  }
}
