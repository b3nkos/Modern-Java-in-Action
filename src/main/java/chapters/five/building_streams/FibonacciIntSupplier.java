package chapters.five.building_streams;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class FibonacciIntSupplier {
    public static void main(String[] args) {
        IntSupplier fibonacci = new IntSupplier() {
            private int previous;
            private int current = 1;

            @Override
            public int getAsInt() {
                int oldPrevious = previous;
                int nextValue = previous + current;
                previous = current;
                current = nextValue;
                return oldPrevious;
            }
        };

        IntStream
                .generate(fibonacci)
                .limit(10)
                .forEach(System.out::println);
    }
}
