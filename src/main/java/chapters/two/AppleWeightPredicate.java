package chapters.two;

public class AppleWeightPredicate implements ApplePredicate {
  @Override
  public boolean test(Apple apple) {
    return apple.weight() > 150;
  }
}
