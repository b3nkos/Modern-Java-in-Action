package chapters.two;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.color() == Color.RED && apple.weight() > 150;
    }
}
