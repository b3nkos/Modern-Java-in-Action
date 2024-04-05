package chapters.two;

public class AppleColorPredicate implements ApplePredicate {
  @Override
  public boolean test(Apple apple) {
    return apple.color() == Color.GREEN;
  }
}
