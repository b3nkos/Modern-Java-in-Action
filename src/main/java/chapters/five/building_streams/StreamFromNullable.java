package chapters.five.building_streams;

import java.util.stream.Stream;

public class StreamFromNullable {
    public static void main(String[] args) {
        String homeValue = System.getProperty("home");
        Stream<String> homeValueStream = homeValue == null ? Stream.empty() : Stream.of(homeValue);

        // Using Stream.ofNullable

        Stream<String> homeValueStream2 = Stream.ofNullable(homeValue);

        Stream<String> values = Stream
                .of("config", "home", "user")
                .flatMap(key -> Stream.ofNullable(System.getProperty(key)));
    }
}
