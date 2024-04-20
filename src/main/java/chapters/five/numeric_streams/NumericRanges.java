package chapters.five.numeric_streams;

import java.util.stream.IntStream;

public class NumericRanges {
    public static void main(String[] args) {
        IntStream eventNumbers = IntStream
                .rangeClosed(1, 100)
                .filter(number -> number % 2 == 0);
        System.out.println(eventNumbers.count());
    }
}
