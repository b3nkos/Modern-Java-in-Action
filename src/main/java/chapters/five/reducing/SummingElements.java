package chapters.five.reducing;

import java.util.Optional;

import static chapters.five.Numbers.numbers;

public class SummingElements {
    public static void main(String[] args) {

        // For each loop
        int foreachSum = 0;
        for (int x : numbers()) {
            foreachSum += x;
        }

        System.out.println("\nThe foreach sum is: " + foreachSum);

        // Using the reduce operation
        int sum = numbers()
                .stream()
                .reduce(0, Integer::sum);

        int product = numbers()
                .stream()
                .reduce(1, (a, b) -> a * b);

        Optional<Integer> optionalSum = numbers()
                .stream()
                .reduce(Integer::sum);
    }
}
