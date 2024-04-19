package chapters.five.reducing;

import java.util.Optional;

import static chapters.five.Numbers.numbers;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Optional<Integer> max = numbers()
                .stream()
                .reduce(Integer::max);

        System.out.println(max);

        Optional<Integer> min = numbers()
                .stream()
                .reduce(Integer::min);
        System.out.println(min);
    }
}
