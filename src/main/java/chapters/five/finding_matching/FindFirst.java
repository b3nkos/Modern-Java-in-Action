package chapters.five.finding_matching;

import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> someNumbers = List.of(1, 2, 3, 4, 5);
        Optional<Integer> firstSquareDivisibleByThree = someNumbers
                .stream()
                .map(n -> n * 3)
                .filter(n -> n % 3 == 0)
                .findFirst();
    }
}
