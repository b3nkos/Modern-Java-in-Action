package chapters.three.quiz.one;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class Quiz {
    public static void main(String[] args) {
        // Before
        ToIntFunction<String> stringToInt = (String string) -> Integer.parseInt(string);

        // After
        ToIntFunction<String> stringToInt2 = Integer::parseInt;

        // Before
        BiPredicate<List<String>, String> contains = (list, element) -> list.contains(element);

        // After
        BiPredicate<List<String>, String> contains2 = List::contains;
    }

    public void callStartsWithNumber() {
        // Before
        Predicate<String> startsWithNumber = (String string) -> this.startsWithNumber(string);

        // After
        Predicate<String> startsWithNumber2 = this::startsWithNumber;
    }

    private boolean startsWithNumber(String string) {
        return true;
    }
}
