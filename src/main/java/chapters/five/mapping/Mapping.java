package chapters.five.mapping;

import chapters.five.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static chapters.five.Menu.menu;
import static java.util.stream.Collectors.toList;

public class Mapping {
    public static void main(String[] args) {
        // Applying a function to each element of a stream

        // Pass a method reference Dish::name to map the method to extract the
        // names of the dishes in the stream

        System.out.println("\nGetting dish names\n");
        List<String> dishNames = menu().stream()
                .map(Dish::name)
                .collect(toList());

        System.out.println(dishNames);

        System.out.println("\nGetting word lengths\n");
        List<String> words = List.of("Modern", "Java", "In", "Action");
        List<Integer> wordLengths = words
                .stream()
                .map(String::length)
                .collect(toList());
        System.out.println(wordLengths);

        System.out.println("\nGetting dish names word lengths\n");
        List<Integer> dishNameLengths = menu()
                .stream()
                .map(Dish::name)
                .map(String::length)
                .collect(toList());
        System.out.println(dishNameLengths);

        //Flattering streams
        System.out.println("\nFlattering streams\n");
        List<String> uniqueCharacters = Stream
                .of("Hello", "World")
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());
        System.out.println(uniqueCharacters);

        /* Quiz #1
            Given a list of numbers, how would you return a list of the square of each number?
            For example, given [1, 2, 3, 4, 5] you should return [1, 4, 9, 16, 25]
        */
        System.out.println("\nQuiz #1 square numbers\n");
        List<Integer> squares = Stream
                .of(1, 2, 3, 4, 5)
                .map(number -> number * number)
                .collect(toList());
        System.out.println(squares);

        /*        Given two lists of numbers, how would you return all pairs of numbers?
        For example, given a list [1, 2, 3] and a list [3, 4] you should return
        [(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)].
        For simplicity, you can represent a pair as an array with two elements
        */
        System.out.println("\nQuiz #2 number pairs\n");
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5);
        List<Integer> numbers2 = List.of(3, 4);
        List<int[]> pairs = numbers1
                .stream()
                .flatMap(i -> numbers2
                        .stream()
                        .map(j -> new int[]{i, j}))
                .collect(toList());
        System.out.println(pairs);

        System.out.println("\nQuiz #3 number divisible by 3 pairs\n");
        List<Integer> numbers3 = List.of(1, 2, 3, 4, 5);
        List<Integer> numbers4 = List.of(3, 4);
        List<int[]> pairsDivisibleBy3 = numbers3
                .stream()
                .flatMap(i -> numbers4
                        .stream()
                        .filter(j -> (i + j) % 3 == 0)
                        .map(j -> new int[]{i, j}))
                .collect(toList());
        System.out.println(pairsDivisibleBy3);
    }
}
