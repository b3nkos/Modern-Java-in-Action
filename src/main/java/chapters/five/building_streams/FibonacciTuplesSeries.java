package chapters.five.building_streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciTuplesSeries {
    public static void main(String[] args) {
        System.out.println("\nFibonacci Tuples");
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .forEach(t -> System.out.println("(" + t[0] + ", " + t[1] + ")"));

        System.out.println("\nFibonacci Series");
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(t -> t[0])
                .forEach(System.out::println);

        System.out.println("\nJava 9 iterate enhanced with support for predicate");
        IntStream.iterate(0, n -> n < 100, n -> n + 4)
                .forEach(System.out::println);
    }
}
