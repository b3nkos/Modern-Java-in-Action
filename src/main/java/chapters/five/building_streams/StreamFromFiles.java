package chapters.five.building_streams;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromFiles {
    public static void main(String[] args) {
        long uniqueWords;
        try (Stream<String> lines = Files.lines(Paths.get("data.txt"), Charset.defaultCharset())) {
            uniqueWords = lines
                    .flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();

            System.out.println("\nUnique words: " + uniqueWords);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
