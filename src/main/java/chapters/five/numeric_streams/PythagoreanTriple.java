package chapters.five.numeric_streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PythagoreanTriple {
    public static void main(String[] args) {
        Stream<int[]> pythagoreanTriples = IntStream
                .range(1, 100)
                .boxed()
                .flatMap(a ->
                        IntStream.rangeClosed(a, 100)
                                .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                                .mapToObj(b ->
                                        new int[]{a, b, (int) Math.sqrt(a * a + b * b)})
                );

        pythagoreanTriples
                .limit(5)
                .forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));

        System.out.println("\nCan you do better?");
        Stream<double[]> pythagoreanTriples2 = IntStream
                .rangeClosed(1, 100)
                .boxed()
                .flatMap(a ->
                        IntStream.rangeClosed(a, 100)
                                .mapToObj(b -> new double[]{a, b, Math.sqrt(a * a + b * b)})
                                .filter(t -> t[2] % 1 == 0)
                );

        pythagoreanTriples2
                .limit(5)
                .map(triple -> new int[]{((int) triple[0]), (int) triple[1], (int) triple[2]})
                .forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));
    }
}
