package chapters.five.building_streams;

import java.util.stream.Stream;

public class StreamOfValues {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Modern ", "Java ", "In ", "Action");
        stream
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Stream<Object> emptyStream = Stream.empty();
    }
}
