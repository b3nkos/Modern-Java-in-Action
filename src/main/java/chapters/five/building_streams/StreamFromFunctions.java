package chapters.five.building_streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFromFunctions {
    public static void main(String[] args) {
        System.out.println("\nCreating infinite streams");

        System.out.println("\nUsing Iterate");
        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("\nGenerate");
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        IntStream ones = IntStream.generate(() -> 1);
    }
}
