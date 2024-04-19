package chapters.five;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class TraderTransaction {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        System.out.println("\n1. Find all transactions in the year 2011 and sort them by value(small to high)");
        List<Transaction> sortedByYearAndValue = transactions
                .stream()
                .filter(transaction -> transaction.year() == 2011)
                .sorted(comparing(Transaction::value))
                .collect(toList());
        System.out.println(sortedByYearAndValue);

        System.out.println("\n2. What are all the unique cities where the traders work?");
        List<String> tradersUniqueCitiesWork = transactions
                .stream()
                .map(transaction -> transaction.trader().city())
                .distinct()
                .collect(toList());
        System.out.println(tradersUniqueCitiesWork);

        System.out.println("\n3. Find all traders from Cambridge and sort them by name.");
        List<Trader> cambridgeTradersSortedByName = transactions
                .stream()
                .map(Transaction::trader)
                .filter(trader -> trader.city().equalsIgnoreCase("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::name))
                .collect(toList());
        System.out.println(cambridgeTradersSortedByName);

        System.out.println("\n4. Return a string of all traders' names sorted alphabetically.");
        Optional<String> optionalNames = transactions
                .stream()
                .map(transaction -> transaction.trader().name())
                .distinct()
                .sorted()
                .reduce((a, b) -> a + ", " + b);
        optionalNames.ifPresent(System.out::println);

        System.out.println("\n5. Are any traders based in Milan?");
        boolean anyTraderBasedInMilan = transactions
                .stream()
                        .anyMatch(transaction -> transaction.trader().city().equals("Milan"));
        System.out.println(anyTraderBasedInMilan);

        System.out.println("\n6. Print the values of all transactions from the traders living in Cambridge.");
        transactions
                .stream()
                .filter(transaction -> transaction.trader().city().equalsIgnoreCase("Cambridge"))
                .map(Transaction::value)
                .forEach(System.out::println);

        System.out.println("\n7. What's the highest value of all the transactions?");
        Optional<Double> highestValueOfAllTransactions = transactions
                .stream()
                .map(Transaction::value)
                .reduce(Double::max);
        highestValueOfAllTransactions
                .ifPresent(value -> System.out.println("The highest value of all transactions is: " + value));

        System.out.println("\n8. Find the transaction with the smallest value.");
        Optional<Transaction> smallestValueOfAllTransactions = transactions
                .stream()
                .min(comparing(Transaction::value));
        smallestValueOfAllTransactions
                .ifPresent(transaction -> System.out.println("The smallest value of all transactions is: " + transaction.value()));
    }
}

record Trader(String name, String city) {

}

record Transaction(Trader trader, int year, double value) {

}
