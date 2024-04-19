package chapters.five.reducing;

import static chapters.five.Menu.menu;
import static chapters.five.Numbers.numbers;

public class QuizOne {
    public static void main(String[] args) {
        // How would you count the number of dishes in a stream using the map and reduce methods?
        Integer dishCount = menu()
                .stream()
                .map(d -> 1)
                .reduce(0, Integer::sum);
        System.out.println("\nDish count: " + dishCount);

        long count = menu()
                .stream()
                .count();
        System.out.println("\nDish count: " + count);

        System.out.println("\nUsing parallel stream");
        Integer parallelSum = numbers()
                .parallelStream()
                .reduce(0, Integer::sum);
        System.out.println("The sum is: " + parallelSum);
    }
}
